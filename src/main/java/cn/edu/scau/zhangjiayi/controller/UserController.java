package cn.edu.scau.zhangjiayi.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.edu.scau.zhangjiayi.domain.User;
import cn.edu.scau.zhangjiayi.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private String date = df.format(new Date());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userTest")
    @ResponseBody
    public String returnStr() {
        return "hello,即使是中文也可以";
    }

	@RequestMapping("/userExist")
	@ResponseBody
	public String getUserByValue(HttpServletRequest request, HttpServletResponse response, @RequestBody JSONObject obj) throws Exception{
//		String username = (String) request.getSession().getAttribute("username");
//		String username = "admin";
//		String attr = obj.getString("attr");
		String value = URLDecoder.decode(obj.getString("value"),"UTF-8");
		User user = userService.getUserByNameOrIdOrPhone(value);
		Map <String,Object> map = new HashMap<String,Object>();
		if(user == null)
			map.put("status", 0);
		else
			map.put("status", 1);
		map.put("user", user);
		String resultJSON = JSON.toJSONString(map);
//		System.out.println(date + "请求getUserByUsername" + resultJSON);
		return resultJSON;
	}
	
	@RequestMapping("/submitRegister")
	@ResponseBody
	public String register(HttpServletRequest request, HttpServletResponse response, @RequestBody JSONObject obj) throws Exception{
		Map <String,String> map = new HashMap<String,String>();
		System.out.println("UserController register");
		User user = new User();
		user.setUsername(obj.getString("username"));
		user.setIdnumber(obj.getString("idnumber"));
		user.setPhone(obj.getString("phone"));
		user.setPassword(obj.getString("password"));
		user.setGrade("1");
		user.setSex("1");
		int result = userService.addUser(user);
		if(result == 1) {
			map.put("status", "1");
		} else {
			map.put("status", "0");
		}
		String res = JSON.toJSONString(map);
		return res;
	}
	
	@RequestMapping("/submitLogin")
	@ResponseBody
	public String login(HttpServletRequest request, HttpServletResponse response, @RequestBody JSONObject obj) throws Exception{
		System.out.println("Controller login");
		Map <String,Object> map = new HashMap<String,Object>();
		String name = obj.getString("name");
		String pwd = obj.getString("password");
		int result = userService.login(name,pwd);
		map.put("status", result);
		return JSON.toJSONString(map);
	}

	
	
}

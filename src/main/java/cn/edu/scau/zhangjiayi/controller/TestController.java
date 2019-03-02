package cn.edu.scau.zhangjiayi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.scau.zhangjiayi.domain.TestBean;

@Controller
public class TestController {
    @RequestMapping("stringTest")
    @ResponseBody
    public String returnStr() {
        return "hello,��ʹ������Ҳ����";
    }

    @RequestMapping("entityTest")
    @ResponseBody
    public TestBean returnEntify() {
        TestBean testBean = new TestBean();
        testBean.setTeststr("����ʵ��");
        testBean.setTestint(12);
        return testBean;
    }
}

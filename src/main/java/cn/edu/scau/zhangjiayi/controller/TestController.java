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
        return "hello,即使是中文也可以";
    }

    @RequestMapping("entityTest")
    @ResponseBody
    public TestBean returnEntify() {
        TestBean testBean = new TestBean();
        testBean.setTeststr("测试实体");
        testBean.setTestint(12);
        return testBean;
    }
}

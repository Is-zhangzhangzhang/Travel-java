package cn.edu.scau.zhangjiayi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.scau.zhangjiayi.dao.TestBeanMapper;
import cn.edu.scau.zhangjiayi.dao.UserMapper;
import cn.edu.scau.zhangjiayi.domain.TestBean;
import cn.edu.scau.zhangjiayi.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestDao {
    @Autowired
    TestBeanMapper testBeanMapper;
    @Autowired
    UserMapper userMapper;

    @Test
    public void testInsert() {
//    	搭建ssm测试
//        TestBean testBean = new TestBean();
//        testBean.setTeststr("hhhhhhhhhh");
//        testBean.setTestint(222);
//
//        testBeanMapper.insert(testBean);
    	
//    	测试读取user中 根据属性名和值，查找user中对应记录
//    	System.out.println(userMapper.selectByPrimaryKey("admin"));
//    	User user = userMapper.selectByNameOrIdOrPhone("admin");
//       	System.out.println(user.getUsername());
    	
//    	测试注册，插入新的user
    	User user = new User();
    	user.setUsername("test2");
    	user.setPhone("13484516452");
    	user.setIdnumber("440158200812065421");
    	user.setPassword("123456");
    	user.setGrade("1");
    	user.setSex("1");
    	System.out.println(userMapper.insert(user));

    }
}
package cn.edu.scau.zhangjiayi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.scau.zhangjiayi.dao.TestBeanMapper;
import cn.edu.scau.zhangjiayi.domain.TestBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestDao {
    @Autowired
    TestBeanMapper testBeanMapper;

    @Test
    public void testInsert() {
        TestBean testBean = new TestBean();
        testBean.setTeststr("mybatisInsert");
        testBean.setTestint(343);

        testBeanMapper.insert(testBean);

    }
}
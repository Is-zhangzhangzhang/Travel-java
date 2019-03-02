package cn.edu.scau.zhangjiayi.dao;

import cn.edu.scau.zhangjiayi.domain.TestBean;

public interface TestBeanMapper {
    int insert(TestBean record);

    int insertSelective(TestBean record);
}
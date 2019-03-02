package cn.edu.scau.zhangjiayi.dao;

import cn.edu.scau.zhangjiayi.domain.PersonalComment;

public interface PersonalCommentMapper {
    int deleteByPrimaryKey(String id);

    int insert(PersonalComment record);

    int insertSelective(PersonalComment record);

    PersonalComment selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PersonalComment record);

    int updateByPrimaryKey(PersonalComment record);
}
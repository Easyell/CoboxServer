package com.easyell.coboxserver.repositories;

import com.easyell.coboxserver.model.Group_User;

public interface Group_UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Group_User record);

    int insertSelective(Group_User record);

    Group_User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Group_User record);

    int updateByPrimaryKey(Group_User record);
}
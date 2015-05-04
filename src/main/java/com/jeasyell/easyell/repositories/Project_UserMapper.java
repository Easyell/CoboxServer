package com.jeasyell.easyell.repositories;

import com.jeasyell.easyell.model.Project_User;

public interface Project_UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Project_User record);

    int insertSelective(Project_User record);

    Project_User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project_User record);

    int updateByPrimaryKey(Project_User record);
}
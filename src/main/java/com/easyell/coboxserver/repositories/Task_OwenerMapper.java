package com.easyell.coboxserver.repositories;

import com.easyell.coboxserver.model.Task_Owener;

public interface Task_OwenerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Task_Owener record);

    int insertSelective(Task_Owener record);

    Task_Owener selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Task_Owener record);

    int updateByPrimaryKey(Task_Owener record);
}
package com.guard.dao;

import com.guard.pojo.Admin;
import com.guard.pojo.AdminExample;
import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
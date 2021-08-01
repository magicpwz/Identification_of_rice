package com.guard.service;

import com.guard.pojo.Admin;
import com.guard.pojo.AdminExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdminService {
    int deleteByPrimaryKey(Integer mid);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}

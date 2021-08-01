package com.guard.service.impl;

import com.guard.dao.AdminMapper;
import com.guard.pojo.Admin;
import com.guard.pojo.AdminExample;
import com.guard.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceimpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int deleteByPrimaryKey(Integer mid) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        return adminMapper.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return 0;
    }

    @Override
    public List<Admin> selectByExample(AdminExample example) {
        return adminMapper.selectByExample(example);
    }

    @Override
    public Admin selectByPrimaryKey(Integer mid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }
}

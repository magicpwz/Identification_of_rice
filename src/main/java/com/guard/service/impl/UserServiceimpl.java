package com.guard.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guard.dao.UserMapper;
import com.guard.pojo.User;
import com.guard.pojo.UserExample;
import com.guard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired(required = true)
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }
    @Override
    public PageInfo<User> selectAll(Integer start, Integer size) {
        PageHelper.startPage(start,size);
        List<User> list=userMapper.listAll();

        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }
    @Override
    public List<User> selectByExample(UserExample example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public List<User> selectUsers() {
        return userMapper.selectUsers();
    }
}

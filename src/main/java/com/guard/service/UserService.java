package com.guard.service;

import com.github.pagehelper.PageInfo;
import com.guard.pojo.Pest;
import com.guard.pojo.User;
import com.guard.pojo.UserExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);
    PageInfo<User> selectAll(Integer start, Integer size);
    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUsers();
}

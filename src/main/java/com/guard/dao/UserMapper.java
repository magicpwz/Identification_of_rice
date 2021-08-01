package com.guard.dao;

import com.guard.pojo.Pest;
import com.guard.pojo.User;
import com.guard.pojo.UserExample;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);
    List<User> listAll();
    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUsers();
}
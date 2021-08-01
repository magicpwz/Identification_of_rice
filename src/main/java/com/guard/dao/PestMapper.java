package com.guard.dao;

import com.guard.pojo.Pest;
import com.guard.pojo.PestExample;

import java.util.List;

public interface PestMapper {
    int deleteByPrimaryKey(Integer pestid);

    int insert(Pest record);

    int insertSelective(Pest record);

    List<Pest> selectByExample(PestExample example);
    List<Pest> listAll();
    Pest selectByPrimaryKey(Integer pestid);

    int updateByPrimaryKeySelective(Pest record);

    int updateByPrimaryKey(Pest record);
}
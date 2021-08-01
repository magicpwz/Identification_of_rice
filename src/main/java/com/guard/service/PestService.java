package com.guard.service;

import com.github.pagehelper.PageInfo;
import com.guard.pojo.Pest;
import com.guard.pojo.PestExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PestService {
    int deleteByPrimaryKey(Integer pestid);

    int insert(Pest record);

    int insertSelective(Pest record);
    PageInfo<Pest> selectAll(Integer start, Integer size);
    List<Pest> selectByExample(PestExample example);

    Pest selectByPrimaryKey(Integer pestid);

    int updateByPrimaryKeySelective(Pest record);

    int updateByPrimaryKey(Pest record);
}

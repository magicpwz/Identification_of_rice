package com.guard.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guard.dao.PestMapper;

import com.guard.pojo.Pest;

import com.guard.pojo.PestExample;

import com.guard.service.PestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PestServiceimpl implements PestService {

    @Autowired
    private PestMapper pestMapper;

    @Override
    public int deleteByPrimaryKey(Integer pestid) {
        return 0;
    }

    @Override
    public int insert(Pest record) {
        return 0;
    }

    @Override
    public int insertSelective(Pest record) {
        return 0;
    }
    @Override
    public PageInfo<Pest> selectAll(Integer start, Integer size) {
        PageHelper.startPage(start,size);
        List<Pest> list=pestMapper.listAll();

        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }
    @Override
    public List<Pest> selectByExample(PestExample example) {
        return pestMapper.selectByExample(example);
    }

    @Override
    public Pest selectByPrimaryKey(Integer pestid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Pest record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Pest record) {
        return 0;
    }
}

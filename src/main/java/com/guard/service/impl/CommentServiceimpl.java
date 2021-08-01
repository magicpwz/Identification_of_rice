package com.guard.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guard.dao.CommentMapper;
import com.guard.pojo.Comment;
import com.guard.pojo.CommentExample;
import com.guard.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceimpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return commentMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Comment record) {
        return 0;
    }

    @Override
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public List<Comment> selectByExample(CommentExample example) {
        return commentMapper.selectByExample(example);
    }
    @Override
    public PageInfo<Comment> selectAll(Integer start, Integer size) {
        PageHelper.startPage(start,size);
        List<Comment> list=commentMapper.listAll();

        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }
    @Override
    public Comment selectByPrimaryKey(Integer cid) {
        return commentMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Comment record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Comment record) {
        return 0;
    }

    @Override
    public int updateReply(Comment record) {
        return commentMapper.updateReply(record);
    }
}

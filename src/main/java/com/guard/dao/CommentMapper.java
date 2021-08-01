package com.guard.dao;

import com.guard.pojo.Comment;
import com.guard.pojo.CommentExample;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Comment record);

    int insertSelective(Comment record);
    List<Comment> listAll();
    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    int updateReply(Comment record);
}
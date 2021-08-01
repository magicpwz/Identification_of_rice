package com.guard.service;

import com.github.pagehelper.PageInfo;
import com.guard.pojo.Comment;
import com.guard.pojo.CommentExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CommentService {
    int deleteByPrimaryKey(Integer cid);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);
    PageInfo<Comment> selectAll(Integer start, Integer size);
    Comment selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    int updateReply(Comment record);
}

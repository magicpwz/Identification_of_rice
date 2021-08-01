package com.guard.controller;

import com.github.pagehelper.PageInfo;
import com.guard.dao.CommentMapper;
import com.guard.pojo.Comment;
import com.guard.pojo.CommentExample;
import com.guard.pojo.User;
import com.guard.service.CommentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import sun.util.calendar.BaseCalendar;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@SessionAttributes({"comments", "commentsize", "allcomment","list"})
@Controller
public class CommentController {

    @Resource
    private CommentService commentService;
    @Resource
    private CommentMapper commentMapper;
    //用户评论跳转
    @RequestMapping("/user_comments")
    public String Startuser_comments(ModelMap map, HttpServletRequest request) {
        HttpSession session = request.getSession();
        //用户登录成功时
        int uid = -1;
        if (session.getAttribute("sessionuser") != null) {
            User loginuser = (User) session.getAttribute("sessionuser");
            uid = loginuser.getUserid();
            String username = loginuser.getUsername();
            System.out.println(username + "SUCCESS");
        }
        //获取已登录用户的评论列表
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(uid);
        List<Comment> comments = commentService.selectByExample(example);
        map.addAttribute("commentsize", comments.size());
        map.addAttribute("comments", comments);
        return "user_comments";
    }

    //登录用户发表评论
    @RequestMapping("/comment.do")
    public String send_comment(Model map, Comment comment, HttpServletRequest request) {
        HttpSession session = request.getSession();
        //用户登录成功时
        int uid = -1;
        String img = null;
        if (session.getAttribute("sessionuser") != null) {
            User loginuser = (User) session.getAttribute("sessionuser");
            uid = loginuser.getUserid();
            img = loginuser.getUserimg();
            String username = loginuser.getUsername();
            System.out.println(username + "SUCCESS");
        }
        Date date = new Date(System.currentTimeMillis());
        comment.setCtime(date);
        comment.setUserid(uid);
        comment.setHeadimg(img);
        int i = commentService.insertSelective(comment);
        if (i == 1) {
            return "redirect:user_comments";
        } else {
            return "user_comments";
        }
    }

    //管理员后台查看所有评论
    @RequestMapping("/comment-list")
    public String list(Model model,Integer start){
        CommentExample commentExample = new CommentExample();

        int count=5;
        if(start==null){
            start=1;
        }

        int total=commentMapper.selectByExample(commentExample).size();
        int last;
        if(0==total%count){
            last=total/count;
        }else{
            last=total/count+1;
        }
        int pre=start-1;
        int next=start+1;
        pre=pre<0?0:pre;
        next=next>last?last:next;
        PageInfo<Comment> pagelist=commentService.selectAll(start,count);
        List<Comment> list=pagelist.getList();
        model.addAttribute("pre",pre);
        model.addAttribute("next",next);
        model.addAttribute("last",last);
        model.addAttribute("list",list);
        return "comment-list";
    }

    //管理员后台删除用户评论
    @RequestMapping("/delete_comment")
    public String delete_reply(Integer cid){
        int i = commentService.deleteByPrimaryKey(cid);
        if (i == 1){
            return "redirect:comment-list";
        }
        else {
            return null;
        }
    }

    //管理员后台回复用户评论
    @RequestMapping("/reply_comment")
    public String reply_comment(Comment comment,Integer cid){
        comment.setCid(cid);
        int i = commentService.updateReply(comment);
        if (i == 1){
            return "redirect:comment-list";
        }
        else {
            return null;
        }
    }

}

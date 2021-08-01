package com.guard.controller;

import com.guard.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    //欢迎界面跳转
    @RequestMapping("/index")
    public String Startindex() {


        return "index";
    }

    //主界面跳转
    @RequestMapping("/main")
    public String StartMain() {
        return "main";
    }

    @RequestMapping("/history_search")
    public String StartHistory() {
        return "history_search";
    }

    //管理员登录跳转
    @RequestMapping("/admin_login")
    public String Startadmin_login() {
        return "admin_login";
    }

    //用户登录跳转
    @RequestMapping("/user_login")
    public String Startuser_login(HttpServletRequest request) {
        HttpSession session = request.getSession();
        //已登录用户不需要再次登录
        if (session.getAttribute("sessionuser") != null) {
            return "forward:mainindex";
        }
        return "user_login";
    }

    //用户注册跳转
    @RequestMapping("/user_register")
    public String Startregister() {
        return "user_register";
    }

    //模板
    @RequestMapping("/templates")
    public String Starttemplates() {
        return "templates";
    }

    //后台管理员登陆
    @RequestMapping("/admin-login")
    public String Startadmin_login1() {
        return "admin-login";
    }

    //后台管理首页
    @RequestMapping("/management-index")
    public String Startmanagement_index() {
        return "management-index";
    }

    //后台用户添加
    @RequestMapping("/member-add")
    public String Startmember_add() {
        return "member-add";
    }

    //后台用户编辑
    @RequestMapping("/member-edit")
    public String Startmember_edit() {
        return "member-edit";
    }

    //后台用户列表
    //结果
    @RequestMapping("/result")
    public String Result() {
        return "result";
    }

    //后台用户密码
    @RequestMapping("/member-password")
    public String Startmember_password() {
        return "member-password";
    }

    //后台病虫害添加
    @RequestMapping("/pest-add")
    public String Startpest_add() {
        return "pest-add";
    }

    //后台病虫害列表
    @RequestMapping("/mainindex")
    public String Startpest_mainindex() {
        return "img_recognition";
    }


}

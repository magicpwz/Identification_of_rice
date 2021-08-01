package com.guard.controller;

import com.github.pagehelper.PageInfo;
import com.guard.dao.UserMapper;
import com.guard.pojo.User;
import com.guard.pojo.UserExample;
import com.guard.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@SessionAttributes({"userlist", "usere", "msglogin"})
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;

    //用户登录
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(@ModelAttribute(value = "user") User user, ModelMap map, HttpServletRequest request) {
        HttpSession session = request.getSession();
        //已登录用户不需要再次登录
        if (session.getAttribute("sessionuser") != null) {
            return "forward:mainindex";
        }

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andPasswordEqualTo(user.getPassword());
        List<User> userList = userService.selectByExample(userExample);
        //查询并判断是否为空
        if (!userList.isEmpty()) {
            User user0 = userList.get(0);
            //session的创建,在会话变量中保存user
            session.setAttribute("sessionuser", user0);
            session.removeAttribute("msglogin");
            return "forward:mainindex";
        } else {
            String msg = "用户名或密码错误，请重新输入";
            map.addAttribute("msglogin", msg);
            return "redirect:user_login";
        }
    }

    //用户注册
    @RequestMapping(value = "/register.do", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String register(User user) {
        int i = userService.insertSelective(user);
        System.out.println(user);
        if (i == 1) {
            return "user_login";
        } else {
            return null;
        }

    }

    //后台显示用户列表
    @RequestMapping("/member-list")
    public String list(Model model, Integer start) {
        UserExample pestExample = new UserExample();

        int count = 10;
        if (start == null) {
            start = 1;
        }

        int total = userMapper.selectByExample(pestExample).size();
        int last;
        if (0 == total % count) {
            last = total / count;
        } else {
            last = total / count + 1;
        }
        int pre = start - 1;
        int next = start + 1;
        pre = pre < 0 ? 0 : pre;
        next = next > last ? last : next;
        PageInfo<User> pagelist = userService.selectAll(start, count);
        List<User> list = pagelist.getList();
        model.addAttribute("pre", pre);
        model.addAttribute("next", next);
        model.addAttribute("last", last);
        model.addAttribute("userlist", list);
        return "member-list";
    }

    //后台添加新用户
    @RequestMapping(value = "/member-add.do", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public String addUser(User user) {
        int i = userService.insertSelective(user);
        if (i == 1) {
            return "redirect:member-list";
        } else {
            return null;
        }
    }

    //管理员后台注销用户
    @RequestMapping("/deleteuser")
    public String deleteUser(Integer uid) {
        int i = userService.deleteByPrimaryKey(uid);
        if (i == 1) {
            return "redirect:member-list";
        } else {
            return null;
        }
    }

    //用户进入用户中心
    @RequestMapping("/user_center")
    public String Startuser_center() {
        return "user_center";
    }

    //用户信息修改界面跳转
    @RequestMapping("/user_edit")
    public String JumpUser() {
        return "user_edit";
    }

    //用户在用户中心修改个人信息
    @RequestMapping("/update_user_own")
    public String update_user_own(User user, HttpSession session) {
        User loginuser = (User) session.getAttribute("sessionuser");
        user.setUserimg(loginuser.getUserimg());
        user.setUserid(loginuser.getUserid());
        System.out.println(user);
        int i = userService.updateByPrimaryKeySelective(user);
        //信息修改完之后,会话变量中保存的用户需更改

        session.setAttribute("sessionuser", user);

        return "redirect:user_center";
    }

    //用户退出登陆
    @RequestMapping("/user_logout")
    public String user_logout(Model model, HttpSession session) {
        session.removeAttribute("sessionuser");
        return "index";
    }


}

package com.guard.controller;

import com.guard.pojo.Admin;
import com.guard.pojo.AdminExample;
import com.guard.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@SessionAttributes({"admlogin"})
@Controller
public class AdminController {
    @Resource
    private AdminService adminService;

    //管理员登录
    @RequestMapping("/admin_login.do")
    public String adminLogin(Admin admin, ModelMap map, HttpServletRequest request) {

        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(admin.getUsername());
        criteria.andPasswordEqualTo(admin.getPassword());
        List<Admin> admins = adminService.selectByExample(adminExample);
        HttpSession session = request.getSession();

        if (!admins.isEmpty()) {
            session.setAttribute("sessionadmin", admins.get(0));
            session.removeAttribute("admlogin");
            return "management-index";
        } else {
            String msg = "用户名或密码错误，请重新输入";
            map.addAttribute("admlogin", msg);
            return "redirect:admin_login";
        }
    }
}

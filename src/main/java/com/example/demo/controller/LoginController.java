package com.example.demo.controller;


import com.example.demo.dto.Admin;

import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {
    @Autowired
    private AdminService adminService;

    //跳转首页（登录页）
    @RequestMapping("/u/toIndex")
    public String show(){
        return "index";
    }

    //登录操作
    @ResponseBody
    @RequestMapping(value="/loginUser")
    public String login( HttpServletRequest request){
      Integer adminId =Integer.parseInt(request.getParameter("adminId")) ;
      String passWord = request.getParameter("passWord");
        Admin a1 =adminService.login(adminId,passWord);

        if (a1==null){
            return "用户名或密码错误";
        }else{
            request.getSession().setAttribute("session_user",a1);//登录成功后将用户放入session中，用于拦截
            return "登录成功";
        }
    }

    //跳转注册页
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    //注册操作
    @RequestMapping("/register")
    public String register(HttpServletRequest request){
        Admin admin=new Admin();
        admin.setId(Integer.parseInt(request.getParameter("adminId")) );
        admin.setPwd(request.getParameter("passWord"));
        int su = adminService.register(admin);
        if(su==0){
            System.out.println("----");
        }
        return "welcome";
    }

    //测试未登陆拦截页面
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    //退出登录
    @RequestMapping("/outUser")
    public void outUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("session_user");
        response.sendRedirect("/user/toIndex");
    }

}

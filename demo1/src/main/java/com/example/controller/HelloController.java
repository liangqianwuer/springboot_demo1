package com.example.controller;


import com.example.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @ResponseBody @RequestMapping("/login")
    public String toLogin(User user){
        if ("admin".equals(user.getUsername()) && "1234".equals(user.getPassword())){
            return "登录成功";
        } else {
            return "登录失败，用户名或者密码不正确";
        }


    }
}

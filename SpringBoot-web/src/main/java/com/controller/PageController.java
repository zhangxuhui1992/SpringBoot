package com.controller;

import com.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-01 11:12
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    PageService pageService;

    /**
     * @RequestMapping("/login")
     * @return
     */

    @PostMapping("/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password,
                        Map<String,Object> map, HttpSession session){
        if(username.equals("admin") && password.equals("123")){
            //登录成功，防止表单重复提交，可以重定向到其他页面
            session.setAttribute("loginuser", "admin");
            return "redirect:/main";
        }else{
            map.put("message", "用户名或密码错误");
            return "index";
        }

    }

}

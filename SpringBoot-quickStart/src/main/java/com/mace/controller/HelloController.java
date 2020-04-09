package com.mace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-09 20:32
 * 后台控制器
 */
@Controller
public class HelloController {

    @RequestMapping("/qucik/hello")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}

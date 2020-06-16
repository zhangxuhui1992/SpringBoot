package com.controller;

import com.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-15 20:01
 */
@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @RequestMapping("/async/test")
    public String asyncTest(){
        asyncService.sayHello();
        return "success";
    }

}

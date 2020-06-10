package com.mace.contoller;

import com.mace.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-10 16:25
 */
@Controller
@RequestMapping("/hello")
public class exceptionController {

    @RequestMapping("/exce")
    public String toPage(@RequestParam("user") String user){
        if("java".equals(user)){
            throw new MyException();
        }
        return "exception";
    }



}

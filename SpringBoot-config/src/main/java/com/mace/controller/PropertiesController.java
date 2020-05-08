package com.mace.controller;

import com.mace.pojo.City;
import com.mace.pojo.User;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-05-08 16:29
 */
@Controller
@RequestMapping("/pro")
public class PropertiesController {

    @Autowired
    User user;

    //读取配置文件中的信息
    @Value("${mylocalIp}")
    String ip;

    //直接赋值
    @Value("springBootTest")
    String appName;

    @Value("classpath:config/city.json")
    Resource cityResource;

    @Autowired
    City city;


    @RequestMapping("/index")
    @ResponseBody
    public String proIndex(){
        return user.toString()+"---->"+ip+"---->"+appName;
    }

    /**
     * idea try-catch 快捷键 ctrl+alt+t
     * @return
     */
    @RequestMapping("/json")
    @ResponseBody
    public String proJson() {
        String json = "";
        try {
            json  = IOUtils.toString(cityResource.getInputStream(), Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }


    @RequestMapping("/proRES")
    @ResponseBody
    public String proRES(){
        return city.toString();
    }

}

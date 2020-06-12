package com.controller;

import com.bean.Mybatisbean;
import com.mapper.MybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-12 16:20
 */
@RestController
@RequestMapping("/mybatis")
public class MybatisController {

    @Autowired
    MybatisMapper mybatisMapper;

    @RequestMapping("/sel/{id}")
    public Mybatisbean selectByid(@PathVariable("id") Integer id){
        return mybatisMapper.selectByid(id);
    }

    @RequestMapping("/seln/{rname}")
    public Mybatisbean selectByid(@PathVariable("rname") String rname){
        return mybatisMapper.selectByrname(rname);
    }

}

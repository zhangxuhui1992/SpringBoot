package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-12 15:20
 */
@RestController
@RequestMapping("/test")
public class JDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/all")
    public List seletAll(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from role");
        return list;
    }



}

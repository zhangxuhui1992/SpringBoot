package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-09 20:27
 * SpringBootApplication 标注为springboot应用
 */
@SpringBootApplication
public class QuickStart {
    public static void main(String[] args) {
        //springboot项目启动
        SpringApplication.run(QuickStart.class,args);
    }
}

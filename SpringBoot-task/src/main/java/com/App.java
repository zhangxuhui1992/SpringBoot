package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-15 19:59
 * 异步任务
 *    1.开启异步任务支持
 *       在主启动类上添加@EnableAsync
 *    2.方法开启异步
 *       在需要异步的方法上添加注解@Async
 * 定时任务
 *    1.开启定时任务支持
 *      在主启动类上添加@EnableScheduling
 *    2.定时方法
 *      在方法上添加@Scheduled() cron表达式指定时间
 * 邮件任务
 *    1.
 */
@EnableAsync //开启异步支持
@EnableScheduling //开启定时支持
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}


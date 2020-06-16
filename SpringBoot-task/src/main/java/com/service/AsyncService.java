package com.service;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-15 20:01
 */
@Service
public class AsyncService {


    /**
     * 方法异步调用
     * 避免自己写多线程
     */
    @Async
    public void sayHello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");
    }

    /**
     * second minute hour day of month month day of week
     */
    @Scheduled(cron="0 * * * * MON-FRI")
    public void hello(){
        System.out.println("Hello World");
    }

}

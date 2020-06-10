package com.mace.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-10 21:07
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("listener作用，，web启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("listener作用，，web关闭");
    }
}

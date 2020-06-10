package com.mace.myconfig;

import com.mace.filter.MyFilter;
import com.mace.listener.MyListener;
import com.mace.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Arrays;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-10 20:51
 */
@Configuration
public class MyConfig {

    /**
     * 注册servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new MyServlet(), "/myservlet");
    }

    /**
     * 注册filter
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<Filter> filter = new FilterRegistrationBean<>();
        filter.setFilter(new MyFilter());
        filter.addUrlPatterns("/myservlet");
        return filter;
    }

    /**
     * 注册listener
     * @return
     */
    @Bean
     public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        return new ServletListenerRegistrationBean<>(new MyListener());
     }


}

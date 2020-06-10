package com.MyConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * springMVC的扩展
 * 实现WebMvcConfigurer接口，重写方法。
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-01 14:59
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {

    /**
     * 添加拦截器
     * 拦截所有的请求，但是排除掉指定的请求
     * 静态资源已被springboot处理，不需要额外处理。
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/page/login","/","/login");
    }

    /**
     * 添加视图控制器
     * 将所有的/请求,映射到index.html页面.
     * 将所有的/index.html请求,映射到index.html页面.
     * 已配置thymeleaf
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main").setViewName("dashboard");
    }


    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }
}

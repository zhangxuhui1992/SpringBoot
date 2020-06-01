package com.mace.configuration;

import com.mace.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-01 9:09
 * 配置类
 */
@Configuration
public class MySpringBootConfig {

    /**
     * 将方法的返回值添加到容器,容器中这个组件默认的id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }




}

package com.mace.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-05-08 17:25
 *
 * @PropertiesSource加载指定的配置文件（将配置文件中的属性和实体类映射时，加载指定的配置文件。）
 * 对于@PropertySource注解，默认是不支持yml配置文件读取的，需要修改重写才可以
 */
@Data
@PropertySource("classpath:config/city.properties")
@ConfigurationProperties(prefix = "city")
@Component
public class City {

    private String name;

    private String localtion;

    private String flag;
}

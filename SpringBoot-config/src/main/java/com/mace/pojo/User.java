package com.mace.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-05-08 16:06
 * 开启lombok的链式操作
 * @Accessors(chain=true)
 * 映射配置文件中的属性,以指定的prefix进行匹配
 * @ConfigurationProperties(prefix = "user")
 * 只有容器中的组件才能使用使用容器提供的功能
 * @Component
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
@Component
@ConfigurationProperties(prefix = "user")
public class User {

    private String name;
    private Integer id;
    private Integer age;
    private String address;
}

package com.xiaomi.hello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xiaomi
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@PropertySource(value = "classpath:user.properties")
public class User {
    //直接使用@value
    @Value("${user.name}")
    private String name;
    @Value("#{9*2}")  // #{SPEL} Spring表达式
    private Integer age;
    @Value("男")  // 字面量
    private String sex;
}

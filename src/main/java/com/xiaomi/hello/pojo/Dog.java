package com.xiaomi.hello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xiaomi
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    @Value("阿黄")
    private String name;
    @Value("11")
    private Integer age;
}

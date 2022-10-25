package com.lspring.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix="test")
@PropertySource("classpath:test.properties")
@Component

/**
 * 自定义配置文件Bean
 * @author Lovsog
 * @date 2022/10/25 21:28
 */
public class TestConfigBean {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}


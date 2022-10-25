package com.lspring.demo;

import com.lspring.demo.bean.ConfigBean;
import com.lspring.demo.bean.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class, TestConfigBean.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        // 命令行中是否可以修改项目配置
        // app.setAddCommandLineProperties(false);
        app.run(args);
    }
}

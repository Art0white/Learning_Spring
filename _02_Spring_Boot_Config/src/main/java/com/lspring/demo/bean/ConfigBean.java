package com.lspring.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件Bean
 * @author Lovsog
 * @date 2022/10/25 21:29
 */
@ConfigurationProperties(prefix="lovsog.blog")
public class ConfigBean {

    private String name;

    private String title;

    private String wholeTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWholeTitle() {
        return wholeTitle;
    }

    public void setWholeTitle(String wholeTitle) {
        this.wholeTitle = wholeTitle;
    }
}
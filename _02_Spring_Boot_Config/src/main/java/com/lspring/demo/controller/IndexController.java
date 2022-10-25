package com.lspring.demo.controller;

import com.lspring.demo.bean.BlogProperties;
import com.lspring.demo.bean.ConfigBean;
import com.lspring.demo.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private ConfigBean configBean;
    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/")
    String index() {
        // return blogProperties.getName() + "——" + blogProperties.getTitle();
        return testConfigBean.getName() + "——" + testConfigBean.getAge();
    }
}

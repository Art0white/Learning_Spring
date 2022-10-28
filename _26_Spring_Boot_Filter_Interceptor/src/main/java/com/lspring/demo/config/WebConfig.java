package com.lspring.demo.config;

import com.lspring.demo.filter.TimeFilter1;
import com.lspring.demo.filter.TimeFilter2;
import com.lspring.demo.interceptor.TimeInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * Filter1号, 优先级1
     * @author Lovsog
     * @date 2022/10/28 14:29
     */
    @Bean
    public FilterRegistrationBean timeFilter1() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        TimeFilter1 timeFilter = new TimeFilter1();
        filterRegistrationBean.setFilter(timeFilter);
        filterRegistrationBean.setOrder(1);

        List<String> urlList = new ArrayList<>();
        urlList.add("/*");

        filterRegistrationBean.setUrlPatterns(urlList);
        return filterRegistrationBean;
    }

    /**
     * Filter2号, 优先级2
     * @author Lovsog
     * @date 2022/10/28 14:29
     */
    @Bean
    public FilterRegistrationBean timeFilter2() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        TimeFilter2 timeFilter = new TimeFilter2();
        filterRegistrationBean.setFilter(timeFilter);
        filterRegistrationBean.setOrder(2);

        List<String> urlList = new ArrayList<>();
        urlList.add("/*");

        filterRegistrationBean.setUrlPatterns(urlList);
        return filterRegistrationBean;
    }

    TimeInterceptor timeInterceptor = new TimeInterceptor();

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeInterceptor);
    }
}

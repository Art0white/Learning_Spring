package com.lspring.demo.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

//@Component
//@WebFilter(urlPatterns = {"/*"})
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("#####过滤器初始化#####");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("######开始过滤######");
        long start = new Date().getTime();
        chain.doFilter(request, response);
        System.out.println("过滤获得: " + request.getServerName() + request.getServerPort());
        System.out.println("过滤器耗时:" + (new Date().getTime() - start));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("#####销毁过滤器######");
    }
}

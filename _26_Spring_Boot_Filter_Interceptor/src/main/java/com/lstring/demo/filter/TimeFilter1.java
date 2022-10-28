package com.lstring.demo.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

//@Component
//@WebFilter(urlPatterns = {"/*"})
public class TimeFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("#####过滤器1初始化#####");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("######开始过滤1######");
        long start = new Date().getTime();
        chain.doFilter(request, response);
        System.out.println("过滤获得1: " + request.getServerName() + request.getServerPort());
        System.out.println("过滤器耗时1:" + (new Date().getTime() - start));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("#####销毁过滤器1######");
    }
}

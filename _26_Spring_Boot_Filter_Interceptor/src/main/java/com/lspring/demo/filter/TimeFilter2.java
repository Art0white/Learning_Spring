package com.lspring.demo.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

//@Component
//@WebFilter(urlPatterns = {"/*"})
public class TimeFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("#####过滤器2初始化#####");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("######开始过滤2######");
        long start = new Date().getTime();
        chain.doFilter(request, response);
        System.out.println("过滤获得2: " + request.getServerName() + request.getServerPort());
        System.out.println("过滤器耗时2:" + (new Date().getTime() - start));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("#####销毁过滤器2######");
    }
}

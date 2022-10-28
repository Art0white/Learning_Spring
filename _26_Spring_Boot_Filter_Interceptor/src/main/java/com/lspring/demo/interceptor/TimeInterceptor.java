package com.lspring.demo.interceptor;


import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class TimeInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("#####拦截处理之前#####");
        request.setAttribute("startTime", new Date().getTime());
        System.out.println(((HandlerMethod) handler).getBean().getClass().getName());
        System.out.println(((HandlerMethod) handler).getMethod().getName());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("######开始拦截######");
        long start = (long)request.getAttribute("startTime");
        System.out.println("拦截器耗时: " + (new Date().getTime() - start));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("#####处理拦截之后#####");
        long start = (long)request.getAttribute("startTime");
        System.out.println("拦截器耗时: " + (new Date().getTime() - start));
        System.out.println("拦截异常" + ex);
    }
}

package com.lkk.fifter.demo.fifter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName AuthFifter
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/15/9:34
 * @Version 1.0
 **/
@Component
public class AuthFifter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String name = request.getHeader("name");
        System.out.println("进入的用户姓名:" + name);
        if (name.equals("xiaoming")) {
            filterChain.doFilter(request, servletResponse);
        } else {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.setCharacterEncoding("UTF-8");
            String string = "{\"400\":\"没有权限\"}";
            PrintWriter printWriter = response.getWriter();
            printWriter.write(string);
        }
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁了！！！");
    }
}

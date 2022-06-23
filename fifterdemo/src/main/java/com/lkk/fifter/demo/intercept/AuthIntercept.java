package com.lkk.fifter.demo.intercept;

import com.lkk.fifter.demo.annotation.AuthAnnotation;
import com.lkk.fifter.demo.enums.AuthEnum;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @ClassName AuthIntercept
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/15/11:03
 * @Version 1.0
 **/
@Component
public class AuthIntercept extends HandlerInterceptorAdapter {

    /**
     * This implementation always returns {@code true}.
     *
     * @param request
     * @param response
     * @param handler
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入拦截器");
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        AuthAnnotation annotation = handlerMethod.getMethod().getAnnotation(AuthAnnotation.class);
        if (annotation == null) {
            return true;
        } else {
            AuthEnum value = annotation.value();
            if (value.getCode().equals("200")) {
                return true;
            }
            return false;
        }
    }
}

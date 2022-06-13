package com.lkk.annotation.demo.comments;

import com.lkk.annotation.demo.annotation.AuthAnnatation;
import com.lkk.annotation.demo.eunm.AuthEnum;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


/**
 * @ClassName AuthInterceptor
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/13/9:26
 * @Version 1.0
 **/
@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {

    /**
     * This implementation always returns {@code true}.
     *
     * @param request
     * @param response
     * @param handler
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        AuthAnnatation authAnn = ((HandlerMethod) handler).getMethodAnnotation(AuthAnnatation.class);
        if (authAnn == null && ObjectUtils.isEmpty(authAnn.value())) {
            authAnn = ((HandlerMethod) handler).getBeanType().getAnnotation(AuthAnnatation.class);
        }
        if (authAnn == null && ObjectUtils.isEmpty(authAnn.value())) {
            return true;
        }
        AuthEnum[] values = authAnn.value();
        for (AuthEnum value : values) {
            if (value.getCode().equals("201")) {
                response.setContentType("appliaction/json");
                response.setCharacterEncoding("UTF-8");
                PrintWriter printWriter = response.getWriter();
                printWriter.write("{\"201\":\"注解生效\"}");
                return false;
            }
        }
        return true;
    }
}

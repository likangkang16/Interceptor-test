package com.lkk.annotation.demo.comments;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AuthAutwo
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/13/11:09
 * @Version 1.0
 **/
@Configuration
public class AuthAutwo implements WebMvcConfigurer {

    /**
     * 定义一个list集合存储需要拦截的路径(/**--表示所有的都拦截，包括静态资源的数据)
     */
    static  List<String> addPathList =new ArrayList<>();
    static {
        addPathList.add("/test/*");
    }

    /**
     * 定义一个list集合存储不需要拦截的路径-过滤掉静态资源下的路径
     */
    static  List<String> excludePathList =new ArrayList<>();
    static {
        excludePathList.add("/resources/*");
    }

    /**
     * Add Spring MVC lifecycle interceptors for pre- and post-processing of
     * controller method invocations and resource handler requests.
     * Interceptors can be registered to apply to all requests or be limited
     * to a subset of URL patterns.
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor())
                .addPathPatterns(addPathList)
                .excludePathPatterns(excludePathList);
    }
}

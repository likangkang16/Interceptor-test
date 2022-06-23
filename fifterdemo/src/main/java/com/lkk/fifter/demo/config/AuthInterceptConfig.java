package com.lkk.fifter.demo.config;
import com.lkk.fifter.demo.intercept.AuthIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import static com.lkk.fifter.demo.until.PathUntis.addList;
import static com.lkk.fifter.demo.until.PathUntis.excuList;


/**
 * @ClassName AuthInterceptConfig
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/15/11:18
 * @Version 1.0
 **/
@Configuration
public class AuthInterceptConfig implements WebMvcConfigurer {


    @Autowired
    private AuthIntercept authIntercept;

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
        registry.addInterceptor(authIntercept).addPathPatterns(addList).excludePathPatterns(excuList);
    }

}

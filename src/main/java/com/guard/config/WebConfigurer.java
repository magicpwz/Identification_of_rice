package com.guard.config;

import com.guard.config.interceptor.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new Interceptor());
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        registration.excludePathPatterns(                         //添加不拦截路径
                "/index",                //首页
                "/mainindex",            //登录
                "/**/*.html",            //html静态资源
                "/**/*.png",            //png静态资源
                "/**/*.jpg",            //jpg静态资源
                "/**/*.js",              //js静态资源
                "/**/*.css",             //css静态资源
                "/**/*.woff",
                "/**/*.ttf",
                "/user_login",
                "/user_register",
                "/admin_login",
                "/login.do",
                "/register.do",
                "/main",
                "/upload",
                "getUploadProgress",
                "uploadPage",
                "/pest_find",
                "/result",
                "/pest_dict",
                "/pest_detail",
                "/pest_select",
                "/admin_login.do",
                "pest_kind"
        );
    }
}
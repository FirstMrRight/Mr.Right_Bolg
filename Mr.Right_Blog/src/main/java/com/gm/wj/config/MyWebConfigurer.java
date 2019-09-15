package com.gm.wj.config;

import com.gm.wj.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootConfiguration

/*
后端拦截器步骤：

* 拦截器会先在Config判断一下是否需要拦截
* 需要才会触发拦截器LoginInterceptor
*
*在前后分离的项目中不推荐这样做，可以在前端使用拦截
*
* */
public class MyWebConfigurer implements WebMvcConfigurer {

    @Bean
    public LoginInterceptor getLoginIntercepter() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //所有路径都设置拦截器，除了index.html
        registry.addInterceptor(getLoginIntercepter()).addPathPatterns("/**").excludePathPatterns("/index.html");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //所有请求都允许跨域
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/file/**").addResourceLocations("file:" + "d:/workspace/img/");
    }

}

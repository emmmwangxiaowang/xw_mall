package com.wang.xw_mall.config;

import com.wang.xw_mall.Intercepter.CheckTokenIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/25
 */

@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

    @Resource
    private CheckTokenIntercepter checkTokenIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(checkTokenIntercepter)
                .addPathPatterns("/shopping-cart/**") // 首先资源
                .addPathPatterns("/orders/**");
                // .excludePathPatterns("/swagger**") // 排除 非受限资源

    }
}

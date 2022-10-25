package com.wang.xw_mall.config;

import io.swagger.models.Swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/10
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /*
    * swagger 会生成接口文档
    * 1. 配置文档信息
    * 2. 配置生成规则
    *
    * docket:
    * 封装接口文档信息
    * */


    @Bean
    public Docket getDocket(){

        // 指定生成文档的封面信息: 文档标题,版本,作者

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        ApiInfo apiInfo = apiInfoBuilder.title("<<xw商城>>后端接口说明")
                .description("此文档详尽的描述了xw商城后端接口规范")
                .version("1.0.1")
                .contact(new Contact("xw", "wangxiaowang.club", "954544828@qq.com"))
                .build();


        // 指定文档风格
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wang.xw_mall.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}

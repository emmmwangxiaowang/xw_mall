package com.wang.xw_mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/8
 */
@SpringBootApplication
@MapperScan("com/wang/xw_mall/mapper")
public class ApiApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(ApiApplication.class,args);
    }
}

package com.wang.xw_mall.utils;


import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/25
 */
public class Base64Util {
    public static String encode(String msg){
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }

    public static String decode(String msg){
        return new String(Base64.getDecoder().decode(msg));
    }
}

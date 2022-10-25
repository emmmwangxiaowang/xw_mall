package com.wang.xw_mall.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/11
 */
public class MD5Util {
    public static String md5(String password){
        // 生成一个 md5 加密器
        try{
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            return new BigInteger(1,md5.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }
}

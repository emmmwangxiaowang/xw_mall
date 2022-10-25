package com.wang.xw_mall.mapper;

import com.wang.xw_mall.pojo.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户  Mapper 接口
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
public interface  UserMapper extends BaseMapper<Users> {

    // 用户注册
    int registUser(Users users);

    // 根据用户名查询用户信息
    Users queryUserByName(String name);
}

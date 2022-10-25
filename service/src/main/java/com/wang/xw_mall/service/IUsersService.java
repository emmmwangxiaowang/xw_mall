package com.wang.xw_mall.service;

import com.wang.xw_mall.pojo.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.xw_mall.vo.ResultVo;

/**
 * <p>
 * 用户  服务类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
public interface IUsersService extends IService<Users> {

    //用户注册
    public ResultVo userRegist(String name, String password);

    public ResultVo checkLogin(String name, String password);
}

package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.pojo.UserLoginHistory;
import com.wang.xw_mall.mapper.UserLoginHistoryMapper;
import com.wang.xw_mall.service.IUserLoginHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录历史表  服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@Service
public class UserLoginHistoryServiceImpl extends ServiceImpl<UserLoginHistoryMapper, UserLoginHistory> implements IUserLoginHistoryService {

}

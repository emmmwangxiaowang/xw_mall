package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.pojo.Users;
import com.wang.xw_mall.mapper.UserMapper;
import com.wang.xw_mall.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.xw_mall.utils.MD5Util;
import com.wang.xw_mall.vo.ResStatus;
import com.wang.xw_mall.vo.ResultVo;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户  服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UserMapper, Users> implements IUsersService {
    @Resource
    private UserMapper userMapper;


    @Override
    @Transactional
    public ResultVo userRegist(String name, String password) {
        // mysql 事务默认隔离级别为 可重复读, 对其它操作需要加锁
        synchronized (this){
            // 1. 根据用户名字查询这个用户是否注册
            // QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
            // QueryWrapper<Users> userQueryWrapper = queryWrapper.eq("username", name);
            // Users users = userMapper.selectOne(userQueryWrapper);
            // System.out.println(users+"==============");
            Users users = userMapper.queryUserByName(name);
            // QueryWrapper<Users> wrapper = Wrappers.emptyWrapper();
            // wrapper.eq("username",name);
            // userMapper.selectList(wrapper).forEach(System.out::println);


            if(users ==null){
                String md5Pwd = MD5Util.md5(password);
                users = new Users();
                users.setUsername(name);
                users.setPassword(md5Pwd);
                users.setUserImg("img/default.png");
                users.setUserRegtime(LocalDateTime.now());
                users.setUserModtime(LocalDateTime.now());
                // int i = userMapper.registUser(users);
                int i = userMapper.insert(users);

                if(i>0){
                    users.setPassword(null);
                    return new ResultVo(1000,"注册成功",users);
                }else{
                    return new ResultVo(1002,"注册失败",null);
                }

            }else{
                return new ResultVo(1001,"用户名已经被注册",null);
            }
        }

    }

    @Override
    public ResultVo checkLogin(String name, String password) {
        //1. 根据账号查询用户信息
        Users users = userMapper.queryUserByName(name);

        //2. 判断
        if(users == null){
            // 用户名不存在
            return new ResultVo(1001,"用户名不存在",null);
        }else{
            //3.对输入的 密码 进行加密
            String md5Pwd = MD5Util.md5(password);
            // 使用加密后的密码 和 users 中的密码进行匹配
            if(users.getPassword().equals(md5Pwd)){
                // 登录成功, 则需要生成 token 令牌传递给前端
                // 使用 jwt 生成 token 令牌
                JwtBuilder builder = Jwts.builder();

                Map<String, Object > map = new HashMap<>();
                map.put("key1","value1");
                map.put("key2","value2");
                String token = builder.setSubject(users.getNickname())
                        .setIssuedAt(new Date()) // 设置 token 生成时间  -- 过期校验用
                        .setId(users.getUserId() + "") // 设置用户id 为 token id
                        .setClaims(map) // 自定义数据 -- payload
                        .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000 * 7)) // token 过期时间
                        .signWith(SignatureAlgorithm.HS256, "wangxiaowang") // 设置算法进行签名
                        .compact();

                users.setPassword(null);

                return new ResultVo(ResStatus.OK,token, users);
            }else{
                //密码错误
                return new ResultVo(ResStatus.NO,"密码错误",null);
            }
        }
    }
}

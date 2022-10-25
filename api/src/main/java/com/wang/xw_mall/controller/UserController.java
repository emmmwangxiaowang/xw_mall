package com.wang.xw_mall.controller;


import com.wang.xw_mall.service.IUsersService;
import com.wang.xw_mall.utils.Base64Util;
import com.wang.xw_mall.vo.ResultVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * <p>
 * 用户  前端控制器
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Resource
    private IUsersService usersService;


    @ApiOperation(value = "用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "username",value = "用户登录账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password",value = "用户登录密码",required = true)
    })

    @GetMapping("/login")
    public ResultVo login(@RequestParam("username") String name, @RequestParam(value = "password") String password){
        ResultVo resultVo = usersService.checkLogin(name, password);


        return resultVo;
    }


    @ApiOperation("用户注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "username",value = "用户注册账号",required = true),
            @ApiImplicitParam(dataType = "string",name = "password",value = "用户注册密码",required = true)
    })
    @PostMapping("/regist")
    public ResultVo regist(@RequestParam("username") String userName,@RequestParam(value = "password") String password){

        return usersService.userRegist(userName, password);
    }
}

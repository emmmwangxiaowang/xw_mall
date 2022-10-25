package com.wang.xw_mall.controller;


import com.wang.xw_mall.service.IShoppingCartService;
import com.wang.xw_mall.utils.Base64Util;
import com.wang.xw_mall.vo.ResStatus;
import com.wang.xw_mall.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 购物车  前端控制器
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@RestController
@RequestMapping("/shopping-cart")
@CrossOrigin("*")
@Api(value = "提供购物车业务相关接口",tags = "购物车管理")
public class ShoppingCartController {

    @Resource
    IShoppingCartService shoppingCartService;

    @ApiOperation(value = "获取购物车接口")
    @ApiImplicitParam(dataType = "string",name = "token",value = "授权令牌",required = true)
    @GetMapping("/list")
    public ResultVo listCarts(@RequestHeader("token")String token) {

        if (token == null) {
            return new ResultVo(ResStatus.NO, "请先登录", null);
        } else {
            if (Base64Util.decode(token).endsWith("wangxiaowang")) {
                return new ResultVo(ResStatus.OK, "SUCCESS", null);
            }else{
                return new ResultVo(ResStatus.NO, "token已过期,请重新登录", null);
            }
        }

    }


}

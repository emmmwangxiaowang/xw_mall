package com.wang.xw_mall.controller;


import com.wang.xw_mall.service.IShoppingCartService;
import com.wang.xw_mall.vo.ResStatus;
import com.wang.xw_mall.vo.ResultVo;
import io.jsonwebtoken.*;
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

        // 原始token 只用对信息进行编码 发送给前端,前端每次请求 携带token 后台解码校验.
        // if (token == null) {
        //     return new ResultVo(ResStatus.NO, "请先登录", null);
        // } else {
        //     if (Base64Util.decode(token).endsWith("wangxiaowang")) {
        //         return new ResultVo(ResStatus.OK, "SUCCESS", null);
        //     }else{
        //         return new ResultVo(ResStatus.NO, "token已过期,请重新登录", null);
        //     }
        // }

        if (token == null) {
            return new ResultVo(ResStatus.NO, "请先登录", null);
        }else{
            // 验证 token
            JwtParser parser = Jwts.parser();
            parser.setSigningKey("wangxiaowang"); // 设置的签名必须一致

            try {
                Jws<Claims> claimsJws = parser.parseClaimsJws(token); // 解析 token
                System.out.println(claimsJws);
                if(((Integer) claimsJws.getBody().get("exp") -System.currentTimeMillis())<0){
                    return new ResultVo(ResStatus.NO, "token已过期,请重新登录", null);
                }
                return new ResultVo(ResStatus.OK, "SUCCESS", null);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return new ResultVo(ResStatus.NO, "签名失效,请重新登录", null);
            }

        }

    }


}

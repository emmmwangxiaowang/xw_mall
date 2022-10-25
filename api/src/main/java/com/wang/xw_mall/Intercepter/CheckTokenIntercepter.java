package com.wang.xw_mall.Intercepter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wang.xw_mall.vo.ResStatus;
import com.wang.xw_mall.vo.ResultVo;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/25
 */

@Component
public class CheckTokenIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 当发生预检请求的时候 直接返回 true -- 表示支持跨域
        if("OPTIONS".equals(request.getMethod()))
            return true;

        String token = request.getHeader("token");

        System.out.println("===>token"+token);
        if (token == null) {
            ResultVo result = new ResultVo(ResStatus.NO, "请先登录", null);
            doResponse(response,result);
            return false;
        }else{
            // 验证 token
            JwtParser parser = Jwts.parser();
            parser.setSigningKey("wangxiaowang"); // 设置的签名必须一致
            try {
                Jws<Claims> claimsJws = parser.parseClaimsJws(token); // 解析 token
                return true;
            } catch (ExpiredJwtException e) {
                ResultVo result = new ResultVo(ResStatus.NO, "登录过期,请重新登录", null);
                doResponse(response,result);
                return false;
            } catch (UnsupportedJwtException | IllegalArgumentException | SignatureException | MalformedJwtException  e) {
                ResultVo result = new ResultVo(ResStatus.NO, "token不合法", null);
                doResponse(response,result);
                return false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                ResultVo result = new ResultVo(ResStatus.NO, "请重新登录", null);
                doResponse(response,result);
                return false;
            }


        }
    }

    private void doResponse(HttpServletResponse response,ResultVo result) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.print(new ObjectMapper().writeValueAsString(result));
        out.flush();
        out.close();
    }


}

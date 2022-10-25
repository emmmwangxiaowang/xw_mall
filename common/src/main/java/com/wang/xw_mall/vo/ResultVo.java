package com.wang.xw_mall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/8
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
// 说明对象的作用
@ApiModel(value = "响应的VO对象",description = "封装接口返回给前端的数据")
public class ResultVo {

    // 响应给前端的状态码
    @ApiModelProperty(value = "状态码")
    private int code;
    // 接口返回信息
    @ApiModelProperty(value = "响应提示信息")
    private String message;
    // 相应给前端的数据
    @ApiModelProperty("响应数据")
    private Object data;
}

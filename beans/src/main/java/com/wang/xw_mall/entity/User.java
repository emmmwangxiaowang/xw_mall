package com.wang.xw_mall.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User对象",description = "用户信息")
@TableName(value="users")
public class User {

    @ApiModelProperty(dataType = "int")
    private int userId;
    @ApiModelProperty(value = "用户名",dataType = "string",required = true)
    private String userName;
    @ApiModelProperty(value = "用户密码",dataType = "string",required = true)
    private String password;
    @ApiModelProperty(value = "用户昵称",dataType = "string")
    private String nickName;
    @ApiModelProperty(value = "用户真实姓名",dataType = "string")
    private String realName;
    @ApiModelProperty(value = "头像url",dataType = "string")
    private String userImg;
    @ApiModelProperty(value = "用户手机号",dataType = "string")
    private String userMobile;
    @ApiModelProperty(value = "用户邮箱",dataType = "string")
    private String userEmail;
    @ApiModelProperty(value = "用户性别",dataType = "string")
    private String userSex;
    @ApiModelProperty(value = "用户出生日期",dataType = "date")
    private Date userBirth;
    @ApiModelProperty(value = "用户注册日期",dataType = "date")
    private Date userRegtime;
    @ApiModelProperty(value = "用户更新日期",dataType = "date")
    private Date userModTime;
}

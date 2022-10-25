package com.wang.xw_mall.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Users对象", description="用户 ")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id 用户id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty(value = "用户名 用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "密码 密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "昵称 昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty(value = "真实姓名 真实姓名")
    @TableField("realname")
    private String realname;

    @ApiModelProperty(value = "头像 头像")
    @TableField("user_img")
    private String userImg;

    @ApiModelProperty(value = "手机号 手机号")
    @TableField("user_mobile")
    private String userMobile;

    @ApiModelProperty(value = "邮箱地址 邮箱地址")
    @TableField("user_email")
    private String userEmail;

    @ApiModelProperty(value = "性别 M(男) or F(女)")
    @TableField("user_sex")
    private String userSex;

    @ApiModelProperty(value = "生日 生日")
    @TableField("user_birth")
    private LocalDate userBirth;

    @ApiModelProperty(value = "注册时间 创建时间")
    @TableField("user_regtime")
    private LocalDateTime userRegtime;

    @ApiModelProperty(value = "更新时间 更新时间")
    @TableField("user_modtime")
    private LocalDateTime userModtime;


}

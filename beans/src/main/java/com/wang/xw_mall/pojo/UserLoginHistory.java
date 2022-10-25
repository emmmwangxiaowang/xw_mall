package com.wang.xw_mall.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 登录历史表 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserLoginHistory对象", description="登录历史表 ")
public class UserLoginHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "地区")
    @TableField("AREA")
    private String area;

    @ApiModelProperty(value = "国家")
    @TableField("COUNTRY")
    private String country;

    @ApiModelProperty(value = "用户id")
    @TableField("USER_ID")
    private String userId;

    @ApiModelProperty(value = "IP")
    @TableField("IP")
    private String ip;

    @ApiModelProperty(value = "时间")
    @TableField("LOGIN_TIME")
    private String loginTime;


}

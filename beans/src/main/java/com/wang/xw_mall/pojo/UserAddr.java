package com.wang.xw_mall.pojo;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户地址 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserAddr对象", description="用户地址 ")
public class UserAddr implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "地址主键id")
    @TableId("addr_id")
    private String addrId;

    @ApiModelProperty(value = "用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty(value = "收件人姓名")
    @TableField("receiver_name")
    private String receiverName;

    @ApiModelProperty(value = "收件人手机号")
    @TableField("receiver_mobile")
    private String receiverMobile;

    @ApiModelProperty(value = "省份")
    @TableField("province")
    private String province;

    @ApiModelProperty(value = "城市")
    @TableField("city")
    private String city;

    @ApiModelProperty(value = "区县")
    @TableField("area")
    private String area;

    @ApiModelProperty(value = "详细地址")
    @TableField("addr")
    private String addr;

    @ApiModelProperty(value = "邮编")
    @TableField("post_code")
    private String postCode;

    @ApiModelProperty(value = "状态,1正常，0无效")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "是否默认地址 1是 1:是  0:否")
    @TableField("common_addr")
    private Integer commonAddr;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;


}

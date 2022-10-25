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
 * 商品参数 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProductParams对象", description="商品参数 ")
public class ProductParams implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品参数id")
    @TableId("param_id")
    private String paramId;

    @ApiModelProperty(value = "商品id")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty(value = "产地 产地，例：中国江苏")
    @TableField("product_place")
    private String productPlace;

    @ApiModelProperty(value = "保质期 保质期，例：180天")
    @TableField("foot_period")
    private String footPeriod;

    @ApiModelProperty(value = "品牌名 品牌名，例：三只大灰狼")
    @TableField("brand")
    private String brand;

    @ApiModelProperty(value = "生产厂名 生产厂名，例：大灰狼工厂")
    @TableField("factory_name")
    private String factoryName;

    @ApiModelProperty(value = "生产厂址 生产厂址，例：大灰狼生产基地")
    @TableField("factory_address")
    private String factoryAddress;

    @ApiModelProperty(value = "包装方式 包装方式，例：袋装")
    @TableField("packaging_method")
    private String packagingMethod;

    @ApiModelProperty(value = "规格重量 规格重量，例：35g")
    @TableField("weight")
    private String weight;

    @ApiModelProperty(value = "存储方法 存储方法，例：常温5~25°")
    @TableField("storage_method")
    private String storageMethod;

    @ApiModelProperty(value = "食用方式 食用方式，例：开袋即食")
    @TableField("eat_method")
    private String eatMethod;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;


}

package com.wang.xw_mall.pojo;

import java.math.BigDecimal;
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
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProductSku对象", description="商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计")
public class ProductSku implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "sku编号")
    @TableId("sku_id")
    private String skuId;

    @ApiModelProperty(value = "商品id")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty(value = "sku名称")
    @TableField("sku_name")
    private String skuName;

    @ApiModelProperty(value = "sku图片")
    @TableField("sku_img")
    private String skuImg;

    @ApiModelProperty(value = "属性组合（格式是p1:v1;p2:v2）")
    @TableField("untitled")
    private String untitled;

    @ApiModelProperty(value = "原价")
    @TableField("original_price")
    private Integer originalPrice;

    @ApiModelProperty(value = "销售价格")
    @TableField("sell_price")
    private Integer sellPrice;

    @ApiModelProperty(value = "折扣力度")
    @TableField("discounts")
    private BigDecimal discounts;

    @ApiModelProperty(value = "库存")
    @TableField("stock")
    private Integer stock;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "sku状态(1启用，0禁用，-1删除)")
    @TableField("status")
    private Integer status;


}

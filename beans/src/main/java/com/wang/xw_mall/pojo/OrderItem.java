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
 * 订单项/快照 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="OrderItem对象", description="订单项/快照 ")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单项ID")
    @TableId("item_id")
    private String itemId;

    @ApiModelProperty(value = "订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty(value = "商品ID")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty(value = "商品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty(value = "商品图片")
    @TableField("product_img")
    private String productImg;

    @ApiModelProperty(value = "skuID")
    @TableField("sku_id")
    private String skuId;

    @ApiModelProperty(value = "sku名称")
    @TableField("sku_name")
    private String skuName;

    @ApiModelProperty(value = "商品价格")
    @TableField("product_price")
    private BigDecimal productPrice;

    @ApiModelProperty(value = "购买数量")
    @TableField("buy_counts")
    private Integer buyCounts;

    @ApiModelProperty(value = "商品总金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "加入购物车时间")
    @TableField("basket_date")
    private LocalDateTime basketDate;

    @ApiModelProperty(value = "购买时间")
    @TableField("buy_time")
    private LocalDateTime buyTime;

    @ApiModelProperty(value = "评论状态： 0 未评价  1 已评价")
    @TableField("is_comment")
    private Integer isComment;


}

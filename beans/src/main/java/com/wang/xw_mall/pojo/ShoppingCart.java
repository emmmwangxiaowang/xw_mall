package com.wang.xw_mall.pojo;

import java.math.BigDecimal;
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
 * 购物车 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ShoppingCart对象", description="购物车 ")
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cartId;

    @ApiModelProperty(value = "商品ID")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty(value = "skuID")
    @TableField("sku_id")
    private String skuId;

    @ApiModelProperty(value = "用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty(value = "购物车商品数量")
    @TableField("cart_num")
    private String cartNum;

    @ApiModelProperty(value = "添加购物车时间")
    @TableField("cart_time")
    private String cartTime;

    @ApiModelProperty(value = "添加购物车时商品价格")
    @TableField("product_price")
    private BigDecimal productPrice;

    @ApiModelProperty(value = "选择的套餐的属性")
    @TableField("sku_props")
    private String skuProps;


}

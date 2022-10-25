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
 * 订单 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Orders对象", description="订单 ")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单ID 同时也是订单编号")
    @TableId("order_id")
    private String orderId;

    @ApiModelProperty(value = "用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty(value = "产品名称（多个产品用,隔开）")
    @TableField("untitled")
    private String untitled;

    @ApiModelProperty(value = "收货人快照")
    @TableField("receiver_name")
    private String receiverName;

    @ApiModelProperty(value = "收货人手机号快照")
    @TableField("receiver_mobile")
    private String receiverMobile;

    @ApiModelProperty(value = "收货地址快照")
    @TableField("receiver_address")
    private String receiverAddress;

    @ApiModelProperty(value = "订单总价格")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "实际支付总价格")
    @TableField("actual_amount")
    private Integer actualAmount;

    @ApiModelProperty(value = "支付方式 1:微信 2:支付宝")
    @TableField("pay_type")
    private Integer payType;

    @ApiModelProperty(value = "订单备注")
    @TableField("order_remark")
    private String orderRemark;

    @ApiModelProperty(value = "订单状态 1:待付款 2:待发货 3:待收货 4:待评价 5:已完成 6:已关闭")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "配送方式")
    @TableField("delivery_type")
    private String deliveryType;

    @ApiModelProperty(value = "物流单号")
    @TableField("delivery_flow_id")
    private String deliveryFlowId;

    @ApiModelProperty(value = "订单运费 默认可以为零，代表包邮")
    @TableField("order_freight")
    private BigDecimal orderFreight;

    @ApiModelProperty(value = "逻辑删除状态 1: 删除 0:未删除")
    @TableField("delete_status")
    private Integer deleteStatus;

    @ApiModelProperty(value = "创建时间（成交时间）")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "付款时间")
    @TableField("pay_time")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "发货时间")
    @TableField("delivery_time")
    private LocalDateTime deliveryTime;

    @ApiModelProperty(value = "完成时间")
    @TableField("flish_time")
    private LocalDateTime flishTime;

    @ApiModelProperty(value = "取消时间")
    @TableField("cancel_time")
    private LocalDateTime cancelTime;

    @ApiModelProperty(value = "订单关闭类型1-超时未支付 2-退款关闭 4-买家取消 15-已通过货到付款交易")
    @TableField("close_type")
    private Integer closeType;


}

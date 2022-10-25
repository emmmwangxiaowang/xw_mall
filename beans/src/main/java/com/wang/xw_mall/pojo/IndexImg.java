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
 * 轮播图 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="IndexImg对象", description="轮播图 ")
public class IndexImg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("img_id")
    private String imgId;

    @ApiModelProperty(value = "图片 图片地址")
    @TableField("img_url")
    private String imgUrl;

    @ApiModelProperty(value = "背景色 背景颜色")
    @TableField("img_bg_color")
    private String imgBgColor;

    @ApiModelProperty(value = "商品id 商品id")
    @TableField("prod_id")
    private String prodId;

    @ApiModelProperty(value = "商品分类id 商品分类id")
    @TableField("category_id")
    private String categoryId;

    @ApiModelProperty(value = "轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类")
    @TableField("index_type")
    private Integer indexType;

    @ApiModelProperty(value = "轮播图展示顺序 轮播图展示顺序，从小到大")
    @TableField("seq")
    private Integer seq;

    @ApiModelProperty(value = "是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "创建时间 创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间 更新")
    @TableField("update_time")
    private LocalDateTime updateTime;


}

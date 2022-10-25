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
 * 商品图片 
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProductImg对象", description="商品图片 ")
public class ProductImg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图片主键")
    @TableId("id")
    private String id;

    @ApiModelProperty(value = "商品外键id 商品外键id")
    @TableField("item_id")
    private String itemId;

    @ApiModelProperty(value = "图片地址 图片地址")
    @TableField("url")
    private String url;

    @ApiModelProperty(value = "顺序 图片顺序，从小到大")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty(value = "是否主图 是否主图，1：是，0：否")
    @TableField("is_main")
    private Integer isMain;

    @ApiModelProperty(value = "创建时间")
    @TableField("created_time")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("updated_time")
    private LocalDateTime updatedTime;


}

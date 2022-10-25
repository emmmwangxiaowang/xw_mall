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
 * 商品分类
 * </p>
 *
 * @author wang
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Category对象", description="商品分类")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键 分类id主键")
    @TableId(value = "category_id", type = IdType.AUTO)
    private Integer categoryId;

    @ApiModelProperty(value = "分类名称 分类名称")
    @TableField("category_name")
    private String categoryName;

    @ApiModelProperty(value = "分类层级 分类得类型，1:一级大分类 2:二级分类 3:三级小分类")
    @TableField("category_level")
    private Integer categoryLevel;

    @ApiModelProperty(value = "父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级")
    @TableField("parent_id")
    private Integer parentId;

    @ApiModelProperty(value = "图标 logo")
    @TableField("category_icon")
    private String categoryIcon;

    @ApiModelProperty(value = "口号")
    @TableField("category_slogan")
    private String categorySlogan;

    @ApiModelProperty(value = "分类图")
    @TableField("category_pic")
    private String categoryPic;

    @ApiModelProperty(value = "背景颜色")
    @TableField("category_bg_color")
    private String categoryBgColor;


}

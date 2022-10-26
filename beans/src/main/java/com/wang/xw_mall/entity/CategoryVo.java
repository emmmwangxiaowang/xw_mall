package com.wang.xw_mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wang.xw_mall.pojo.Category;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/26
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CategoryVo {

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

    private List<Category> children;
}

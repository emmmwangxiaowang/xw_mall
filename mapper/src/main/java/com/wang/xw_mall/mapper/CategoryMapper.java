package com.wang.xw_mall.mapper;

import com.wang.xw_mall.pojo.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wang.xw_mall.entity.CategoryVo;
import java.util.List;

/**
 * <p>
 * 商品分类 Mapper 接口
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
public interface CategoryMapper extends BaseMapper<Category> {

    // 使用连接查询实现多级联查
    public List<CategoryVo> queryAllCategoriesByJoin();

    // 使用子查询实现多级联查
    public List<CategoryVo> queryAllCategoriesByIn(int parentId);

}

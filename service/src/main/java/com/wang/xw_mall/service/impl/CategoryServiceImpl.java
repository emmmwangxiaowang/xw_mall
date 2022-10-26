package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.entity.CategoryVo;
import com.wang.xw_mall.pojo.Category;
import com.wang.xw_mall.mapper.CategoryMapper;
import com.wang.xw_mall.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.xw_mall.vo.ResStatus;
import com.wang.xw_mall.vo.ResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 商品分类 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Resource
    CategoryMapper categoryMapper;

    @Override
    public ResultVo queryAllCategories(int categoryId) {
        List<CategoryVo> categories = categoryMapper.queryAllCategoriesByIn(categoryId);

        return new ResultVo(ResStatus.OK,"SUCCESS",categories) ;
    }
}

package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.pojo.Category;
import com.wang.xw_mall.mapper.CategoryMapper;
import com.wang.xw_mall.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}

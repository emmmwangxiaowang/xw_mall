package com.wang.xw_mall.service;

import com.wang.xw_mall.entity.CategoryVo;
import com.wang.xw_mall.pojo.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.xw_mall.vo.ResultVo;

import java.util.List;

/**
 * <p>
 * 商品分类 服务类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
public interface ICategoryService extends IService<Category> {

    public ResultVo queryAllCategories(int categoryId);

}

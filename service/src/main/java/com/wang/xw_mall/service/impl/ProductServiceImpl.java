package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.pojo.Product;
import com.wang.xw_mall.mapper.ProductMapper;
import com.wang.xw_mall.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}

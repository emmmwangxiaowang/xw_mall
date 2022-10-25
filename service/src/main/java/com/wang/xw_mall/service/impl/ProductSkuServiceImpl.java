package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.pojo.ProductSku;
import com.wang.xw_mall.mapper.ProductSkuMapper;
import com.wang.xw_mall.service.IProductSkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@Service
public class ProductSkuServiceImpl extends ServiceImpl<ProductSkuMapper, ProductSku> implements IProductSkuService {

}

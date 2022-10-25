package com.wang.xw_mall.mapper;

import com.wang.xw_mall.pojo.ProductSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 Mapper 接口
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
public interface ProductSkuMapper extends BaseMapper<ProductSku> {

}

package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.pojo.Orders;
import com.wang.xw_mall.mapper.OrdersMapper;
import com.wang.xw_mall.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单  服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}

package com.wang.xw_mall.service.impl;

import com.wang.xw_mall.pojo.OrderItem;
import com.wang.xw_mall.mapper.OrderItemMapper;
import com.wang.xw_mall.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项/快照  服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-10-11
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}

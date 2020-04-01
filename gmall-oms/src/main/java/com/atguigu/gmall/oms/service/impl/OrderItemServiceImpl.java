package com.atguigu.gmall.oms.service.impl;

import com.atguigu.mall.oms.entity.OrderItem;
import com.atguigu.mall.oms.mapper.OrderItemMapper;
import com.atguigu.mall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-31
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}

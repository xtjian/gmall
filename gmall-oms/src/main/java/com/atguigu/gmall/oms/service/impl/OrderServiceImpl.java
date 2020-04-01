package com.atguigu.gmall.oms.service.impl;

import com.atguigu.mall.oms.entity.Order;
import com.atguigu.mall.oms.mapper.OrderMapper;
import com.atguigu.mall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-31
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}

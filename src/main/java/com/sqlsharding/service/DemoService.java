package com.sqlsharding.service;

import com.sqlsharding.entity.Order;
import com.sqlsharding.entity.OrderItem;
import com.sqlsharding.repository.OrderItemRepository;
import com.sqlsharding.repository.OrderRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class DemoService {

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private OrderItemRepository orderItemRepository;

    public String insert(Integer userId) {
        Order order = new Order();
        order.setUserId(userId);
        order.setStatus("INSERT_TEST");
        orderRepository.insert(order);

        long orderId = order.getOrderId();
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(orderId);
        orderItem.setUserId(userId);
        orderItem.setStatus("INSERT_TEST");
        this.orderItemRepository.insert(orderItem);

        return orderId + "|" + orderItem.getOrderItemId();
    }
}

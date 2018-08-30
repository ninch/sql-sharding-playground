package com.sqlsharding.repository;

import com.sqlsharding.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemRepository {
    Long insert(OrderItem model);
}

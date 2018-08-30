package com.sqlsharding.repository;

import com.sqlsharding.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderRepository {

    Long insert(Order model);

}

package com.sebastianrod.hackatoonapisebastian.interfaces;

import com.sebastianrod.hackatoonapisebastian.models.OrderStatus;

import java.util.Collection;

public interface OrderStatusInterface {

    Collection<OrderStatus> getAll();
    OrderStatus getById(Integer id);
    OrderStatus create(OrderStatus orderStatus);
    OrderStatus update(Integer id, OrderStatus orderStatus);
    OrderStatus delete(Integer id);

}

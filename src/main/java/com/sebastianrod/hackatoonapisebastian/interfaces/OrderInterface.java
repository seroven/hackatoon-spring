package com.sebastianrod.hackatoonapisebastian.interfaces;

import com.sebastianrod.hackatoonapisebastian.models.Order;
import com.sebastianrod.hackatoonapisebastian.models.custom.OrderWithProduct;

import java.util.Collection;

public interface OrderInterface {

    Collection<Order> getAll();
    Order getById(Integer id);
    OrderWithProduct create(OrderWithProduct order);
    Order update(Integer id, Order order);
    Order delete(Integer id);

}

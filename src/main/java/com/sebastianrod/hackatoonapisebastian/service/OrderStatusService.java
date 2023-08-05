package com.sebastianrod.hackatoonapisebastian.service;

import com.sebastianrod.hackatoonapisebastian.interfaces.OrderStatusInterface;
import com.sebastianrod.hackatoonapisebastian.models.OrderStatus;
import com.sebastianrod.hackatoonapisebastian.repository.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrderStatusService implements OrderStatusInterface {

    @Autowired
    public OrderStatusRepository repository;

    @Override
    public Collection<OrderStatus> getAll() {
        return repository.findByEnableTrue();
    }

    @Override
    public OrderStatus getById(Integer id) {
        try {
            return repository.findByIdEnable(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public OrderStatus create(OrderStatus orderStatus) {
        return repository.save(orderStatus);
    }

    @Override
    public OrderStatus update(Integer id, OrderStatus orderStatus) {
        orderStatus.setId(id);
        return repository.save(orderStatus);
    }

    @Override
    public OrderStatus delete(Integer id) {
        OrderStatus orderStatus = this.getById(id);
        orderStatus.setEnable(false);
        return repository.save(orderStatus);
    }

}

package com.sebastianrod.hackatoonapisebastian.service;

import com.sebastianrod.hackatoonapisebastian.interfaces.OrderProductInterface;
import com.sebastianrod.hackatoonapisebastian.interfaces.ProductInterface;
import com.sebastianrod.hackatoonapisebastian.models.OrderProduct;
import com.sebastianrod.hackatoonapisebastian.repository.AuthRepository;
import com.sebastianrod.hackatoonapisebastian.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProductService implements OrderProductInterface {

    @Autowired
    public OrderProductRepository repository;

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return repository.save(orderProduct);
    }
}

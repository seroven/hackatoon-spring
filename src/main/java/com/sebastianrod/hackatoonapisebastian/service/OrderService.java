package com.sebastianrod.hackatoonapisebastian.service;

import com.sebastianrod.hackatoonapisebastian.interfaces.OrderInterface;
import com.sebastianrod.hackatoonapisebastian.models.Category;
import com.sebastianrod.hackatoonapisebastian.models.Order;
import com.sebastianrod.hackatoonapisebastian.models.OrderProduct;
import com.sebastianrod.hackatoonapisebastian.models.Product;
import com.sebastianrod.hackatoonapisebastian.models.custom.OrderWithProduct;
import com.sebastianrod.hackatoonapisebastian.repository.CategoryRepository;
import com.sebastianrod.hackatoonapisebastian.repository.OrderProductRepository;
import com.sebastianrod.hackatoonapisebastian.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class OrderService implements OrderInterface {

    @Autowired
    public OrderRepository repository;

    @Autowired
    public OrderProductRepository orderProductRepository;

    @Override
    public Collection<Order> getAll() {
        return repository.findByEnableTrue();
    }

    @Override
    public Order getById(Integer id) {
        try {
            return repository.findByIdEnable(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public OrderWithProduct create(OrderWithProduct order) {
        Order orderSaved = repository.save(order.getOrder());

        order.setOrder(orderSaved);

        for(Product product : order.getProducts()) {
            OrderProduct orderProduct = new OrderProduct(0, product, order.getOrder());
            orderProductRepository.save(orderProduct);
        }

        return order;
    }

    @Override
    public Order update(Integer id, Order order) {
        order.setId(id);
        return repository.save(order);
    }

    @Override
    public Order delete(Integer id) {

        Order order = this.getById(id);
        order.setEnable(false);
        return repository.save(order);
    }

}

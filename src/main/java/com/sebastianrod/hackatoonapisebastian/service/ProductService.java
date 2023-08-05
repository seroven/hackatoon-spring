package com.sebastianrod.hackatoonapisebastian.service;

import com.sebastianrod.hackatoonapisebastian.interfaces.ProductInterface;
import com.sebastianrod.hackatoonapisebastian.models.Client;
import com.sebastianrod.hackatoonapisebastian.models.Product;
import com.sebastianrod.hackatoonapisebastian.repository.ClientRepository;
import com.sebastianrod.hackatoonapisebastian.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService implements ProductInterface {

    @Autowired
    public ProductRepository repository;

    @Override
    public Collection<Product> getAll() {
        return repository.findByEnableTrue();
    }

    @Override
    public Product getById(Integer id) {
        try {
            return repository.findByIdEnable(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Product create(Product product) {
        return repository.save(product);
    }

    @Override
    public Product update(Integer id, Product product) {
        product.setId(id);
        return repository.save(product);
    }

    @Override
    public Product delete(Integer id) {

        Product product = this.getById(id);
        product.setEnable(false);
        return repository.save(product);
    }

}

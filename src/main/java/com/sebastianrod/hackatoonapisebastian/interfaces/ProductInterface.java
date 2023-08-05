package com.sebastianrod.hackatoonapisebastian.interfaces;

import com.sebastianrod.hackatoonapisebastian.models.Product;

import java.util.Collection;

public interface ProductInterface {

    Collection<Product> getAll();
    Product getById(Integer id);
    Product create(Product product);
    Product update(Integer id, Product product);
    Product delete(Integer id);

}

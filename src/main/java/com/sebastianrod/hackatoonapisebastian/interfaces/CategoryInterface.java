package com.sebastianrod.hackatoonapisebastian.interfaces;

import com.sebastianrod.hackatoonapisebastian.models.Category;

import java.util.Collection;
import java.util.List;

public interface CategoryInterface {

    Collection<Category> getAll();
    Category getById(Integer id);
    Category create(Category category);
    Category update(Integer id, Category category);
    Category delete(Integer id);

}

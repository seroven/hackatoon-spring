package com.sebastianrod.hackatoonapisebastian.service;

import com.sebastianrod.hackatoonapisebastian.interfaces.CategoryInterface;
import com.sebastianrod.hackatoonapisebastian.models.Category;
import com.sebastianrod.hackatoonapisebastian.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CategoryService implements CategoryInterface {

    @Autowired
    public CategoryRepository repository;

    @Override
    public Collection<Category> getAll() {
        return repository.findByEnableTrue();
    }

    @Override
    public Category getById(Integer id) {
        try {
            return repository.findByIdEnable(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Category create(Category category) {
        return repository.save(category);
    }

    @Override
    public Category update(Integer id, Category category) {
        category.setId(id);
        return repository.save(category);
    }

    @Override
    public Category delete(Integer id) {

        Category category = this.getById(id);
        category.setEnable(false);
        return repository.save(category);
    }


}

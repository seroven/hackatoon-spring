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
        return repository.findAll();
    }
}

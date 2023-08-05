package com.sebastianrod.hackatoonapisebastian.rest;

import com.sebastianrod.hackatoonapisebastian.models.Category;
import com.sebastianrod.hackatoonapisebastian.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@RequestMapping(path = "/category")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping(path = "/all")
    public Collection<Category> getAll(){
        return service.getAll();
    }


}

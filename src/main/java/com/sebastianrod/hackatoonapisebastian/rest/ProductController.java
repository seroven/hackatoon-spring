package com.sebastianrod.hackatoonapisebastian.rest;

import com.sebastianrod.hackatoonapisebastian.models.Product;
import com.sebastianrod.hackatoonapisebastian.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/product")
public class ProductController{

    @Autowired
    private ProductService service;

    @GetMapping(path = "/all")
    public Collection<Product> getAll(){
        return service.getAll();
    }

    @GetMapping(path = "/id/{id}")
    public ResponseEntity<Product> getById(@PathVariable Integer id){
        try {
            Product product = service.getById(id);
            if (product != null) {
                return new ResponseEntity<>(product, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = "create")
    public ResponseEntity<Product> create(@RequestBody Product product){
        try {
            return new ResponseEntity<>(service.create(product), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(path = "update/{id}")
    public ResponseEntity<Product> update(@RequestBody Product product, Integer id){
        try {
            Product productInDb = service.getById(id);
            if (productInDb != null) {
                return new ResponseEntity<>(service.update(id, product), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseEntity<Product> delete(Integer id){
        try {
            Product product = service.getById(id);
            if (product != null) {
                return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}

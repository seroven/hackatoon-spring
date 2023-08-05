package com.sebastianrod.hackatoonapisebastian.rest;

import com.sebastianrod.hackatoonapisebastian.models.Category;
import com.sebastianrod.hackatoonapisebastian.models.OrderStatus;
import com.sebastianrod.hackatoonapisebastian.service.CategoryService;
import com.sebastianrod.hackatoonapisebastian.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "/orderstatus")
public class OrderStatusController {

    @Autowired
    private OrderStatusService service;

    @GetMapping(path = "/all")
    public Collection<OrderStatus> getAll(){
        return service.getAll();
    }

    @GetMapping(path = "/id/{id}")
    public ResponseEntity<OrderStatus> getById(@PathVariable Integer id){
        try {
            OrderStatus orderStatus = service.getById(id);
            if (orderStatus != null) {
                return new ResponseEntity<>(orderStatus, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = "create")
    public ResponseEntity<OrderStatus> create(@RequestBody OrderStatus OrderStatus){
        try {
            return new ResponseEntity<>(service.create(OrderStatus), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping(path = "update/{id}")
    public ResponseEntity<OrderStatus> update(@RequestBody OrderStatus orderStatus, Integer id){
        try {
            OrderStatus orderStatusInDb = service.getById(id);
            if (orderStatusInDb != null) {
                return new ResponseEntity<>(service.update(id, orderStatus), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(path = "delete/{id}")
    public ResponseEntity<OrderStatus> delete(Integer id){
        try {
            OrderStatus orderStatus = service.getById(id);
            if (orderStatus != null) {
                return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}

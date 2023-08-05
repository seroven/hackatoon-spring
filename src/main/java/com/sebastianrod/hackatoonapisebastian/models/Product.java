package com.sebastianrod.hackatoonapisebastian.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Builder
@Entity(name = "products")
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private String image;

    private double price;
    private double discount;
    private Boolean enable;

    @ManyToOne()
    @JoinColumn(name = "idcategory")
    private Category category;



//    @ManyToMany(mappedBy = "products",fetch = FetchType.LAZY)
//    @JsonBackReference
//    private Set<Order> orders;

}

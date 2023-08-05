package com.sebastianrod.hackatoonapisebastian.models;

import jakarta.persistence.*;
import lombok.*;

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


}

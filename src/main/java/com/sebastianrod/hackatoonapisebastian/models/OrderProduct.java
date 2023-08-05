package com.sebastianrod.hackatoonapisebastian.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity(name = "order_product")
@Table(name = "order_product")
@NoArgsConstructor
@AllArgsConstructor
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "idproduct")
    private Product product;

    @ManyToOne()
    @JoinColumn(name = "idorder")
    private Order order;

}

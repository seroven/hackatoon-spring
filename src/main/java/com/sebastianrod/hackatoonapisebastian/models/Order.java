package com.sebastianrod.hackatoonapisebastian.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity(name = "orders")
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    private double igv;
    private double subtotal;
    private double total;
    @ManyToOne()
    @JoinColumn(name = "idclient")
    private Client client;
    @ManyToOne()
    @JoinColumn(name = "idstatus")
    private OrderStatus orderStatus;

    @ManyToMany
    @JoinTable(
            name = "order_product",
            joinColumns = {
                    @JoinColumn(name = "idorder")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "idproduct")
            }
    )
    private List<Product> products;


    private Boolean enable;


}

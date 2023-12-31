package com.sebastianrod.hackatoonapisebastian.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

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

//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "order_product",
//            joinColumns = {
//                    @JoinColumn(name = "idorder", referencedColumnName = "id")
//            },
//            inverseJoinColumns = {
//                    @JoinColumn(name = "idproduct", referencedColumnName = "id")
//            }
//    )
//    @JsonManagedReference
//    private Set<Product> products;


    private Boolean enable;


}

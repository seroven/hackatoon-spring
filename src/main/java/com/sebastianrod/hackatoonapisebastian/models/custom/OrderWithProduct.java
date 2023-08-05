package com.sebastianrod.hackatoonapisebastian.models.custom;

import com.sebastianrod.hackatoonapisebastian.models.Client;
import com.sebastianrod.hackatoonapisebastian.models.Order;
import com.sebastianrod.hackatoonapisebastian.models.OrderStatus;
import com.sebastianrod.hackatoonapisebastian.models.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderWithProduct {

    private Order order;

    private Collection<Product> products;

}

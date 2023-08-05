package com.sebastianrod.hackatoonapisebastian.repository;

import com.sebastianrod.hackatoonapisebastian.models.Category;
import com.sebastianrod.hackatoonapisebastian.models.Client;
import com.sebastianrod.hackatoonapisebastian.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    Collection<Order> findByEnableTrue();

    @Query(value = "SELECT * FROM orders WHERE enable = 1 AND id = :id", nativeQuery = true)
    Optional<Order> findByIdEnable(@Param(value = "id") Integer id);


}

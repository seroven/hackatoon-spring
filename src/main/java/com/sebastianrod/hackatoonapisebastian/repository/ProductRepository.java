package com.sebastianrod.hackatoonapisebastian.repository;

import com.sebastianrod.hackatoonapisebastian.models.Category;
import com.sebastianrod.hackatoonapisebastian.models.Client;
import com.sebastianrod.hackatoonapisebastian.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Collection<Product> findByEnableTrue();

    @Query(value = "SELECT * FROM products WHERE enable = 1 AND id = :id", nativeQuery = true)
    Optional<Product> findByIdEnable(@Param(value = "id") Integer id);


}

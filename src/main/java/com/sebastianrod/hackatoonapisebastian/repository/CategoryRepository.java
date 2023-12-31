package com.sebastianrod.hackatoonapisebastian.repository;

import com.sebastianrod.hackatoonapisebastian.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Collection<Category> findByEnableTrue();

    @Query(value = "SELECT * FROM categories WHERE enable = 1 AND id = :id", nativeQuery = true)
    Optional<Category> findByIdEnable(@Param(value = "id") Integer id);

}

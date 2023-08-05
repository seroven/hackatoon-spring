package com.sebastianrod.hackatoonapisebastian.repository;

import com.sebastianrod.hackatoonapisebastian.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

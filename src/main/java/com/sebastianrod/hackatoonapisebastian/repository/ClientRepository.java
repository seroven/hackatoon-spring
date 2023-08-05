package com.sebastianrod.hackatoonapisebastian.repository;

import com.sebastianrod.hackatoonapisebastian.models.Category;
import com.sebastianrod.hackatoonapisebastian.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Collection<Client> findByEnableTrue();

    @Query(value = "SELECT * FROM clients WHERE enable = 1 AND id = :id", nativeQuery = true)
    Optional<Client> findByIdEnable(@Param(value = "id") Integer id);


}

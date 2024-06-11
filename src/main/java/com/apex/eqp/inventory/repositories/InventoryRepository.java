package com.apex.eqp.inventory.repositories;

import com.apex.eqp.inventory.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InventoryRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p where p.name NOT IN (SELECT name FROM RecalledProduct)")
    List<Product> getAllActiveProducts();
}

package com.apex.eqp.inventory.repositories;

import com.apex.eqp.inventory.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepositoryCustom {
    List<Product> getAllActiveProducts();
}

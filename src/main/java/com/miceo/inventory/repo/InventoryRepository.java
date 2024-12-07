package com.miceo.inventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miceo.inventory.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long>{
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
}

package com.inventory.repository;

import com.inventory.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SalesRepository extends JpaRepository<Sales, Long> {

    List<Sales> findByProductId(Long productId);
}

package com.grid.catalog.repositories;

import com.grid.catalog.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Optional<Product> findByUniqId(String uniq_id);

    List<Product> findBySku(String sku);

}

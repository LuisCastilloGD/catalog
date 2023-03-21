package com.grid.catalog.services;

import org.springframework.stereotype.Service;
import com.grid.catalog.models.Product;

import java.util.List;

@Service
public interface CatalogService {

    Product getProductByUnique_Id(String unique_id);

    List<Product> getProductsBySku(String sku);

}

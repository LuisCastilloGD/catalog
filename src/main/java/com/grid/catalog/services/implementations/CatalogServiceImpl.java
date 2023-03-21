package com.grid.catalog.services.implementations;

import com.grid.catalog.exceptions.ProductNotFoundedException;
import com.grid.catalog.models.Product;
import com.grid.catalog.repositories.ProductRepository;
import com.grid.catalog.services.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private final ProductRepository productRepository;

    @Override
    public Product getProductByUnique_Id(final String unique_id) {
        return productRepository.findByUniqId(unique_id)
                             .orElseThrow(ProductNotFoundedException::new);
    }

    @Override
    public List<Product> getProductsBySku(final String sku) {
        return productRepository.findBySku(sku)
                                .stream()
                                .toList();

    }
}

package com.testauto.testauto.services;

import com.testauto.testauto.repositories.ProductsRepo;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    private final ProductsRepo productsRepo;

    public ProductsService(ProductsRepo productsRepo) {
        this.productsRepo = productsRepo;
    }
}

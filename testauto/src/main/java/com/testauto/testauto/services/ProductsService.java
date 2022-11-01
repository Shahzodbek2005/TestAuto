package com.testauto.testauto.services;

import com.testauto.testauto.models.Products;
import com.testauto.testauto.repositories.ProductsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private final ProductsRepo productsRepo;

    public ProductsService(ProductsRepo productsRepo) {
        this.productsRepo = productsRepo;
    }

    public Products createProduct(Integer productCode, String name){
        Products products = new Products();
        products.setProductCode(productCode);
        products.setName(name);
        productsRepo.save(products);
        return products;
    }

    public List<Products> getAllProducts(){
      return  productsRepo.findAll();
    }

    public List<Products> getProduct(Integer productCode){
        return productsRepo.findByProductCode(productCode);
    }
}

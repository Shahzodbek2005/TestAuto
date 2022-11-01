package com.testauto.testauto.controllers;

import com.testauto.testauto.models.Products;
import com.testauto.testauto.services.ProductsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @PostMapping("create")
    public ResponseEntity<Products> createProduct(@RequestParam("productCode") Integer productCode, @RequestParam("productName") String productName) {
        return ResponseEntity.ok(productsService.createProduct(productCode, productName));
    }

    @GetMapping("allProducts")
    public ResponseEntity<List<Products>> getAllProducts(){
        return ResponseEntity.ok(productsService.getAllProducts());
    }

    @GetMapping("product")
    public ResponseEntity<Products> getProduct(@RequestParam Integer productCode){
        return ResponseEntity.ok(productsService.getProduct(productCode));
    }
}

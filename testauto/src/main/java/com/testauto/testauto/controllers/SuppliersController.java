package com.testauto.testauto.controllers;

import com.testauto.testauto.services.SupplierService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/suppliers")
public class SuppliersController {
    private final SupplierService supplierService;

    public SuppliersController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }
}

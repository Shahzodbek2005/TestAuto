package com.testauto.testauto.services;

import com.testauto.testauto.repositories.SupplierRepo;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    private final SupplierRepo supplierRepo;

    public SupplierService(SupplierRepo supplierRepo) {
        this.supplierRepo = supplierRepo;
    }
}

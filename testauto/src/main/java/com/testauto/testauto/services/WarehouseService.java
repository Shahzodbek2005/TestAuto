package com.testauto.testauto.services;

import com.testauto.testauto.repositories.WarehouseRepo;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
    private final WarehouseRepo warehouseRepo;

    public WarehouseService(WarehouseRepo warehouseRepo) {
        this.warehouseRepo = warehouseRepo;
    }
}

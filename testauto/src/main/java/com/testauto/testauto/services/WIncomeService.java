package com.testauto.testauto.services;

import com.testauto.testauto.repositories.WIncomeRepo;
import org.springframework.stereotype.Service;

@Service
public class WIncomeService {

    private final WIncomeRepo wIncomeRepo;

    public WIncomeService(WIncomeRepo wIncomeRepo) {
        this.wIncomeRepo = wIncomeRepo;
    }
}

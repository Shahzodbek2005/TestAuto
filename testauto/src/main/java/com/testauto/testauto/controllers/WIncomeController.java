package com.testauto.testauto.controllers;

import com.testauto.testauto.services.WIncomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wincome")
public class WIncomeController {
    private final WIncomeService wIncomeService;

    public WIncomeController(WIncomeService wIncomeService) {
        this.wIncomeService = wIncomeService;
    }
}

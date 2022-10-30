package com.testauto.testauto.services;

import com.testauto.testauto.repositories.CountriesRepo;
import org.springframework.stereotype.Service;

@Service
public class CountriesService {
    private  final CountriesRepo countriesRepo;

    public CountriesService(CountriesRepo countriesRepo) {
        this.countriesRepo = countriesRepo;
    }
}

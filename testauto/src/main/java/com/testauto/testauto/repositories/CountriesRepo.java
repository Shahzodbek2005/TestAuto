package com.testauto.testauto.repositories;

import com.testauto.testauto.models.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepo extends JpaRepository<Countries , Long> {
}

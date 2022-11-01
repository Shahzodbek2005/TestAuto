package com.testauto.testauto.repositories;

import com.testauto.testauto.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Products , Long> {
    Products findByProductCode(Integer productCode);
}

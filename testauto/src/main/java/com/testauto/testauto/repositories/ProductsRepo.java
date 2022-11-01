package com.testauto.testauto.repositories;

import com.testauto.testauto.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepo extends JpaRepository<Products , Long> {
    @Query(value = "select * from products where product_code like  :productCode%", nativeQuery = true)
    List<Products> findByProductCode(Integer productCode);
}

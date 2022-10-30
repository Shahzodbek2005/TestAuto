package com.testauto.testauto.repositories;

import com.testauto.testauto.models.WIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WIncomeRepo extends JpaRepository<WIncome, Long> {
}

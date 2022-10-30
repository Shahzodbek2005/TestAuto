package com.testauto.testauto.repositories;

import com.testauto.testauto.models.Documents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsRepo extends JpaRepository<Documents, Long> {
}

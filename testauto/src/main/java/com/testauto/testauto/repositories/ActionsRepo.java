package com.testauto.testauto.repositories;

import com.testauto.testauto.models.Actions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionsRepo extends JpaRepository<Actions, Long> {
}

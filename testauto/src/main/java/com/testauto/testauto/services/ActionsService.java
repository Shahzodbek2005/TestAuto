package com.testauto.testauto.services;

import com.testauto.testauto.repositories.ActionsRepo;
import org.springframework.stereotype.Service;

@Service
public class ActionsService {
    private final ActionsRepo actionsRepo;

    public ActionsService(ActionsRepo actionsRepo) {
        this.actionsRepo = actionsRepo;
    }
}

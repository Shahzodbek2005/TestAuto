package com.testauto.testauto.controllers;

import com.testauto.testauto.services.ActionsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actions")
public class ActionsController {

    private  final ActionsService actionsService ;
    public ActionsController(ActionsService actionsService) {
        this.actionsService = actionsService;
    }



}

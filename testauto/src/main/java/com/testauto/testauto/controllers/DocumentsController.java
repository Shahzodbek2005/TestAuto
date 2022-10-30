package com.testauto.testauto.controllers;

import com.testauto.testauto.models.Documents;
import com.testauto.testauto.services.DocumentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/documents")
public class DocumentsController {
    private final DocumentService documentService;

    public DocumentsController(DocumentService documentService) {
        this.documentService = documentService;
    }
}

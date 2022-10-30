package com.testauto.testauto.services;

import com.testauto.testauto.repositories.CountriesRepo;
import com.testauto.testauto.repositories.DocumentsRepo;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    private  final DocumentsRepo documentsRepo;

    public DocumentService(DocumentsRepo documentsRepo) {
        this.documentsRepo = documentsRepo;
    }
}

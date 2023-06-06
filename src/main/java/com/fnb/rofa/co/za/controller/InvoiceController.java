package com.fnb.rofa.co.za.controller;

import com.fnb.rofa.co.za.repository.InvoiceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fnb/")
public class InvoiceController {

    private final InvoiceService inventoryService;

    public InvoiceController(InvoiceService inventoryService) {
        this.inventoryService = inventoryService;
    }


    // find invoice by userId
    public void test() {

    }
}

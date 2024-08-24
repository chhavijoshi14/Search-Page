package com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.controller;
import com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.model.Supplier;
import com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/supplier")
    public class SupplierController {
        @Autowired
        private SupplierService supplierService;

        @PostMapping("/query")
        public List<Supplier> querySuppliers(
                @RequestParam String location,
                @RequestParam String natureOfBusiness,
                @RequestParam String manufacturingProcess,
                @RequestParam(defaultValue = "0") int page,
                @RequestParam(defaultValue = "10") int size) {
            return supplierService.getSuppliers(location, natureOfBusiness, manufacturingProcess, page, size);
        }
    }




package com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.service;
import com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.model.Supplier;
import com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
    public class SupplierService {
        @Autowired
        private SupplierRepository supplierRepository;

        public List<Supplier> getSuppliers(String location, String natureOfBusiness, String manufacturingProcess, int page, int size) {
            Pageable pageable = PageRequest.of(page, size);
            return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
                    location, natureOfBusiness, manufacturingProcess);
        }
    }



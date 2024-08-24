package com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch;




import com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.model.Supplier;
import com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.repository.SupplierRepository;
import com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.service.SupplierService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

    @SpringBootTest
    public class SupplierServiceTests {
        @Autowired
        private SupplierService supplierService;

        @Autowired
        private SupplierRepository supplierRepository;

        @BeforeEach
        public void setUp() {
            Supplier supplier1 = new Supplier();
            supplier1.setSupplierId(1L);
            supplier1.setCompanyName("ABC Molds");
            supplier1.setWebsite("http://abcmolds.com");
            supplier1.setLocation("New York");
            supplier1.setNatureOfBusiness("small_scale");
            supplier1.setManufacturingProcesses(String.valueOf(Arrays.asList("moulding", "casting")));

            supplierRepository.save(supplier1);
        }

        @Test
        public void testGetSuppliers() {
            List<Supplier> suppliers = supplierService.getSuppliers("New York", "small_scale", "moulding", 0, 10);
            assertEquals(1, suppliers.size());
        }
    }



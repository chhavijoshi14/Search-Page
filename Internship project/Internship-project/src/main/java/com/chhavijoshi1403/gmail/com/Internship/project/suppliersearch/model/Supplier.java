package com.chhavijoshi1403.gmail.com.Internship.project.suppliersearch.model;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.util.Collections;
import java.util.List;
@Entity
public class Supplier {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long supplierId;
        private String companyName;
        private String website;
        private String location;
        private String natureOfBusiness;
        @ElementCollection
        private List<String> manufacturingProcesses;

        public Supplier() {}

        public Supplier(Long supplierId, String companyName, String website, String location,
                        String natureOfBusiness, String manufacturingProcesses) {
                this.supplierId = supplierId;
                this.companyName = companyName;
                this.website = website;
                this.location = location;
                this.natureOfBusiness = natureOfBusiness;
                this.manufacturingProcesses = Collections.singletonList(manufacturingProcesses);
        }

        // Getters and Setters
        public Long getSupplierId() {
                return supplierId;
        }

        public void setSupplierId(Long supplierId) {
                this.supplierId = supplierId;
        }

        public String getCompanyName() {
                return companyName;
        }

        public void setCompanyName(String companyName) {
                this.companyName = companyName;
        }

        public String getWebsite() {
                return website;
        }

        public void setWebsite(String website) {
                this.website = website;
        }

        public String getLocation() {
                return location;
        }

        public void setLocation(String location) {
                this.location = location;
        }

        public String getNatureOfBusiness() {
                return natureOfBusiness;
        }

        public void setNatureOfBusiness(String natureOfBusiness) {
                this.natureOfBusiness = natureOfBusiness;
        }

        public List<String> getManufacturingProcesses() {
                return manufacturingProcesses;
        }

        public void setManufacturingProcesses(String manufacturingProcesses) {
                this.manufacturingProcesses = Collections.singletonList(manufacturingProcesses);
        }
}

        // Getters and Setters




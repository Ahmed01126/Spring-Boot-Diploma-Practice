package com.stringtraining.companyapp.dao.employee;

import com.stringtraining.companyapp.model.entity.Address;
import com.stringtraining.companyapp.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IAddressRepo extends JpaRepository<Address, UUID> {
    Long count(String id);
}

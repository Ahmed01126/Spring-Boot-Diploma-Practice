package com.stringtraining.companyapp.dao.employee;

import com.stringtraining.companyapp.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IEmployeeRepo extends JpaRepository<Employee, UUID> {
    Employee findByEmail(String email);
    Long count(String email);
}

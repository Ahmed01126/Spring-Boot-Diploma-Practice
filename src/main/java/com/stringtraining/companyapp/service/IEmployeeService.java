package com.stringtraining.companyapp.service;

import com.stringtraining.companyapp.model.dto.EmployeeDto;

import java.util.List;
import java.util.UUID;

public interface IEmployeeService {

    void save(EmployeeDto employeeDto);

    void update(String email,EmployeeDto newEmployeeDto);

    void delete(UUID id);

    EmployeeDto findById(UUID id);

    EmployeeDto findByEmail(String email);

    List<EmployeeDto> findAll();
}

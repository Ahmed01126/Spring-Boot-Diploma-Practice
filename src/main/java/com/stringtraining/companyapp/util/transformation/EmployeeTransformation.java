package com.stringtraining.companyapp.util.transformation;

import com.stringtraining.companyapp.model.dto.EmployeeDto;
import com.stringtraining.companyapp.model.entity.Employee;

import java.util.UUID;

public class EmployeeTransformation {

    private EmployeeTransformation(){

    }

    public static Employee toEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(UUID.randomUUID());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        return employee;
    }

    public static EmployeeDto toEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setEmail(employee.getEmail());
        return employeeDto;
    }
}

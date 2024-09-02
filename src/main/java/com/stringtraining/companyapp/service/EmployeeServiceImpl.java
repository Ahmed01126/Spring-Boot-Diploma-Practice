package com.stringtraining.companyapp.service;

import com.stringtraining.companyapp.dao.employee.IEmployeeRepo;
import com.stringtraining.companyapp.model.dto.EmployeeDto;
import com.stringtraining.companyapp.model.entity.Employee;
import com.stringtraining.companyapp.util.transformation.AddressTransformation;
import com.stringtraining.companyapp.util.transformation.EmployeeTransformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(IEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public void save(EmployeeDto employeeDto) {
        employeeRepo.save(EmployeeTransformation.toEmployee(employeeDto));
    }

    @Override
    public void update(String email, EmployeeDto newEmployeeDto) {
        Employee employee = employeeRepo.findByEmail(email);
        employee.setFirstName(newEmployeeDto.getFirstName());
        employee.setLastName(newEmployeeDto.getLastName());
        employee.setEmail(newEmployeeDto.getEmail());
        employee.setAddress(AddressTransformation.toAddress(newEmployeeDto.getAddress()));
        employeeRepo.save(employee);
    }

    @Override
    public void delete(UUID id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public EmployeeDto findById(UUID id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(); // EXCEPTION
        return EmployeeTransformation.toEmployeeDto(employee);
    }

    @Override
    public EmployeeDto findByEmail(String email) {
        return EmployeeTransformation.toEmployeeDto(employeeRepo.findByEmail(email));
    }

    @Override
    public List<EmployeeDto> findAll() {
        List<Employee> employeelist = employeeRepo.findAll();
        return employeelist.stream().map(EmployeeTransformation::toEmployeeDto).toList();
    }
}

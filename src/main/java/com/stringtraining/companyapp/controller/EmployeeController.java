package com.stringtraining.companyapp.controller;

import com.stringtraining.companyapp.model.dto.EmployeeDto;
import com.stringtraining.companyapp.service.IEmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final IEmployeeService employeeService;

    @Autowired
    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("saveEmployee")
    public void saveEmployeeApi(@RequestBody EmployeeDto employeeDto) {
        employeeService.save(employeeDto);
    }

    @PutMapping("updateEmployeeByEmail/{email}")
    public void updateEmployeeApi(@PathVariable String email, @RequestBody EmployeeDto newEmployeeDto) {
        employeeService.update(email, newEmployeeDto);
    }

    @DeleteMapping("deleteEmployeeById/{id}")
    public void deleteEmployeeApi(@PathVariable UUID id) {
      employeeService.delete(id);
    }

    @GetMapping("findEmployeeById/{id}")
    public EmployeeDto findEmployeeByIdApi(@PathVariable UUID id){
        return employeeService.findById(id);
    }

    @GetMapping("findEmployeeByEmail/{email}")
    EmployeeDto findEmployeeByEmail(@PathVariable String email){
        return employeeService.findByEmail(email);
    }

    @GetMapping("findAllEmployees")
    List<EmployeeDto> findAllEmployeeApi(){
        return employeeService.findAll();
    }



}

package com.stringtraining.companyapp.dao.employee;

import com.stringtraining.companyapp.model.entity.Employee;

import java.util.List;

public interface ICustomEmployeeRepo {
    List<Employee> findAllEmployeesCommonSubName(String SubName);
}

package com.stringtraining.companyapp.dao.employee;

import com.stringtraining.companyapp.model.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomEmployeeRepoImpl implements ICustomEmployeeRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findAllEmployeesCommonSubName(String SubName) {
        String sql = "select em from Employee em where firstName = :SubName";
        TypedQuery<Employee> query = entityManager.createQuery(sql, Employee.class);
        query.setParameter("SubName", '%' + SubName + '%');
        return query.getResultList();

    }
}

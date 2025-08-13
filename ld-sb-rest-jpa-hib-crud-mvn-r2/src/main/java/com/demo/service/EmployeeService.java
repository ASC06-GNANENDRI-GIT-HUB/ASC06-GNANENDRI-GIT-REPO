package com.demo.service;

import com.demo.entity.EmployeeEntity;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployees();
    Optional<EmployeeEntity> getEmployeeById(Long id);
    EmployeeEntity createEmployee(EmployeeEntity employee);
    EmployeeEntity updateEmployee(Long id, EmployeeEntity updatedEmployee);
    void deleteEmployee(Long id);
    Optional<EmployeeEntity> getEmployeeByEmail(String email);
    long countEmployees();
}

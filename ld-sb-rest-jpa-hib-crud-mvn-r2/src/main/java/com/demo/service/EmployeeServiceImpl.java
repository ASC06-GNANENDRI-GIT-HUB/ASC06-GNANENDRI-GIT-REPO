package com.demo.service;

import com.demo.entity.EmployeeEntity;
import com.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeEntity updateEmployee(Long id, EmployeeEntity updatedEmployee) {
        return employeeRepository.findById(id)
                .map(existing -> {
                    existing.setFirstName(updatedEmployee.getFirstName());
                    existing.setLastName(updatedEmployee.getLastName());
                    existing.setEmailId(updatedEmployee.getEmailId());
                    return employeeRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Optional<EmployeeEntity> getEmployeeByEmail(String email) {
        return employeeRepository.findByEmailId(email);
    }

    @Override
    public long countEmployees() {
        return employeeRepository.count();
    }
}

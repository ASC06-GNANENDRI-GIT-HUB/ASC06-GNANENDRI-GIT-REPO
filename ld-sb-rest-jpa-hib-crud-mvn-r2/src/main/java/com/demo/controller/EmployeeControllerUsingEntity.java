package com.demo.controller;

import com.demo.entity.EmployeeEntity;
import com.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2/employees")
public class EmployeeControllerUsingEntity {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeControllerUsingEntity(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // GET all employees
    @GetMapping
    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // GET employee by ID
    @GetMapping("/{id}")
    public Optional<EmployeeEntity> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // GET employee by Email
    @GetMapping("/email/{email}")
    public Optional<EmployeeEntity> getEmployeeByEmail(@PathVariable String email) {
        return employeeService.getEmployeeByEmail(email);
    }

    // POST create employee
    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.createEmployee(employee);
    }

    // PUT update employee
    @PutMapping("/{id}")
    public EmployeeEntity updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity updatedEmployee) {
        return employeeService.updateEmployee(id, updatedEmployee);
    }

    // DELETE employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully";
    }

    // GET employee count
    @GetMapping("/count")
    public long countEmployees() {
        return employeeService.countEmployees();
    }
}

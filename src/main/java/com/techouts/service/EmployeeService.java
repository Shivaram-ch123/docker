package com.techouts.service;

import com.techouts.model.Employee;
import com.techouts.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // save employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // get by id
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // delete by id
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
package com.springboot.demo.service;

import com.springboot.demo.model.Employee;
import com.springboot.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository eRepository;

    public List<Employee> getEmployees() {
        return eRepository.findAll();
    }

    public Employee findEmployeeById(int id) {
        return eRepository.findById(id).orElse(null);
    }

    public Employee save(Employee employee) {
        return eRepository.save(employee);
    }

    public Employee update(Employee employee) {
        Employee emp = eRepository.findById(employee.getId()).get();
        emp.setLastName(employee.getLastName());
        emp.setFirstName(employee.getFirstName());
        return eRepository.save(emp);

    }

    public String deleteEmployee(int id) {
        eRepository.deleteById(id);
        return "deleted employee with id" + id;
    }
}

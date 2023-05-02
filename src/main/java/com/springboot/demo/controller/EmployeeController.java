package com.springboot.demo.controller;

import com.springboot.demo.model.Employee;
import com.springboot.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService eService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return eService.save(employee);
    }

    @GetMapping()
    public List<Employee> getEmployees() {
        return eService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return eService.findEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return eService.update(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return eService.deleteEmployee(id);
    }

}

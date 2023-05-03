package com.springboot.demo.controller;

import com.springboot.demo.dto.EmployeeDto;
import com.springboot.demo.exception.EmployeeNotFoundException;
import com.springboot.demo.model.Employee;
import com.springboot.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService eService;

    @PostMapping("/add")
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid EmployeeDto empDto) {
        return new ResponseEntity<>(eService.saveEmployee(empDto), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(eService.getEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id) throws EmployeeNotFoundException {
        return ResponseEntity.ok(eService.getEmployee(id));
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

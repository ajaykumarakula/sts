package com.example.demo.exe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exe.entity.Employee;
import com.example.demo.exe.repository.EmployeeRepository;

@RestController
public class EmployeeController {
@Autowired
private EmployeeRepository employeeRepository;
@PostMapping("/save")
public Employee saveDetails(@RequestBody Employee employee) {
	return employeeRepository.save(employee);
}
}

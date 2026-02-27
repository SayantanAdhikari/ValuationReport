package com.example.ValuationReport.controllers;

import com.example.ValuationReport.dtos.EmployeeDto;
import com.example.ValuationReport.models.Employee;
import com.example.ValuationReport.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class employeeController {
    @Autowired
    IEmployeeService employeeService;
    @GetMapping("/getEmployees")
    public ResponseEntity<EmployeeDto> getAllemployees()
    {
        employeeService.GetAllEmployees();

        return new ResponseEntity<>(new EmployeeDto(), HttpStatus.OK);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeDto> addEmployee(EmployeeDto employeeDto)
    {
        return new ResponseEntity<>(employeeDto, HttpStatus.CREATED);
    }
}

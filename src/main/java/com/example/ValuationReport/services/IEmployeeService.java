package com.example.ValuationReport.services;

import com.example.ValuationReport.dtos.EmployeeDto;
import com.example.ValuationReport.models.Employee;

public interface IEmployeeService
{
    public EmployeeDto AddEmployee(EmployeeDto employeeDto);
    public EmployeeDto GetAllEmployees();
    public EmployeeDto GetEmployeeById(Long Id);
    public String UpdateEmployeeById(Long Id);
    public String DeleteEmployeeById(Long id);
}

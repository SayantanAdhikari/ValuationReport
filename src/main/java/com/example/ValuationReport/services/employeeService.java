package com.example.ValuationReport.services;

import com.example.ValuationReport.dtos.EmployeeDto;
import com.example.ValuationReport.models.Employee;
import com.example.ValuationReport.models.Valuer;
import com.example.ValuationReport.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class employeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;

    public EmployeeDto AddEmployee(EmployeeDto employeeDto)
    {
        return new EmployeeDto();
    }

    @Override
    public EmployeeDto GetAllEmployees() {
        //From(employeeRepo.getAllEmployees());
        return null;
    }

    @Override
    public EmployeeDto GetEmployeeById(Long Id) {
        return null;
    }

    @Override
    public String UpdateEmployeeById(Long Id) {
        return null;
    }

    @Override
    public String DeleteEmployeeById(Long id) {
        return "";
    }


    private Employee From(EmployeeDto employeeDto)
    {
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        employee.setPhoneNumber(employeeDto.getPhoneNumber());
        employee.setEmail(employeeDto.getEmail());
        employee.setCreatedAt(new Date());

//        Valuer valuer = new Valuer();
//        valuer.setName(employeeDto.getValuer().getName());
//        valuer.setEmail(employeeDto.getValuer().getEmail());
        return employee;
    }
    private EmployeeDto From(Employee employee)
    {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName(employee.getName());
        employeeDto.setPhoneNumber(employee.getPhoneNumber());
        employeeDto.setEmail(employee.getEmail());

        return new EmployeeDto();
    }
}

package com.example.ValuationReport.repos;

import com.example.ValuationReport.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Employee save(Employee employee);

    List<Employee> findAll();

    Employee getEmployeeById(Long id);

    String deleteEmployeeById(Long id);
}

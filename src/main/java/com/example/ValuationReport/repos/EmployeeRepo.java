package com.example.ValuationReport.repos;

import com.example.ValuationReport.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}

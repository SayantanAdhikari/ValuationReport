package com.example.ValuationReport.dtos;

import com.example.ValuationReport.models.Valuer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    //private Long employeeId;          //will be auto generated
    private Valuer valuer_id;
    private String name;
    private String phoneNumber;
    private String email;
}

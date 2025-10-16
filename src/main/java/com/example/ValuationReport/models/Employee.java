package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employees")
public class Employee extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "valuer_id")
    private Valuer valuer;
    private String name;
    private String phoneNumber;
    private String email;
}

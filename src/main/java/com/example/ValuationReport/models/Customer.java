package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="customers")
public class Customer extends BaseModel {
    private String customerName;
    private String customerEmail;
    private String customerFatherName;
    private String phoneNumber;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Address> addresses;
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Property property;
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Building building;
    @ManyToMany(mappedBy = "customers")
    private HashSet<Bank> banks;
    @ManyToMany(mappedBy = "customers")
    private HashSet<Valuer> valuers;
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Report report;
}

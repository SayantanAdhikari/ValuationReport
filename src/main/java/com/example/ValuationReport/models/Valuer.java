package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="valuers")
public class Valuer extends BaseModel{
    private String name;
    private String email;
    private String qualification;
    private String iovValuer;
    private String regd_no;
    private String ccit_reg_no;
    private String phoneNumber1;
    private String phoneNumber2;
    private String otherDetails;
    @OneToOne(mappedBy = "valuer",cascade = CascadeType.ALL)
    private Address address;
    @OneToMany(mappedBy = "valuer",cascade = CascadeType.ALL)
    private List<Report> reports;
    @OneToMany(mappedBy = "valuer",cascade = CascadeType.ALL)
    private List<Employee> employees;
    @ManyToMany(mappedBy = "valuers")
    private HashSet<Bank> banks;
    @ManyToMany
    @JoinTable(
            name = "valuer_customer",
            joinColumns = @JoinColumn(name = "valuer_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id")
    )
    private HashSet<Customer> customers;
}

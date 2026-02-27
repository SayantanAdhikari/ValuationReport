package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="banks")
public class Bank extends BaseModel{
    private String bankName;
    @SequenceGenerator(name = "bank_branch_seq", sequenceName = "bank_branch_seq", allocationSize = 1)
    private Long branchId;
    private String branchName;
    @OneToOne(mappedBy = "bank",cascade = CascadeType.ALL)
    private Address address;
    @OneToMany(mappedBy = "bank",cascade = CascadeType.ALL)
    private List<Report> reports;
    @ManyToMany
    @JoinTable(
            name = "bank_valuers",
            joinColumns = @JoinColumn(name = "bank_id"),
            inverseJoinColumns = @JoinColumn(name = "valuer_id")
    )
    private HashSet<Valuer> valuers;
    @ManyToMany
    @JoinTable(
            name = "bank_customer",
            joinColumns = @JoinColumn(name = "bank_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id")
    )
    private HashSet<Customer> customers;
}

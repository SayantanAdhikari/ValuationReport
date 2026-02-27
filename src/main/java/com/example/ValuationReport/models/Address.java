package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="addresses")
public class Address extends BaseModel{
    private String postalPin;
    private String postOfficeName;
    private String locality;
    private String wardNumber;
    private String wardName;
    private LOCALITY_TYPE localityType;
    @ManyToOne
    @JoinColumn(name = "cityOrVillage_id")
    private City cityOrVillage;
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "valuer_id")
    private Valuer valuer;
    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
    private Property property;
    @OneToOne
    @JoinColumn(name="bank_id")
    private Bank bank;
}

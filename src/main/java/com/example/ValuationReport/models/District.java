package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "districts")
public class District extends BaseModel{
    private String name;
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
    @OneToMany(mappedBy = "district")
    private List<City> cities;
    @OneToMany(mappedBy = "district")
    private List<Address> addresses;
}

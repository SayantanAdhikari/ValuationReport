package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="states")
public class State extends BaseModel{
    private String name;
    @OneToMany(mappedBy = "state",cascade = CascadeType.ALL)
    private List<Address> addresses;
    @OneToMany(mappedBy = "state",cascade = CascadeType.ALL)
    private List<District> districts;
    @OneToMany(mappedBy = "state",cascade = CascadeType.ALL)
    private List<City> cities;
}

package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name="cities")
public class City extends BaseModel{
    private String name;
    @OneToMany(mappedBy = "cityOrVillage",cascade = CascadeType.ALL)
    private List<Address> addresses;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;
    private City_Type cityType;
}

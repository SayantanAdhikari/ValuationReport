package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "buildings")
public class Building extends BaseModel {
    @ManyToOne
    @JoinColumn(name="property_id")
    private Property property;
    @OneToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    private Building_Type buildingType;
    private int buildingAge;
    @OneToOne(mappedBy = "building",cascade = CascadeType.ALL)
    private Plinth plinth;
}

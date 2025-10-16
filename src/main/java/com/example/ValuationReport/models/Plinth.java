package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "plinths")
public class Plinth extends BaseModel{
    @OneToOne
    @JoinColumn(name="building_id")
    private Building building;
    @ManyToOne
    @JoinColumn(name="property_id")
    private Property property;
    private double plinthArea;
}

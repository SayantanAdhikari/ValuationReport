package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "boundaries")
public class Boundary extends BaseModel {
    @OneToOne
    @JoinColumn(name = "property_id")
    private Property property;
    @OneToMany(mappedBy = "boundary",cascade = CascadeType.ALL)
    private List<Deed> deeds;
    private String boundaryNorth;
    private String boundaryEast;
    private String boundarySouth;
    private String boundaryWest;
}

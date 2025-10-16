package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "properties")
public class Property extends BaseModel {
    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;
    @OneToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    @OneToOne
    @JoinColumn(name="porcha_id")
    private Porcha porcha;
    @OneToMany(mappedBy = "property",cascade = CascadeType.ALL)
    private List<Deed> deeds;
    @OneToOne
    @JoinColumn(name="plot_id")
    private Plot plot;
    private double latitude;
    private double longitude;
    private Date dateOfVisit;
    @OneToOne(mappedBy = "property",cascade = CascadeType.ALL)
    private Boundary boundary;
    @OneToMany(mappedBy = "property",cascade = CascadeType.ALL)
    private List<Building> buildings;
    @OneToMany(mappedBy = "property",cascade = CascadeType.ALL)
    private List<Plinth> plinths;
    @OneToOne(mappedBy = "property",cascade = CascadeType.ALL)
    private Report report;
}

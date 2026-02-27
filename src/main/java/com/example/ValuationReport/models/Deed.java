package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="deeds")
public class Deed{
    @Id
    private Long id_deed_number;
    @OneToOne
    @JoinColumn(name = "porcha_id")
    private Porcha porcha;
    private String nameInDeed;
    private String deedRoadDescriptions;
    private String deedNorthBoundary;
    private String deedEastBoundary;
    private String deedWestBoundary;
    private String deedSouthBoundary;
    @ManyToOne
    @JoinColumn(name="property_id")
    private Property property;
    @ManyToOne
    @JoinColumn(name="boundary_id")
    private Boundary boundary;
    private Date createdAt;
    private Date updatedAt;
}

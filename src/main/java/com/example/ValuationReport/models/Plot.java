package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="plots")
public class Plot extends BaseModel {
    private String rs_plot_number;
    private String cs_plot_number;
    private double areaOfPlot;
    @OneToOne
    @JoinColumn(name = "id_porchaId_KhatianNumber")
    private Porcha porcha;
    @OneToOne(mappedBy = "plot",cascade = CascadeType.ALL)
    private Report report;
    @OneToOne(mappedBy = "plot",cascade = CascadeType.ALL)
    private Property property;
}

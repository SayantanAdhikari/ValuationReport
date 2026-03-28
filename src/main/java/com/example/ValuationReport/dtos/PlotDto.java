package com.example.ValuationReport.dtos;

import com.example.ValuationReport.models.Porcha;
import com.example.ValuationReport.models.Property;
import com.example.ValuationReport.models.Report;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlotDto {
    private String rs_plot_number;
    private String cs_plot_number;
    private double areaOfPlot;
    private Porcha porcha;
    private Property property;
}

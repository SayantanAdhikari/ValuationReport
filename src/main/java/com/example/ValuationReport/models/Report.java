package com.example.ValuationReport.models;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="reports")
public class Report extends BaseModel{
    @OneToOne
    @JoinColumn(name="plot_id")
    private Plot plot;
    @OneToOne
    @JoinColumn(name="property_id")
    private Property property;
    @OneToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="valuer_id")
    private Valuer valuer;
    private Date dateOfReportGeneration;
    @ManyToOne
    @JoinColumn(name="bank_id")
    private Bank bank;
}

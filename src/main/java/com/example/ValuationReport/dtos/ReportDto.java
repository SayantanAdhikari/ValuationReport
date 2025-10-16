package com.example.ValuationReport.dtos;

import com.example.ValuationReport.models.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReportDto {
    private Plot plot;
    private Property property;
    private Customer customer;
    private Valuer valuer;
    private Bank bank;
}

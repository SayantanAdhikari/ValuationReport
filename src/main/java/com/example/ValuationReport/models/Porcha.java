package com.example.ValuationReport.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="porchas")
public class Porcha{
    @Id
    private Long id_porchaId_KhatianNumber;
    private String tehsil;
    private String mouza;
    @OneToOne(mappedBy = "porcha",cascade = CascadeType.ALL)
    private Property property;
    private AreaOfClassifications areaOfClassifications;
    @OneToOne(mappedBy = "porcha",cascade = CascadeType.ALL)
    private Deed deed;
    @OneToOne(mappedBy = "porcha",cascade = CascadeType.ALL)
    private Plot plot;
    private Date createdAt;
    private Date updatedAt;
}

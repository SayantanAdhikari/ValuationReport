package com.example.ValuationReport.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class reportController {
    @PostMapping("/createReport")
    public ResponseEntity<ReportDto>
}

package com.attendify.DabatosNabuaNovero.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.attendify.DabatosNabuaNovero.Entity.ReportEntity;
import com.attendify.DabatosNabuaNovero.Service.ReportService;

@RestController
@RequestMapping("/Report")
@CrossOrigin
public class ReportController {
    @Autowired
    ReportService repserv;

    // task 1: Update Report
    @PutMapping("/updateReport")
    public ReportEntity updateReport(@RequestParam Long id, @RequestBody ReportEntity newReportDetails) {
        return repserv.updateReport(id, newReportDetails);
    }

    // task 2: Create Report
    @PostMapping("/createReport")
    public ReportEntity createReport(@RequestBody ReportEntity report) {
        return repserv.createReport(report);
    }

    // task 3: Get All Reports
    @GetMapping("/getAllReports")
    public List<ReportEntity> getAllReports() {
        return repserv.getAllReports();
    }
}

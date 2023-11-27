package com.attendify.DabatosNabuaNovero.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendify.DabatosNabuaNovero.Entity.ReportEntity;
import com.attendify.DabatosNabuaNovero.Repository.ReportRepository;

@Service
public class ReportService {
   @Autowired
   ReportRepository portrepo;



    // task 1 Update the report
    @SuppressWarnings("finally")
    public ReportEntity updateReport(Long id, ReportEntity newReportDetails) {
        ReportEntity reportt = new ReportEntity();
        try {
            reportt = portrepo.findById(id).get();

            reportt.setStatus(newReportDetails.getEventname());


        } catch (NoSuchElementException ex) {
            throw new NoSuchElementException("Student" + id + "does not exist");
        } finally {
            return portrepo.save(reportt);
        }
    }


    // task 2: Create a new report
    public ReportEntity createReport(ReportEntity report) {
        return portrepo.save(report);
   	 }

    // task 3: Get all reports
    public List<ReportEntity> getAllReports() {
        return portrepo.findAll();
  	  }


}
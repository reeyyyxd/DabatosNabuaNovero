package com.attendify.DabatosNabuaNovero.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/// REPORT
@Entity
@Table(name = "tblreport")
public class ReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentId")
    private Long Studid;
    @Column(name = "Date")
    private String Date;
    @Column(name = "Status")
    private String Status;
    @Column(name = "EventName")
    private String Eventname;



    public ReportEntity(Long studid, String date, String status, String eventname) {
        Studid = studid;
        Date = date;
        Status = status;
        Eventname = eventname;
    }

    public ReportEntity() {
    }

    public Long getStudid() {
        return Studid;
    }
    public void setStudid(Long studid) {
        Studid = studid;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public String getEventname() {
        return Eventname;
    }
    public void setEventname(String eventname) {
        Eventname = eventname;
    }



}

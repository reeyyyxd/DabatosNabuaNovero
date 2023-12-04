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
    private Long studentid;
    @Column(name = "Date")
    private String date;
    @Column(name = "Status")
    private String status;
    @Column(name = "EventName")
    private String eventname;



    public ReportEntity(Long studentid, String date, String status, String eventname) {
        this.studentid = studentid;
        this.date = date;
        this.status = status;
        this.eventname = eventname;
    }

    public ReportEntity() {
    }

    public Long getStudentid() {
        return studentid;
    }
    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getEventname() {
        return eventname;
    }
    public void setEventname(String eventname) {
        this.eventname = eventname;
    }



}

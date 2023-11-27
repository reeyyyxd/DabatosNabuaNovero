package com.attendify.DabatosNabuaNovero.Entity;


import javax.persistence.*;
import java.util.Formatter;

@Entity
@Table (name="tblevent")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="eventname")
    private String eventname;

    @Column(name="department")
    private String department;

    @Column(name="startdate")
    private String startdate;


    @Column(name="timestart")
    private String timestart;

    @Column(name="timeend")
    private String timeend;

    public EventEntity(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }



    public String getTimestart() {
        return timestart;
    }

    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }

    public String getTimeend() {
        return timeend;
    }

    public void setTimeend(String timeend) {
        this.timeend = timeend;
    }

    public EventEntity(int id, String eventname, String department, String startdate,
                       String timestart, String timeend){
        super();
        this.id = id;
        this.department= department;
        this.startdate= startdate;
        this.timestart = timestart;
        this.timeend= timeend;





    }




}

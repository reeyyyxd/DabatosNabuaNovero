package com.attendify.DabatosNabuaNovero.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//change the  var and data types
@Entity
@Table(name="tblattendance")
public class AttendRecEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;


    @Column(name="Courseandyear")
    private String courseandyear;

    @Column(name="joineddepartment")
    private String jDepartment;



    public AttendRecEntity(){
        super();
    }
    public AttendRecEntity(int id, String courseandyear,  String jDepartment) {
        super();
        this.id = id;
        this.courseandyear = courseandyear;
        this.jDepartment = jDepartment;

    }

 


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseandyear() {
        return courseandyear;
    }

    public void setCourseandyear(String courseandyear) {
        this.courseandyear = courseandyear;
    }

    public String getJDepartment() {
        return jDepartment;
    }

    public void setJDepartment(String jDepartment) {
        this.jDepartment = jDepartment;
    }
}
package com.attendify.DabatosNabuaNovero.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblemployee")

public class EmployeeEntity {


    //id implementation
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;


    @Column(name="idnumber")
    private String idNumber;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="email")
    private String email;

    @Column(name="department")
    private String department;

    @Column(name = "isStudent")
    private boolean isStudent = false;




    //empty constructor
    public EmployeeEntity() {
        super();
    }

    //constructor
    public EmployeeEntity(int id, String idNumber, String firstname, String lastname, String email, String department) {
        super();
        this.id = id;
        this.idNumber= idNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.department= department;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}

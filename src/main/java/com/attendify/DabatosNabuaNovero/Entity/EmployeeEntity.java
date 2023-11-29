package com.attendify.DabatosNabuaNovero.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tblemployee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //gi butang nkog column ky mo duplicate and di mo run
    @Column(name="idnumber")
    private String idNumber;
    private String firstname;
    private String lastname;
    private String email;
    private String department;
    private boolean isStudent = false;

    public EmployeeEntity(){

    }

    public EmployeeEntity(int id, String idNumber, String firstname, String lastname, String email, String department){
        this.id = id;
        this.idNumber = idNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.department = department;
        this.isStudent=false;
    }

    public int getId(){
        return id;
    }

    public String getIdNumber(){
        return idNumber;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getEmail(){
        return email;
    }

    public String getDepartment(){
        return department;
    }

    public boolean isStudent(){
        return isStudent;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setStudent(boolean student){
        isStudent = student;
    }

}
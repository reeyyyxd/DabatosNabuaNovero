package com.attendify.DabatosNabuaNovero.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblUser")

public class UserEntity {

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

    @Column(name="password")
    private String password;

    @Column(name = "isStudent")
    private boolean isStudent = false;

    @Column(name = "isEmployee")
    private boolean isEmployee = false;


    public UserEntity() {
        super();
    }

    public UserEntity(int id, String idNumber, String firstname, String lastname, String email,
                      String password) {
        super();
        this.id = id;
        this.idNumber = idNumber;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.isStudent = false;
        this.isEmployee = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String name) {
        this.idNumber = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }


}

package com.attendify.DabatosNabuaNovero.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tblemployee")


public class StudentEntity {

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


	@Column(name = "isStudent")
	private boolean isSSG = false;


	//empty constructor
	public StudentEntity() {
		super();
	}

	//constructor
	public StudentEntity(int id, String idNumber, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.idNumber= idNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.isSSG = false;
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

	public void setSSG(boolean isStudent) {
		this.isSSG = isStudent;
	}
	public boolean isSSG() {
		return isSSG;
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
}
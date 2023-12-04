package com.attendify.DabatosNabuaNovero.Service;

import java.util.List;
import java.util.NoSuchElementException;
import com.attendify.DabatosNabuaNovero.Entity.StudentEntity;
import com.attendify.DabatosNabuaNovero.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService{

	@Autowired
	StudentRepository attendifyrepo;
	
	
	//C - Create or insert student record
	public StudentEntity insertStudent(StudentEntity s){
		return attendifyrepo.save(s);
	}
	
	//R - read all records
	public List <StudentEntity> getAllStudents(){
		return attendifyrepo.findAll();
	}
	
	//U- update
	@SuppressWarnings("finally")
	public StudentEntity updateStudent(int id, StudentEntity newStudentDetails) {
		StudentEntity student = new StudentEntity(); //instantiation
		try {
			
			//search id of student to update
			student = attendifyrepo.findById(id).get();
			
			//this will update
			student.setIdNumber(newStudentDetails.getIdNumber());
			student.setFirstname(newStudentDetails.getFirstname());	
			student.setLastname(newStudentDetails.getLastname());
			student.setEmail(newStudentDetails.getEmail());
			student.setIsSSG(newStudentDetails.getIsSSG());



		}
		catch(NoSuchElementException ex){
			throw new NoSuchElementException("Student "+ id + " not found");
		}
		finally {
			return attendifyrepo.save(student);
		}
	}
	
	//D- delete
	public String deleteStudent(int id) {

		if(attendifyrepo.existsById(id)) {
			attendifyrepo.deleteById(id);
			return "Student " + id + " is deleted";
		}
		else {
			return "Student ID " + id + " not found";

		}
		
	}
}

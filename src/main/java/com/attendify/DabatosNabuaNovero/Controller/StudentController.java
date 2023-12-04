package com.attendify.DabatosNabuaNovero.Controller;

import java.util.List;
import com.attendify.DabatosNabuaNovero.Entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.attendify.DabatosNabuaNovero.Service.StudentService;





@RestController
@RequestMapping("/student")
@CrossOrigin

public class StudentController {
	


			
	@Autowired
	StudentService attendifyservice;
		//create 
		@PostMapping("/insertStudent")
		public StudentEntity insertStudent(@RequestBody StudentEntity s) {
			return attendifyservice.insertStudent(s);
		}

		//read (all student records in table)
		@GetMapping ("/getAllStudents")
		public List <StudentEntity> getAllStudents() {
			return attendifyservice.getAllStudents();
		}
		
		//update
		@PutMapping("/updateStudent/{id}")
		public StudentEntity updateStudent(@PathVariable int id, @RequestBody StudentEntity newStudentDetails) {
			return attendifyservice.updateStudent(id, newStudentDetails);
		}
		
		//delete
		@DeleteMapping("/deleteStudent/{id}") //specify the direction you want to deleted
		public String deleteStudent(@PathVariable int id) {
			return attendifyservice.deleteStudent(id);
		}		
	}
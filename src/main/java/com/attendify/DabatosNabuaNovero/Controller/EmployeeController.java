package com.attendify.DabatosNabuaNovero.Controller;

import java.util.List;

import com.attendify.DabatosNabuaNovero.Entity.EmployeeEntity;
import com.attendify.DabatosNabuaNovero.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {


    @Autowired
    EmployeeService attendifyservice;
    //create
    @PostMapping("/insertEmployee")
    public EmployeeEntity insertEmployee(@RequestBody EmployeeEntity e) {
        return attendifyservice.insertEmployee(e);
    }

    //read 
    @GetMapping ("/getAllEmployee")
    public List <EmployeeEntity> getAllEmployee() {
        return attendifyservice.getAllEmployee();
    }

    //update
    @PutMapping("/updateEmployee")
    public EmployeeEntity updateEmployee(@RequestParam int id, @RequestBody EmployeeEntity newEmployeeDetails) {
        return attendifyservice.updateEmployee(id, newEmployeeDetails);
    }

    //delete
    @DeleteMapping("/deleteEmployee/{id}") 
    public String deleteEmployee(@PathVariable int id) {
        return attendifyservice.deleteEmployee(id);
    }
}
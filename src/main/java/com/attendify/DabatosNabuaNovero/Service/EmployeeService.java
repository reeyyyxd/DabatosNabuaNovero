package com.attendify.DabatosNabuaNovero.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendify.DabatosNabuaNovero.Entity.EmployeeEntity;
import com.attendify.DabatosNabuaNovero.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository attendifyrepo;

    public EmployeeEntity insertEmployee(EmployeeEntity s){
        return attendifyrepo.save(s);
    }

    public List <EmployeeEntity> getAllEmployee(){
        return attendifyrepo.findAll();
    }

    @SuppressWarnings("finally")
    public EmployeeEntity updateEmployee(int id, EmployeeEntity newEmployeeDetails) {
        EmployeeEntity employee = new EmployeeEntity(); 
        try {

            employee = attendifyrepo.findById(id).get();

            employee.setIdNumber(newEmployeeDetails.getIdNumber());
            employee.setFirstname(newEmployeeDetails.getFirstname());
            employee.setLastname(newEmployeeDetails.getLastname());
            employee.setEmail(newEmployeeDetails.getEmail());
            employee.setDepartment(newEmployeeDetails.getDepartment());
            employee.setStudent(newEmployeeDetails.isStudent());

        }
        catch(NoSuchElementException ex){
            throw new NoSuchElementException("Employee "+ id + " not found");
        }
        finally{
            return attendifyrepo.save(employee);
        }
    }

    public String deleteEmployee(int id) {

        if(attendifyrepo.existsById(id)) {
            attendifyrepo.deleteById(id);
            return "Employee " + id + " is deleted";
        }
        else {
            return "Employee ID " + id + " not found";


        }

    }
}
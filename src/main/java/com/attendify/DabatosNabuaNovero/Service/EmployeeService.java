package com.attendify.DabatosNabuaNovero.Service;

import java.util.List;
import java.util.NoSuchElementException;
import com.attendify.DabatosNabuaNovero.Entity.EmployeeEntity;
import com.attendify.DabatosNabuaNovero.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository attendifyrepo;


    //C - Create or insert employee record
    public EmployeeEntity insertEmployee(EmployeeEntity s){
        return attendifyrepo.save(s);
    }

    //R - read all records
    public List <EmployeeEntity> getAllEmployee(){
        return attendifyrepo.findAll();
    }

    //U- update
    public EmployeeEntity updateEmployee(int id, EmployeeEntity newEmployeeDetails) {
        EmployeeEntity employee = new EmployeeEntity(); //instantiation
        try {

            //search id of employee to update
            employee = attendifyrepo.findById(id).get();

            //this will update
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
        finally {
            return attendifyrepo.save(employee);
        }
    }

    //D- delete
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

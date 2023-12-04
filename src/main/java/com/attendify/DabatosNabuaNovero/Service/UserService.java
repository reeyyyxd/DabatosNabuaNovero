package com.attendify.DabatosNabuaNovero.Service;

import java.util.List;
import java.util.NoSuchElementException;
import com.attendify.DabatosNabuaNovero.Entity.UserEntity;
import com.attendify.DabatosNabuaNovero.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository attendifyrepo;

    public UserEntity createUser(UserEntity insert) {
        return attendifyrepo.save(insert);
    }

    public List<UserEntity> seeAllUser() {
        return attendifyrepo.findAll();
    }
    @SuppressWarnings("finally")
    public UserEntity updateUser(int id, UserEntity newUser) {
        UserEntity s = new UserEntity();
        try {

//            Idnumber
//            firstname
//            lastname
//            email
//            password
//            isStudent
//            isEmployee

            s = attendifyrepo.findById(id).get();
            s.setIdNumber(newUser.getIdNumber());
            s.setFirstname(newUser.getFirstname());
            s.setLastname(newUser.getLastname());
            s.setEmail(newUser.getEmail());
            s.setPassword(newUser.getPassword());
            s.setIsStudent(newUser.getIsStudent());
            s.setIsEmployee(newUser.getIsEmployee());


        }
        catch(NoSuchElementException ex){
            throw new NoSuchElementException("Manufacturer "+ id + " not found");
        }
        finally {
            return attendifyrepo.save(s);
        }
    }

    public String deleteUser(int id) {
        if (attendifyrepo.existsById(id)) {
            attendifyrepo.deleteById(id);
            return "User " + id + " is deleted";
        } else {
            return "User " + id + " not found";
        }
    }
}

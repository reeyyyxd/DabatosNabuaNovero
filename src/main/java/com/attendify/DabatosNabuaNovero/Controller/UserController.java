package com.attendify.DabatosNabuaNovero.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.attendify.DabatosNabuaNovero.Entity.UserEntity;
import com.attendify.DabatosNabuaNovero.Service.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService attendifyserv;


    @PostMapping("/createUser")
    public UserEntity createUser(@RequestBody UserEntity s) {
        return attendifyserv.createUser(s);
    }

    @GetMapping ("/seeAllUsers")
    public List <UserEntity> getAll() {
        return attendifyserv.seeAllUser();
    }


    @PutMapping("/updateUser")
    public UserEntity updateManufacturer(@RequestParam int id, @RequestBody UserEntity newUser) {
        return attendifyserv.updateUser(id, newUser);
    }


    @DeleteMapping("/deleteUser/{id}")
    public String deleteManufacturer(@PathVariable int id) {
        return attendifyserv.deleteUser(id);
    }








}

package com.attendify.DabatosNabuaNovero.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.attendify.DabatosNabuaNovero.Entity.UserEntity;
import com.attendify.DabatosNabuaNovero.Service.*;


@RestController
@RequestMapping("/user")
@CrossOrigin
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


    @PutMapping("/updateUser/{id}")
    public UserEntity updateManufacturer(@PathVariable int id, @RequestBody UserEntity newUser) {
        return attendifyserv.updateUser(id, newUser);
    }


    @DeleteMapping("/deleteUser/{id}")
    public String deleteManufacturer(@PathVariable int id) {
        return attendifyserv.deleteUser(id);
    }








}

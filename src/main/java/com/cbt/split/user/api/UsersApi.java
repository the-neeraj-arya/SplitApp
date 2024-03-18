/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.user.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author neeraj
 */
@RestController
public class UsersApi {

    @PostMapping()
    public String createUser() {
        return "User Create Successfully...";
    }

    @PutMapping("/userId")
    public String updateUser() {
        return "User Update Successfully...";
    }

    @GetMapping()
    public String getAllUser() {
        return "Get Users Successfully...";
    }
    
    @GetMapping("/userId")
    public String getUser(){
        return "Get User Successfully...";
    }
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.user.api;

import com.cbt.split.user.domain.User;
import com.cbt.split.user.service.UserWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author neeraj
 */
@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "http://localhost:4200")
public class UsersApi {

    @Autowired
    private UserWritePlatformService userWritePlatformService;

//    @Autowired
//    public UsersApi(UserWritePlatformService userWritePlatformService) {
//        this.userWritePlatformService = userWritePlatformService;
//    }
    @PostMapping("/setUser")
    public ResponseEntity<User> createUser(@RequestBody User userData) {
        try {
            User user = this.userWritePlatformService.createUser(userData);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/userId")
    public String updateUser() {
        return "User Update Successfully...";
    }

    @GetMapping()
    public String getAllUser() {
        System.out.println("Only get user");
        return "Get Users Successfully...1";
    }

    @GetMapping("/userId")
    public String getUser() {
        System.out.println("Hi This Is My Api");
        return "Get User Successfully... Hiiii";
    }

}

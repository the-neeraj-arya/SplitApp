/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.user.api;

import com.cbt.split.user.domain.UserEntity;
import com.cbt.split.user.service.UserWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author neeraj
 */
@RestController
public class UsersApi {

    @Autowired
    private UserWritePlatformService userWritePlatformService;

//    @Autowired
//    public UsersApi(UserWritePlatformService userWritePlatformService) {
//        this.userWritePlatformService = userWritePlatformService;
//    }
    @PostMapping("/user")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userData) {
        try {
            UserEntity user = this.userWritePlatformService.createUser(userData);
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
        return "Get Users Successfully...";
    }

    @GetMapping("/userId")
    public String getUser() {
        return "Get User Successfully...";
    }

}

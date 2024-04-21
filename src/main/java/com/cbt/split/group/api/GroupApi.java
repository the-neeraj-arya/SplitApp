/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.api;

import com.cbt.split.group.domain.SplitGroupEntity;
import com.cbt.split.group.service.SplitGroupWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author neeraj
 */
@RestController()
public class GroupApi {

    @Autowired
    private SplitGroupWritePlatformService splitGroupWritePlatformService;

    @PostMapping("/createGroup")
    public ResponseEntity<SplitGroupEntity> createGroup(@RequestBody SplitGroupEntity splitGroupData) {
        try {
            SplitGroupEntity groupdata = this.splitGroupWritePlatformService.createGroup(splitGroupData);
            return new ResponseEntity<>(groupdata, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/group")
    public String group(){
        return "This is group of split application.";
    }
}

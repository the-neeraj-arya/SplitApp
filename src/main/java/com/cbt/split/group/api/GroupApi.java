/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.api;

import com.cbt.split.Json.JsonCommand;
import com.cbt.split.group.data.GroupData;
import com.cbt.split.group.domain.Group;
import com.cbt.split.group.service.SplitGroupWritePlatformService;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author neeraj
 */
@RestController()
@RequestMapping("/group")
public class GroupApi {

    @Autowired
    private SplitGroupWritePlatformService splitGroupWritePlatformService;

    @PostMapping("/createGroup")
    public ResponseEntity<String> createGroup(@RequestBody String jsonString) {
        try {
            System.out.println("create group ............");

            JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
            JsonCommand command = new JsonCommand(jsonObject);

            this.splitGroupWritePlatformService.createGroup(command);
//            return new ResponseEntity<>(groupdata, HttpStatus.CREATED);
            return new ResponseEntity<>("Group processed successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/createGroups")
    public ResponseEntity<String> createGroups(@RequestBody String jsonString) {
        try {
            System.out.println("create group ............");

            JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
            JsonCommand command = new JsonCommand(jsonObject);

            this.splitGroupWritePlatformService.createGroup(command);
//            return new ResponseEntity<>(groupdata, HttpStatus.CREATED);
            return new ResponseEntity<>("Group processed successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/group")
    public String group() {
        return "This is group of split application.";
    }
}

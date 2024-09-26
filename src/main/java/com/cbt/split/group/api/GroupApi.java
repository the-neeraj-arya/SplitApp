/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.api;

import com.cbt.split.Json.JsonCommand;
import com.cbt.split.group.data.GroupDataPojo;
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
import com.cbt.split.group.domain.Group;
import java.util.List;

/**
 *
 * @author neeraj
 */
@RestController()
@RequestMapping("/group")
public class GroupApi {

    @Autowired
    private SplitGroupWritePlatformService splitGroupWritePlatformService;

//    @PostMapping("/createGroup")
//    public ResponseEntity<String> createGroup(@RequestBody String jsonString) {
//        try {
//            System.out.println("create group ............");
//            JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
//            JsonCommand command = new JsonCommand(jsonObject);
//
//            this.splitGroupWritePlatformService.createGroup(command);
//            return new ResponseEntity<>("Group processed successfully", HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @PostMapping("/createGroups")
    public ResponseEntity<String> createGroups(@RequestBody String jsonString) {
        try {
            System.out.println("Hit Create Group Api ..............!");

            JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
            JsonCommand command = new JsonCommand(jsonObject);

            this.splitGroupWritePlatformService.createGroup(command);
            return new ResponseEntity<>("Group processed successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getGroup")
    public ResponseEntity<List<GroupDataPojo>> group() {
        try {
            System.out.println("Hit Get Group Api ..............!");

            List<GroupDataPojo> groupList = this.splitGroupWritePlatformService.getGroups();
            for (int i = 0; i < groupList.size(); i++) {
                System.out.println(groupList.get(i).getName());
            }
            return new ResponseEntity<>(groupList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

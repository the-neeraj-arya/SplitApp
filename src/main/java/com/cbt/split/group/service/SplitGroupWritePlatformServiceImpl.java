/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.service;

import com.cbt.split.Json.JsonCommand;
import com.cbt.split.group.data.GroupData;
import com.cbt.split.group.domain.Group;
import com.cbt.split.group.domain.SplitGroupRepository;
import com.google.gson.JsonArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author neeraj
 */
@Service
public class SplitGroupWritePlatformServiceImpl implements SplitGroupWritePlatformService {

    private final SplitGroupRepository splitGroupRepository;
//    private final SplitGroupEntity groupEntity;

    @Autowired
    public SplitGroupWritePlatformServiceImpl(SplitGroupRepository splitGroupRepository) {
        this.splitGroupRepository = splitGroupRepository;
    }

    @Override
    public void createGroup(JsonCommand command) {

        String groupName = command.stringValueOfParameterNamed("groupName");
        String groupDesc = command.stringValueOfParameterNamed("groupDesc");
        Long memberSlabs = command.longValueOfParameterNamed("memberSlabs");

        JsonArray groupMembers = command.arrayOfParameterNamed("groupMembers");

        groupMembers.forEach(member -> {
            String memberName = member.getAsJsonObject().get("memberName").getAsString();
            System.out.println("Member Name: " + memberName);
        });
//
//        System.out.println("" + groupData.getName() + "" + groupData.getDesc() + "" + groupData.getMemberSlab());
//        Group groupEntity = new Group();
//        groupEntity.setName(groupData.getName());
//        groupEntity.setDescription(groupData.getDesc());
//        groupEntity.setMember(Integer.parseInt(groupData.getMemberSlab()));
//        this.splitGroupRepository.save(groupEntity);
    }
}

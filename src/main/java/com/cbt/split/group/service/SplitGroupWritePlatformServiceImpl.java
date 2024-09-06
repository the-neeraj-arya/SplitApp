/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.service;

import com.cbt.split.Json.JsonCommand;
import com.cbt.split.group.domain.Group;
import com.cbt.split.group.domain.GroupMember;
import com.cbt.split.group.domain.GroupRepository;
import com.cbt.split.group.domain.Members;
import com.google.gson.JsonArray;
import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author neeraj
 */
@Service
public class SplitGroupWritePlatformServiceImpl implements SplitGroupWritePlatformService {

    private final GroupRepository groupRepository;
    Date date = new Date();

    @Autowired
    public SplitGroupWritePlatformServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void createGroup(JsonCommand command) {

        String groupName = command.stringValueOfParameterNamed("groupName");
        String groupDesc = command.stringValueOfParameterNamed("groupDesc");
        Integer memberSlabs = command.IntegerValueOfParameterNamed("memberSlabs");
        System.out.println(groupName + " " + groupDesc + "" + memberSlabs);

        JsonArray groupMembers = command.arrayOfParameterNamed("groupMembers");

        Group groupEntity = new Group();
        groupEntity.setName(groupName);
        groupEntity.setDescription(groupDesc);
        groupEntity.setCreatedBy(1);
        groupEntity.setCreatedAt(LocalDateTime.now());
        System.out.println(groupName + " " + groupDesc + " " + memberSlabs + " " + LocalDateTime.now());
        this.groupRepository.save(groupEntity);

        groupMembers.forEach(member -> {
            String memberName = member.getAsJsonObject().get("memberName").getAsString();
            System.out.println("Member Name: " + memberName);

            Members groupMemberEntity = new Members();
            groupMemberEntity.setMemberName(memberName);
            groupMemberEntity.setJoinedAt(LocalDateTime.now());
            groupEntity.addMembers(groupMemberEntity);
        });
        groupRepository.save(groupEntity);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.service;

import com.cbt.split.Json.JsonCommand;
import com.cbt.split.group.data.GroupDataPojo;
import com.cbt.split.group.data.MembersPojo;
import com.cbt.split.group.domain.Group;
import com.cbt.split.group.domain.GroupRepository;
import com.cbt.split.group.domain.MemberRepository;
import com.cbt.split.group.domain.Members;
import com.google.gson.JsonArray;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author neeraj
 */
@Service
public class SplitGroupWritePlatformServiceImpl implements SplitGroupWritePlatformService {

    private final GroupRepository groupRepository;
    private final MemberRepository remberRepository;
    Date date = new Date();

    @Autowired
    public SplitGroupWritePlatformServiceImpl(GroupRepository groupRepository, MemberRepository remberRepository) {
        this.groupRepository = groupRepository;
        this.remberRepository = remberRepository;
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

    @Override
    public List<GroupDataPojo> getGroups() {
        List<GroupDataPojo> groupDataList = new ArrayList();
        List<Group> group = groupRepository.findAll();
        for (int i = 0; i < group.size(); i++) {
            GroupDataPojo pojo = new GroupDataPojo();
            pojo.setId(String.valueOf(group.get(i).getId()));
            pojo.setName(group.get(i).getName());
            pojo.setDesc(group.get(i).getDescription());
            List<MembersPojo> members = getMembers(group.get(i).getName());
            int member = 0;
            for (int j = 0; j < members.size(); j++) {
                member++;
            }
            pojo.setGroupMembers(member);
            pojo.setCreatedDate(group.get(i).getCreatedAt().format(DateTimeFormatter.ISO_DATE));
            groupDataList.add(pojo);
        }
        return groupDataList;
    }

    @Override
    public List<MembersPojo> getMembers(String groupName) {
        List<MembersPojo> returnList = new ArrayList();
        List<Members> members = remberRepository.findByGroupName(groupName);
        for (int i = 0; i < members.size(); i++) {
            MembersPojo pojo = new MembersPojo();
            pojo.setId(members.get(i).getId().toString());
            pojo.setName(members.get(i).getMemberName());
            pojo.setJoinDate(members.get(i).getJoinedAt().toString());
            pojo.setGroup(members.get(i).getGroup().toString());
            returnList.add(pojo);
        }
        return returnList;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.data;

import java.util.List;

/**
 *
 * @author neeraj
 */
public class GroupData {

    private String name;
    private String desc;
    private String memberSlab;
    private List<GroupMemberData> groupMembers;

    public GroupData() {
    }

    public GroupData(String name, String desc, String memberSlab, List<GroupMemberData> groupMembers) {
        this.name = name;
        this.desc = desc;
        this.memberSlab = memberSlab;
        this.groupMembers = groupMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMemberSlab() {
        return memberSlab;
    }

    public void setMemberSlab(String memberSlab) {
        this.memberSlab = memberSlab;
    }

    public List<GroupMemberData> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<GroupMemberData> groupMembers) {
        this.groupMembers = groupMembers;
    }

}

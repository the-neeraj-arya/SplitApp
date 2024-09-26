/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.data;

/**
 *
 * @author neeraj
 */
public class GroupDataPojo {

    private String id;
    private String name;
    private String desc;
    private int groupMembers;
    private String createdDate;

    public GroupDataPojo() {
    }

    public GroupDataPojo(String id, String name, String desc, int groupMembers, String createdDate) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.groupMembers = groupMembers;
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(int groupMembers) {
        this.groupMembers = groupMembers;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}

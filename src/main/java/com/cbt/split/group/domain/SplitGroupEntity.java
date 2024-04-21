/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

/**
 *
 * @author neeraj
 */
@Entity
@Table(name="split_group_details")
public class SplitGroupEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String groupName;
    private String userName;
    private int groupMember;
    private BigDecimal amt;
    private String amtDetail;
    private String date;
    private String remark;

    public SplitGroupEntity() {
    }

    public SplitGroupEntity(int id, String groupName, String userName, int groupMember, BigDecimal amt, String amtDetail, String date, String remark) {
        this.id = id;
        this.groupName = groupName;
        this.userName = userName;
        this.groupMember = groupMember;
        this.amt = amt;
        this.amtDetail = amtDetail;
        this.date = date;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(int groupMember) {
        this.groupMember = groupMember;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getAmtDetail() {
        return amtDetail;
    }

    public void setAmtDetail(String amtDetail) {
        this.amtDetail = amtDetail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }    
}

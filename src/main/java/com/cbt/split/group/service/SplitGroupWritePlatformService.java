/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cbt.split.group.service;

import com.cbt.split.Json.JsonCommand;
import com.cbt.split.group.data.GroupDataPojo;
import com.cbt.split.group.data.MembersPojo;
import java.util.List;

/**
 *
 * @author neeraj
 */
public interface SplitGroupWritePlatformService {

    public void createGroup(JsonCommand command);

    public List<GroupDataPojo> getGroups();
    
    public List<MembersPojo> getMembers(String groupName);

}

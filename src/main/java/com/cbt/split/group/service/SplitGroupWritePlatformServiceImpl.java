/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.service;

import com.cbt.split.group.domain.SplitGroupEntity;
import com.cbt.split.group.domain.SplitGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author neeraj
 */
@Service
public class SplitGroupWritePlatformServiceImpl implements SplitGroupWritePlatformService {

    private final SplitGroupRepository splitGroupRepository;
//    private final SplitGroupEntity splitGroupEntity;

    @Autowired
    public SplitGroupWritePlatformServiceImpl(SplitGroupRepository splitGroupRepository) {
        this.splitGroupRepository = splitGroupRepository;
    }

    @Override
    public SplitGroupEntity createGroup(SplitGroupEntity data) {
        System.out.println("" + data.getGroupName() + "" + data.getGroupMember() + "" + data.getUserName());
        SplitGroupEntity splitGroupEntity = new SplitGroupEntity();
        splitGroupEntity.setGroupName(data.getGroupName());
        splitGroupEntity.setUserName(data.getUserName());
        splitGroupEntity.setGroupMember(data.getGroupMember());
        splitGroupEntity.setAmt(data.getAmt());
        splitGroupEntity.setAmtDetail(data.getAmtDetail());
        splitGroupEntity.setDate(data.getDate());
        splitGroupEntity.setRemark(data.getRemark());
        this.splitGroupRepository.save(splitGroupEntity);
        return null;
    }
}

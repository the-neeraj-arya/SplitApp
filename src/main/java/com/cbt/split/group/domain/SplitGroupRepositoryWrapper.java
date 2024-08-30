/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.group.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author neeraj
 */
@Service
public class SplitGroupRepositoryWrapper {

    private final SplitGroupRepository splitGroupRepository;

    @Autowired
    public SplitGroupRepositoryWrapper(SplitGroupRepository splitGroupRepository) {
        this.splitGroupRepository = splitGroupRepository;
    }

    public void save(final Group splitGroupEntity) {
        this.splitGroupRepository.save(splitGroupEntity);
    }

    public void delete(final Group splitGroupEntity) {
        this.splitGroupRepository.delete(splitGroupEntity);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.user.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author neeraj
 */
@Service
public class UserRepositoryWrapper {

    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryWrapper(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User userData) {
        this.userRepository.save(userData);
    }

}

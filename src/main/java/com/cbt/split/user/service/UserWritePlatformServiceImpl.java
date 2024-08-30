/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cbt.split.user.service;

import com.cbt.split.user.domain.User;
import com.cbt.split.user.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author neeraj
 */
@Service
public class UserWritePlatformServiceImpl implements UserWritePlatformService {

//    private final UserEntity userEntity;
    private final UserRepository userRepository;

    @Autowired
    public UserWritePlatformServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
//        System.out.println("" + user.getFirst_name() + "" + user.getLast_name() + "" + user.getDate_of_birth());
//        UserEntity userEntity = new UserEntity();
//        userEntity.setLast_name(user.getLast_name());
//        userEntity.setFirst_name(user.getFirst_name());
//        userEntity.setGender(user.getGender());
//        userEntity.setDate_of_birth(user.getDate_of_birth());
//        userEntity.setAddress(user.getAddress());
//        userEntity.setPhone_no(user.getPhone_no());
//        userEntity.setUser_name(user.getUser_name());
//        userEntity.setPassword(user.getPassword());
//        this.userRepository.save(userEntity);
        System.out.println("Create User........." + user);
        return null;
    }
}

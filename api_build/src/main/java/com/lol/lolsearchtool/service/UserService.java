package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserEntity createUser(UserEntity user);
    
    UserEntity updateUser(UserEntity user);
    
    void deleteUser(Integer userId);
    
    List<UserEntity> getAllUsers(); 
    
    Optional<UserEntity> getUserByUsername(String username);
    
}
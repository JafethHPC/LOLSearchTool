package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.UserEntity;

import java.time.LocalDateTime;

public interface UserService {
    UserEntity registerUser(String username, String email, String password);
    UserEntity loginUser(String username, String password);

    // Password Management
    void updatePassword(Integer userId, String oldPassword, String newPassword);

    // Profile Management
    void updateEmail(Integer userId, String newEmail);
    void updateLastLogin(Integer userId, LocalDateTime lastLogin);

    // User Deletion
    void deleteUserbyUserId(Integer userId);
}
package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.UserEntity;
import com.lol.lolsearchtool.repository.UserRepository;
import com.lol.lolsearchtool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public UserEntity createUser(UserEntity user) {
        // Add validation logic here (e.g., check for unique username/email)
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public UserEntity updateUser(UserEntity user) {
        // Add validation and logic to update user data
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAllByOrderByUsernameAsc();
    }

    @Override
    public Optional<UserEntity> getUserByUsername(String username) {
        return userRepository.findByUsernameIgnoreCase(username);
    }
}
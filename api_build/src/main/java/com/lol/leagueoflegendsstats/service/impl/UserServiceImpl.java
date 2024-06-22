package com.lol.leagueoflegendsstats.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lol.leagueoflegendsstats.model.entity.UserEntity;
import com.lol.leagueoflegendsstats.repository.UserRepository;
import com.lol.leagueoflegendsstats.service.UserService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class UserServiceImpl implements UserService {
	
	@PersistenceContext
	private EntityManager entityManager;

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity getUserById(int userId) {
        Optional<UserEntity> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
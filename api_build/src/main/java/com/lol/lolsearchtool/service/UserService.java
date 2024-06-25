package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.UserEntity;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface UserService {

  UserEntity getUserById(int userId);

  List<UserEntity> getAllUsers();

  UserEntity createUser(UserEntity user);

  @Transactional
  void deleteUser(int userId);
}
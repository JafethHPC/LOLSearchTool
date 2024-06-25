package com.lol.lolsearchtool.controllers;

import com.lol.lolsearchtool.model.entity.UserEntity;
import com.lol.lolsearchtool.service.impl.UserServiceImpl;

import io.swagger.v3.oas.annotations.Parameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
    public UserServiceImpl userServiceImpl;

    @Parameter(name="userId", hidden=true)
    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable int userId) {
        UserEntity user = userServiceImpl.getUserById(userId);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> users = userServiceImpl.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {
        UserEntity createdUser = userServiceImpl.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @Parameter(name="userId", hidden=true)
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable int userId) {
        userServiceImpl.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }
}
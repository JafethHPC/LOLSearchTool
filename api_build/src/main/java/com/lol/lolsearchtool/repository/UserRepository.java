package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
   
    // Find user by username (for login/unique validation)
    Optional<UserEntity> findByUsername(String username);

    // Find user by email (for login/unique validation)
    Optional<UserEntity> findByEmail(String email); 
}
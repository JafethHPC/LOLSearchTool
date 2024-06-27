package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
    // Find user by username (case-insensitive)
    Optional<UserEntity> findByUsernameIgnoreCase(String username); 

    // Find user by email (case-insensitive)
    Optional<UserEntity> findByEmailIgnoreCase(String email); 

    // Delete user by userID
    void deleteByUserID(Integer userID);

    // Find all users, ordered by username ascending (case-insensitive)
    List<UserEntity> findAllByOrderByUsernameAsc(); 
}
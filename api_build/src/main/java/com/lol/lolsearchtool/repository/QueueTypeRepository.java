package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.QueueTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface QueueTypeRepository extends JpaRepository<QueueTypeEntity, Integer> {

    // Find queue type by name (case-insensitive)
    Optional<QueueTypeEntity> findByNameIgnoreCase(String name); 
    
}
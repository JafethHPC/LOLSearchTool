package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.TierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface TierRepository extends JpaRepository<TierEntity, Integer> {
   
    // Find tier by name (case-insensitive)
    Optional<TierEntity> findByNameIgnoreCase(String name);
    
}
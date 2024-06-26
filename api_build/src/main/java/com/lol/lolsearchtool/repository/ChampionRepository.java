package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.ChampionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChampionRepository extends JpaRepository<ChampionEntity, Integer> {

    // Find champion by name (case-insensitive)
    Optional<ChampionEntity> findByNameIgnoreCase(String name);

    // Find all champions, ordered by name 
    List<ChampionEntity> findAllByOrderByNameAsc(); 
    
    // Find champion to filter by role
     List<ChampionEntity> findByRolesContaining(String role);
}
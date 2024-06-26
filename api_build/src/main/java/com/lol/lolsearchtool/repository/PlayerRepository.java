package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {
    
    // Find player by summoner name (case-insensitive)
    Optional<PlayerEntity> findBySummonerNameIgnoreCase(String summonerName);

    // Find player by puuid
    Optional<PlayerEntity> findByPuuid(String puuid);

}
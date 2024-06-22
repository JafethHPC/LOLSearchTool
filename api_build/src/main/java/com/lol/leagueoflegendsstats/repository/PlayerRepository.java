package com.lol.leagueoflegendsstats.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lol.leagueoflegendsstats.model.entity.PlayerEntity;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
    PlayerEntity findBySummonerId(String summonerId);
    PlayerEntity getPlayerById(int playerId);
}

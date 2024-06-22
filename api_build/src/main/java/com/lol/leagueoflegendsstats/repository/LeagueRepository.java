package com.lol.leagueoflegendsstats.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lol.leagueoflegendsstats.model.entity.LeagueEntity;
import com.lol.leagueoflegendsstats.model.entity.QueueTypeEntity;

@Repository
public interface LeagueRepository extends JpaRepository<LeagueEntity, Long> {
    List<LeagueEntity> findByPlayerId(int playerId);
    List<LeagueEntity> findByPlayerIdAndQueueType(int playerId, QueueTypeEntity queueType);
}
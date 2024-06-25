package com.lol.lolsearchtool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lol.lolsearchtool.model.entity.LeagueEntity;
import com.lol.lolsearchtool.model.entity.QueueTypeEntity;

@Repository
public interface LeagueRepository extends JpaRepository<LeagueEntity, Long> {
    List<LeagueEntity> findByPlayerId(int playerId);
    List<LeagueEntity> findByPlayerIdAndQueueType(int playerId, QueueTypeEntity queueType);
}
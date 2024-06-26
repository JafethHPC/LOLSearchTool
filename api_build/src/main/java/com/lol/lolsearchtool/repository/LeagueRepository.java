package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.LeagueEntity;
import com.lol.lolsearchtool.model.entity.PlayerEntity;
import com.lol.lolsearchtool.model.entity.QueueTypeEntity;
import com.lol.lolsearchtool.model.entity.SeasonEntity;
import com.lol.lolsearchtool.model.entity.TierEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LeagueRepository extends JpaRepository<LeagueEntity, Integer> {

    // Find leagues by player (to display on their overview page)
    List<LeagueEntity> findByPlayer(PlayerEntity player);

    // Find leagues by season and tier (for potential leaderboards)
    Page<LeagueEntity> findBySeasonAndTier(SeasonEntity season, TierEntity tier, Pageable pageable);

    // Find leagues by season (for potential leaderboards)
    Page<LeagueEntity> findBySeason(SeasonEntity season, Pageable pageable);

    // Find a specific league entry by player, queue type, and season
     LeagueEntity findByPlayerAndQueueTypeAndSeason(PlayerEntity player, QueueTypeEntity queueType, SeasonEntity season);
}
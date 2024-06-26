package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.ChampionEntity;
import com.lol.lolsearchtool.model.entity.MatchHistoryEntity;
import com.lol.lolsearchtool.model.entity.PlayerEntity;
import com.lol.lolsearchtool.model.entity.PlayerMatchEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlayerMatchRepository extends JpaRepository<PlayerMatchEntity, Integer> {
  

    // Find player matches by player ID (with pagination)
    Page<PlayerMatchEntity> getPlayerMatchesPaginated(@Param("playerId") Integer playerId, Pageable pageable);

    List<PlayerMatchEntity> getPlayerMatches(@Param("playerId") Integer playerId);

    // Find player matches by match ID (used to display all player data for a specific match)
    List<PlayerMatchEntity> getPlayersByMatchId(@Param("matchId") Integer matchId);

    // Find player matches by champion ID (used for Champion Stats)
    List<PlayerMatchEntity> getPlayerMatchesByChampionId(@Param("championId") Integer championId);

    // Calculate aggregated stats for a player and champion 
    List<Object[]> getAggregatedStatsByPlayerAndChampion(@Param("playerId") Integer playerId, @Param("championId") Integer championId);


    // Count wins and losses for a specific player-champion combination
    List<Object[]> getWinLossByPlayerAndChampion(@Param("playerId") Integer playerId, @Param("championId") Integer championId);


}
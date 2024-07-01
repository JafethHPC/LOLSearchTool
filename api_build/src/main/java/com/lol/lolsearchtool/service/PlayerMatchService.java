package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.MatchHistoryEntity;
import com.lol.lolsearchtool.model.entity.PlayerEntity;
import com.lol.lolsearchtool.model.entity.PlayerMatchEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PlayerMatchService {
    Page<PlayerMatchEntity> getPlayerMatchesPaginated(Integer playerId, Pageable pageable); // Paginated results
    List<PlayerMatchEntity> getPlayerMatches(Integer playerId); // Unpaginated results
    List<PlayerMatchEntity> getPlayersByMatchId(Integer matchId);
    List<PlayerMatchEntity> getPlayerMatchesByChampionId(Integer championId);
    List<Object[]> getAggregatedStatsByPlayerAndChampion(Integer playerId, Integer championId);
    List<Object[]> getWinLossByPlayerAndChampion(Integer playerId, Integer championId);
}
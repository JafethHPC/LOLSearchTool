package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.MatchHistoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MatchHistoryService {
    Page<MatchHistoryEntity> getMatchHistoryByPlayerId(String playerId, Pageable pageable);
    List<MatchHistoryEntity> getMatchHistoryByPlayerId(String playerId);
    List<MatchHistoryEntity> getMatchesByMapId(Integer mapId);
    List<MatchHistoryEntity> getMatchesByGameMode(String gameMode);
    List<MatchHistoryEntity> getMatchesByGameType(String gameType);
}
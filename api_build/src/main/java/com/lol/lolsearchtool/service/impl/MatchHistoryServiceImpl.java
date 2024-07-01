package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.MatchHistoryEntity;
import com.lol.lolsearchtool.repository.MatchHistoryRepository;
import com.lol.lolsearchtool.service.MatchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MatchHistoryServiceImpl implements MatchHistoryService {

    private final MatchHistoryRepository matchHistoryRepository;

    @Autowired
    public MatchHistoryServiceImpl(MatchHistoryRepository matchHistoryRepository) {
        this.matchHistoryRepository = matchHistoryRepository;
    }

    @Override
    public Page<MatchHistoryEntity> getMatchHistoryByPlayerId(String playerId, Pageable pageable) {
        return matchHistoryRepository.findByParticipantsContaining(playerId, pageable);
    }

    @Override
    public List<MatchHistoryEntity> getMatchHistoryByPlayerId(String playerId) {
        return matchHistoryRepository.findByParticipantsContaining(playerId);
    }

    @Override
    public List<MatchHistoryEntity> getMatchesByMapId(Integer mapId) {
        return matchHistoryRepository.findByMapId(mapId);
    }

    @Override
    public List<MatchHistoryEntity> getMatchesByGameMode(String gameMode) {
        return matchHistoryRepository.findByGameMode(gameMode);
    }

    @Override
    public List<MatchHistoryEntity> getMatchesByGameType(String gameType) {
        return matchHistoryRepository.findByGameType(gameType);
    }
}


package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.PlayerMatchEntity;
import com.lol.lolsearchtool.repository.PlayerMatchRepository;
import com.lol.lolsearchtool.service.PlayerMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerMatchServiceImpl implements PlayerMatchService {

    private final PlayerMatchRepository playerMatchRepository;

    @Autowired
    public PlayerMatchServiceImpl(PlayerMatchRepository playerMatchRepository) {
        this.playerMatchRepository = playerMatchRepository;
    }

    @Override
    public Page<PlayerMatchEntity> getPlayerMatchesPaginated(Integer playerId, Pageable pageable) {
        return playerMatchRepository.getPlayerMatchesPaginated(playerId, pageable);
    }

    @Override
    public List<PlayerMatchEntity> getPlayerMatches(Integer playerId) {
        return playerMatchRepository.getPlayerMatches(playerId);
    }

    @Override
    public List<PlayerMatchEntity> getPlayersByMatchId(Integer matchId) {
        return playerMatchRepository.getPlayersByMatchId(matchId);
    }

    @Override
    public List<PlayerMatchEntity> getPlayerMatchesByChampionId(Integer championId) {
        return playerMatchRepository.getPlayerMatchesByChampionId(championId);
    }

    @Override
    public List<Object[]> getAggregatedStatsByPlayerAndChampion(Integer playerId, Integer championId) {
        return playerMatchRepository.getAggregatedStatsByPlayerAndChampion(playerId, championId);
    }

    @Override
    public List<Object[]> getWinLossByPlayerAndChampion(Integer playerId, Integer championId) {
        return playerMatchRepository.getWinLossByPlayerAndChampion(playerId, championId);
    }
}

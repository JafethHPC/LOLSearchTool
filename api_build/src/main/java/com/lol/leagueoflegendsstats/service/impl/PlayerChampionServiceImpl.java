package com.lol.leagueoflegendsstats.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.leagueoflegendsstats.model.entity.PlayerChampionEntity;
import com.lol.leagueoflegendsstats.repository.PlayerChampionRepository;
import com.lol.leagueoflegendsstats.service.PlayerChampionService;

@Service
public class PlayerChampionServiceImpl implements PlayerChampionService {

    private final PlayerChampionRepository playerChampionRepository;

    public PlayerChampionServiceImpl(PlayerChampionRepository playerChampionRepository) {
        this.playerChampionRepository = playerChampionRepository;
    }

    @Override
    public List<PlayerChampionEntity> getPlayerChampionsByPlayerId(int playerId) {
        return playerChampionRepository.findByPlayerId(playerId);
    }

    @Override
    public List<PlayerChampionEntity> getPlayerChampionsByPlayerAndChampionId(int playerId, int championId) {
        return playerChampionRepository.findByPlayerIdAndChampionId(playerId, championId);
    }

    @Override
    public PlayerChampionEntity saveOrUpdatePlayerChampion(PlayerChampionEntity playerChampion) {
        // Logic to save or update player champion data
        return playerChampionRepository.save(playerChampion);
    }
}

package com.lol.leagueoflegendsstats.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.leagueoflegendsstats.model.entity.PlayerChampionEntity;

@Service
public interface PlayerChampionService {
    List<PlayerChampionEntity> getPlayerChampionsByPlayerId(int playerId);
    List<PlayerChampionEntity> getPlayerChampionsByPlayerAndChampionId(int playerId, int championId);
    PlayerChampionEntity saveOrUpdatePlayerChampion(PlayerChampionEntity playerChampion);
}

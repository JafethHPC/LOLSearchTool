package com.lol.leagueoflegendsstats.service;

import com.lol.leagueoflegendsstats.model.entity.PlayerEntity;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface PlayerService {
    PlayerEntity getPlayerById(int playerId);
    PlayerEntity saveOrUpdatePlayer(PlayerEntity player);
    List<PlayerEntity> getAllPlayers();
    PlayerEntity getPlayerBySummonerId(String summonerId);
}
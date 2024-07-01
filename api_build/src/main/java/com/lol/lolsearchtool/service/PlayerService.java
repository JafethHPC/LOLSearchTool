package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.PlayerEntity;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface PlayerService {
    PlayerEntity getPlayerById(int playerId);
    PlayerEntity saveOrUpdatePlayer(PlayerEntity player);
    List<PlayerEntity> getAllPlayers();
    PlayerEntity getPlayerByPuuid(String puuid); 
    PlayerEntity getPlayerBySummonerNameAndRegion(String summonerName, String region);
}
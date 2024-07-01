package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.PlayerEntity;
import com.lol.lolsearchtool.repository.PlayerRepository;
import com.lol.lolsearchtool.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Slf4j // For logging
@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public PlayerEntity getPlayerById(int playerId) {
        return playerRepository.findById(playerId)
                .orElseThrow(() -> new NoSuchElementException("Player not found with ID: " + playerId));
    }

    @Transactional 
    @Override
    public PlayerEntity saveOrUpdatePlayer(PlayerEntity player) {
        return playerRepository.save(player);
    }

    @Override
    public List<PlayerEntity> getAllPlayers() {
        return playerRepository.findAll();
    }
    
    @Override
    public PlayerEntity getPlayerByPuuid(String puuid) {
        return playerRepository.findByPuuid(puuid)
                .orElseThrow(() -> new NoSuchElementException("Player not found with PUUID: " + puuid));
    }

    @Override
    public PlayerEntity getPlayerBySummonerNameAndRegion(String summonerName, String region) {
        return playerRepository.getPlayerBySummonerNameAndRegion(summonerName, region)
                .orElseThrow(() -> new NoSuchElementException("Player not found with summoner name and region: " + summonerName + ", " + region));
    }
}


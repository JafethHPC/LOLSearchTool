package com.lol.lolsearchtool.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.lolsearchtool.model.entity.PlayerEntity;
import com.lol.lolsearchtool.repository.PlayerRepository;
import com.lol.lolsearchtool.service.PlayerService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@PersistenceContext
	private EntityManager entityManager;

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerEntity getPlayerById(int playerId) {
        PlayerEntity player = playerRepository.getPlayerById(playerId);
        return player;
    }

    public PlayerEntity saveOrUpdatePlayer(PlayerEntity player) {
        return playerRepository.save(player);
    }

    public List<PlayerEntity> getAllPlayers() {
        return playerRepository.findAll();
    }

    public PlayerEntity getPlayerBySummonerId(String summonerId) {
        return playerRepository.findBySummonerId(summonerId);
    }
}
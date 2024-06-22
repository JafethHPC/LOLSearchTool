package com.lol.leagueoflegendsstats.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.leagueoflegendsstats.model.entity.ChampionEntity;
import com.lol.leagueoflegendsstats.repository.ChampionRepository;
import com.lol.leagueoflegendsstats.service.ChampionService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class ChampionServiceImpl implements ChampionService {

	@PersistenceContext
	private EntityManager entityManager;
	
    private final ChampionRepository championRepository;

    public ChampionServiceImpl(ChampionRepository championRepository) {
        this.championRepository = championRepository;
    }

    @Override
    public List<ChampionEntity> getAllChampions() {
        return championRepository.findAll();
    }

    @Override
    public ChampionEntity getChampionById(Long id) {
        return championRepository.findById(id).orElse(null);
    }
}
package com.lol.leagueoflegendsstats.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.leagueoflegendsstats.model.entity.ChampionEntity;

@Service
public interface ChampionService {
	ChampionEntity getChampionById(Long id);
    List<ChampionEntity> getAllChampions();
}

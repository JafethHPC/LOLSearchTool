package com.lol.lolsearchtool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.lolsearchtool.model.entity.ChampionEntity;

@Service
public interface ChampionService {
	ChampionEntity getChampionById(Long id);
    List<ChampionEntity> getAllChampions();
}

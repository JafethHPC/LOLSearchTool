package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.ChampionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChampionService {
    ChampionEntity getChampionById(Integer championId);
    ChampionEntity getChampionByName(String name);
    List<ChampionEntity> getAllChampions();
    List<ChampionEntity> getChampionsByRole(String role);
}
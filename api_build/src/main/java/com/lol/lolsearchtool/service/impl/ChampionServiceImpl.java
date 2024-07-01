package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.ChampionEntity;
import com.lol.lolsearchtool.repository.ChampionRepository;
import com.lol.lolsearchtool.service.ChampionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ChampionServiceImpl implements ChampionService {

    private final ChampionRepository championRepository;

    @Autowired
    public ChampionServiceImpl(ChampionRepository championRepository) {
        this.championRepository = championRepository;
    }

    @Override
    public ChampionEntity getChampionById(Integer championId) {
        return championRepository.findById(championId)
                .orElseThrow(() -> new NoSuchElementException("Champion not found with ID: " + championId));
    }

    @Override
    public ChampionEntity getChampionByName(String name) {
        return championRepository.findByNameIgnoreCase(name)
                .orElseThrow(() -> new NoSuchElementException("Champion not found with name: " + name));
    }

    @Override
    public List<ChampionEntity> getAllChampions() {
        return championRepository.findAllByOrderByNameAsc();
    }

    @Override
    public List<ChampionEntity> getChampionsByRole(String role) {
        return championRepository.findByRolesContaining(role);
    }
    
}
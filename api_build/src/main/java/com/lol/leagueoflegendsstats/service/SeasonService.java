package com.lol.leagueoflegendsstats.service;

import com.lol.leagueoflegendsstats.model.entity.SeasonEntity;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface SeasonService {
    SeasonEntity getSeasonById(Long seasonId);
    List<SeasonEntity> getAllSeasons();
}
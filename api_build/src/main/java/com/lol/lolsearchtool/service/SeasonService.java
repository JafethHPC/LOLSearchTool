package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.SeasonEntity;


import org.springframework.stereotype.Service;

@Service
public interface SeasonService {
    SeasonEntity getSeasonById(Long seasonId);

	SeasonEntity getCurrentSeason();
}
package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.SeasonEntity;
import com.lol.lolsearchtool.repository.SeasonRepository;
import com.lol.lolsearchtool.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@Service
public class SeasonServiceImpl implements SeasonService {

    private final SeasonRepository seasonRepository;

    @Autowired
    public SeasonServiceImpl(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    @Override
    public SeasonEntity getSeasonById(Long seasonId) {
        return seasonRepository.findById(seasonId.intValue())
                .orElseThrow(() -> new NoSuchElementException("Season not found with ID: " + seasonId));
    }

    @Override
    public SeasonEntity getCurrentSeason() {
        LocalDateTime now = LocalDateTime.now();
        return seasonRepository.findByStartDateLessThanEqualAndEndDateGreaterThanEqual(now, now)
                .orElseThrow(() -> new NoSuchElementException("Current season not found"));
    }
}
package com.lol.lolsearchtool.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lol.lolsearchtool.model.entity.SeasonEntity;
import com.lol.lolsearchtool.repository.SeasonRepository;
import com.lol.lolsearchtool.service.SeasonService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class SeasonServiceImpl implements SeasonService {
	
	@PersistenceContext
	private EntityManager entityManager;

    private final SeasonRepository seasonRepository;

    public SeasonServiceImpl(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    public SeasonEntity getSeasonById(Long seasonId) {
        Optional<SeasonEntity> seasonOptional = seasonRepository.findById(seasonId);
        return seasonOptional.orElse(null);
    }

    public List<SeasonEntity> getAllSeasons() {
        return seasonRepository.findAll();
    }
}
package com.lol.leagueoflegendsstats.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lol.leagueoflegendsstats.model.entity.TierEntity;
import com.lol.leagueoflegendsstats.repository.TierRepository;
import com.lol.leagueoflegendsstats.service.TierService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class TierServiceImpl implements TierService {
	
	@PersistenceContext
	private EntityManager entityManager;

    private final TierRepository tierRepository;

    public TierServiceImpl(TierRepository tierRepository) {
        this.tierRepository = tierRepository;
    }

    public TierEntity getTierById(Long tierId) {
        Optional<TierEntity> tierOptional = tierRepository.findById(tierId);
        return tierOptional.orElse(null);
    }

    public List<TierEntity> getAllTiers() {
        return tierRepository.findAll();
    }
}
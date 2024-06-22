package com.lol.leagueoflegendsstats.service;

import com.lol.leagueoflegendsstats.model.entity.TierEntity;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TierService {
    TierEntity getTierById(Long tierId);
    List<TierEntity> getAllTiers();
}
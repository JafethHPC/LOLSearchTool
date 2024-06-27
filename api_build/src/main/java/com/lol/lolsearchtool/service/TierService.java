package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.TierEntity;

import java.util.List;
import java.util.Optional;

public interface TierService {
    List<TierEntity> getAllTiers();
    Optional<TierEntity> getTierByName(String name);
}
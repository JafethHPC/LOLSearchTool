package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.TierEntity;
import com.lol.lolsearchtool.repository.TierRepository;
import com.lol.lolsearchtool.service.TierService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TierServiceImpl implements TierService {

    private final TierRepository tierRepository;

    public TierServiceImpl(TierRepository tierRepository) {
        this.tierRepository = tierRepository;
    }

    @Override
    public List<TierEntity> getAllTiers() {
        return tierRepository.findAllByOrderByNameAsc();
    }

    @Override
    public Optional<TierEntity> getTierByName(String name) {
        return tierRepository.findByNameIgnoreCase(name);
    }
}
package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.TierEntity;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TierService {
    TierEntity getTierById(Long tierId);
    List<TierEntity> getAllTiers();
}
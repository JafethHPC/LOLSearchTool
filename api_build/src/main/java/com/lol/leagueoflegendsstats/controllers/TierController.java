package com.lol.leagueoflegendsstats.controllers;

import com.lol.leagueoflegendsstats.model.entity.TierEntity;
import com.lol.leagueoflegendsstats.service.impl.TierServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tiers")
public class TierController {

	@Autowired
	public TierServiceImpl tierServiceImpl;

    @GetMapping("/{tierId}")
    public TierEntity getTierById(@PathVariable Long tierId) {
        return tierServiceImpl.getTierById(tierId);
    }

    @GetMapping("/all")
    public List<TierEntity> getAllTiers() {
        return tierServiceImpl.getAllTiers();
    }
}
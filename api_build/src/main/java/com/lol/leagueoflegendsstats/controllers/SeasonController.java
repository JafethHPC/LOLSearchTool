package com.lol.leagueoflegendsstats.controllers;

import com.lol.leagueoflegendsstats.model.entity.SeasonEntity;
import com.lol.leagueoflegendsstats.service.impl.SeasonServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/seasons")
public class SeasonController {

    public SeasonServiceImpl seasonServiceImpl;

    @GetMapping("/{seasonId}")
    public SeasonEntity getSeasonById(@PathVariable Long seasonId) {
        return seasonServiceImpl.getSeasonById(seasonId);
    }

    @GetMapping
    public List<SeasonEntity> getAllSeasons() {
        return seasonServiceImpl.getAllSeasons();
    }
}
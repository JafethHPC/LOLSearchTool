package com.lol.leagueoflegendsstats.controllers;

import com.lol.leagueoflegendsstats.model.entity.PlayerChampionEntity;
import com.lol.leagueoflegendsstats.service.impl.PlayerChampionServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/playerchampions")
public class PlayerChampionController {

	@Autowired
    public PlayerChampionServiceImpl playerChampionServiceImpl;

    @GetMapping("/player/{playerId}")
    public List<PlayerChampionEntity> getPlayerChampionsByPlayerId(@PathVariable int playerId) {
        return playerChampionServiceImpl.getPlayerChampionsByPlayerId(playerId);
    }

    @GetMapping("/player/{playerId}/champion/{championId}")
    public List<PlayerChampionEntity> getPlayerChampionsByPlayerAndChampionId(@PathVariable int playerId, @PathVariable int championId) {
        return playerChampionServiceImpl.getPlayerChampionsByPlayerAndChampionId(playerId, championId);
    }

    @PostMapping
    public PlayerChampionEntity saveOrUpdatePlayerChampion(@RequestBody PlayerChampionEntity playerChampion) {
        return playerChampionServiceImpl.saveOrUpdatePlayerChampion(playerChampion);
    }
}
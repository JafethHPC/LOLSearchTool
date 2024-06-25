package com.lol.lolsearchtool.controllers;

import com.lol.lolsearchtool.model.entity.PlayerEntity;
import com.lol.lolsearchtool.service.impl.PlayerServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

	@Autowired
    public PlayerServiceImpl playerServiceImpl;

    @GetMapping("/{playerId}")
    public PlayerEntity getPlayerById(@PathVariable int playerId) {
        return playerServiceImpl.getPlayerById(playerId);
    }

    @PostMapping
    public PlayerEntity saveOrUpdatePlayer(@RequestBody PlayerEntity player) {
        return playerServiceImpl.saveOrUpdatePlayer(player);
    }

    @GetMapping
    public ResponseEntity<List<PlayerEntity>> getAllPlayers() {
        List<PlayerEntity> players = playerServiceImpl.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @GetMapping("/bySummonerId/{summonerId}")
    public PlayerEntity getPlayerBySummonerId(@PathVariable String summonerId) {
        return playerServiceImpl.getPlayerBySummonerId(summonerId);
    }
}
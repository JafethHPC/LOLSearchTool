package com.lol.leagueoflegendsstats.controllers;

import com.lol.leagueoflegendsstats.model.entity.LeagueEntity;
import com.lol.leagueoflegendsstats.model.entity.QueueTypeEntity;
import com.lol.leagueoflegendsstats.service.impl.LeagueServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leagues")
public class LeagueController {

	@Autowired
    public LeagueServiceImpl leagueServiceImpl;
	
    @GetMapping("/player/{playerId}")
    public ResponseEntity<List<LeagueEntity>> getLeaguesByPlayerId(@PathVariable int playerId) {
        List<LeagueEntity> leagues = leagueServiceImpl.getLeaguesByPlayerId(playerId);
        return new ResponseEntity<>(leagues, HttpStatus.OK);
    }

    @GetMapping("/player/{playerId}/{queueType}")
    public ResponseEntity<List<LeagueEntity>> getLeaguesByPlayerIdAndQueueType(@PathVariable int playerId,
                                                                               @PathVariable QueueTypeEntity queueType) {
        List<LeagueEntity> leagues = leagueServiceImpl.getLeaguesByPlayerIdAndQueueType(playerId, queueType);
        return new ResponseEntity<>(leagues, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<LeagueEntity> saveOrUpdateLeague(@RequestBody LeagueEntity league) {
        LeagueEntity savedLeague = leagueServiceImpl.saveOrUpdateLeague(league);
        return new ResponseEntity<>(savedLeague, HttpStatus.CREATED);
    }
}
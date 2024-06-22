package com.lol.leagueoflegendsstats.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.leagueoflegendsstats.model.entity.LeagueEntity;
import com.lol.leagueoflegendsstats.model.entity.QueueTypeEntity;

@Service
public interface LeagueService {
	LeagueEntity saveOrUpdateLeague(LeagueEntity league);
	List<LeagueEntity> getLeaguesByPlayerIdAndQueueType(int playerId, QueueTypeEntity queueType);
	List<LeagueEntity> getLeaguesByPlayerId(int playerId);
}
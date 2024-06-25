package com.lol.lolsearchtool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.lolsearchtool.model.entity.LeagueEntity;
import com.lol.lolsearchtool.model.entity.QueueTypeEntity;

@Service
public interface LeagueService {
	LeagueEntity saveOrUpdateLeague(LeagueEntity league);
	List<LeagueEntity> getLeaguesByPlayerIdAndQueueType(int playerId, QueueTypeEntity queueType);
	List<LeagueEntity> getLeaguesByPlayerId(int playerId);
}
package com.lol.lolsearchtool.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.lolsearchtool.model.entity.LeagueEntity;
import com.lol.lolsearchtool.model.entity.QueueTypeEntity;
import com.lol.lolsearchtool.repository.LeagueRepository;
import com.lol.lolsearchtool.service.LeagueService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class LeagueServiceImpl implements LeagueService {
	
	@PersistenceContext
	private EntityManager entityManager;

    private final LeagueRepository leagueRepository;

    public LeagueServiceImpl(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    @Override
    public List<LeagueEntity> getLeaguesByPlayerId(int playerId) {
        return leagueRepository.findByPlayerId(playerId);
    }

    @Override
    public List<LeagueEntity> getLeaguesByPlayerIdAndQueueType(int playerId, QueueTypeEntity queueType) {
        return leagueRepository.findByPlayerIdAndQueueType(playerId, queueType);
    }

    @Override
    public LeagueEntity saveOrUpdateLeague(LeagueEntity league) {
        return leagueRepository.save(league);
    }
}
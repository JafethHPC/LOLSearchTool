package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.LeagueEntity;
import com.lol.lolsearchtool.model.entity.PlayerEntity;
import com.lol.lolsearchtool.model.entity.QueueTypeEntity;
import com.lol.lolsearchtool.model.entity.SeasonEntity;
import com.lol.lolsearchtool.model.entity.TierEntity;
import com.lol.lolsearchtool.repository.LeagueRepository;
import com.lol.lolsearchtool.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueServiceImpl implements LeagueService {

    private final LeagueRepository leagueRepository;

    @Autowired
    public LeagueServiceImpl(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    @Override
    public List<LeagueEntity> getLeaguesByPlayer(PlayerEntity player) {
        return leagueRepository.findByPlayer(player);
    }

    @Override
    public Page<LeagueEntity> getLeaguesBySeasonAndTier(SeasonEntity season, TierEntity tier, Pageable pageable) {
        return leagueRepository.findBySeasonAndTier(season, tier, pageable);
    }

    @Override
    public Page<LeagueEntity> getLeaguesBySeason(SeasonEntity season, Pageable pageable) {
        return leagueRepository.findBySeason(season, pageable);
    }

    @Override
    public LeagueEntity getLeagueByPlayerAndQueueTypeAndSeason(PlayerEntity player, QueueTypeEntity queueType, SeasonEntity season) {
        return leagueRepository.findByPlayerAndQueueTypeAndSeason(player, queueType, season);
    }
}

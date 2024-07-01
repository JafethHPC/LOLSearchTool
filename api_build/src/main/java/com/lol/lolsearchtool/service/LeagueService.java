package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.LeagueEntity;
import com.lol.lolsearchtool.model.entity.PlayerEntity;
import com.lol.lolsearchtool.model.entity.QueueTypeEntity;
import com.lol.lolsearchtool.model.entity.SeasonEntity;
import com.lol.lolsearchtool.model.entity.TierEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LeagueService {
    List<LeagueEntity> getLeaguesByPlayer(PlayerEntity player);
    Page<LeagueEntity> getLeaguesBySeasonAndTier(SeasonEntity season, TierEntity tier, Pageable pageable);
    Page<LeagueEntity> getLeaguesBySeason(SeasonEntity season, Pageable pageable);
    LeagueEntity getLeagueByPlayerAndQueueTypeAndSeason(PlayerEntity player, QueueTypeEntity queueType, SeasonEntity season);
}


package com.lol.lolsearchtool.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lol.lolsearchtool.model.entity.PlayerChampionEntity;

@Repository
public interface PlayerChampionRepository extends JpaRepository<PlayerChampionEntity, Long> {
    List<PlayerChampionEntity> findByPlayerIdAndChampionId(int playerId, int championId);

	List<PlayerChampionEntity> findByPlayerId(int playerId);
}
package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.MatchHistoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MatchHistoryRepository extends JpaRepository<MatchHistoryEntity, Integer> {

    // Find match history for a specific player (with pagination)
    Page<MatchHistoryEntity> findByParticipantsContaining(String playerId, Pageable pageable); 

    // Find match history for a specific player
    List<MatchHistoryEntity> findByParticipantsContaining(String playerId); 
    
    // Find matches played on a specific map
    List<MatchHistoryEntity> findByMapId(Integer mapId);

    // Find matches played in a certain game mode
    List<MatchHistoryEntity> findByGameMode(String gameMode);
    
    // Find matches played in a certain game type
    List<MatchHistoryEntity> findByGameType(String gameType);
    
}
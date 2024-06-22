package com.lol.leagueoflegendsstats.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lol.leagueoflegendsstats.model.entity.TierEntity;

@Repository
public interface TierRepository extends JpaRepository<TierEntity, Long>  {

}

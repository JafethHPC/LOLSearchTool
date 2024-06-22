package com.lol.leagueoflegendsstats.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lol.leagueoflegendsstats.model.entity.QueueTypeEntity;

@Repository
public interface QueueTypeRepository extends JpaRepository<QueueTypeEntity, Long>  {

}

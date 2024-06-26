package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.SummonerSpellEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SummonerSpellRepository extends JpaRepository<SummonerSpellEntity, Integer> {

    Optional<SummonerSpellEntity> findBySummonerSpellId(Integer summonerSpellId);
    Optional<SummonerSpellEntity> findByNameIgnoreCase(String name);
    
}
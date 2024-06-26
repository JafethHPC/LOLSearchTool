package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.TeamsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamsRepository extends JpaRepository<TeamsEntity, Integer> {
}
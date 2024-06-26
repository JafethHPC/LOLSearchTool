package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.RuneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RuneRepository extends JpaRepository<RuneEntity, Integer> {

    Optional<RuneEntity> findByRuneId(Integer runeId);
    Optional<RuneEntity> findByNameIgnoreCase(String name);

}
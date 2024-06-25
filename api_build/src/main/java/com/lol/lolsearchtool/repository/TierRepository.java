package com.lol.lolsearchtool.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lol.lolsearchtool.model.entity.TierEntity;

@Repository
public interface TierRepository extends JpaRepository<TierEntity, Long>  {

}
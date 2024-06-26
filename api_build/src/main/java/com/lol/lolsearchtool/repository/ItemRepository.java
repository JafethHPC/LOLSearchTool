package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {

    Optional<ItemEntity> findByItemId(Integer itemId);
    Optional<ItemEntity> findByNameIgnoreCase(String name);

}
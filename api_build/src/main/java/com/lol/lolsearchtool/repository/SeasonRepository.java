package com.lol.lolsearchtool.repository;

import com.lol.lolsearchtool.model.entity.SeasonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface SeasonRepository extends JpaRepository<SeasonEntity, Integer> {

    // Find the current season (assuming only one season is active at a time)
    Optional<SeasonEntity> findByStartDateLessThanEqualAndEndDateGreaterThanEqual(LocalDateTime now1, LocalDateTime now2);

    // Find all seasons
    List<SeasonEntity> findAll();

    // (Optional) Find a season by name
    Optional<SeasonEntity> findByName(String name);
}
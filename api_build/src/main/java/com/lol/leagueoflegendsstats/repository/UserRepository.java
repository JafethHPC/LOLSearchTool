package com.lol.leagueoflegendsstats.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lol.leagueoflegendsstats.model.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>  {

	void deleteById(int userId);

	Optional<UserEntity> findById(int userId);

}

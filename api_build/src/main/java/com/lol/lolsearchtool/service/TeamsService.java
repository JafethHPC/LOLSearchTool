package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.TeamsEntity;

import java.util.List;
import java.util.Optional;

public interface TeamsService {
    TeamsEntity createTeam(TeamsEntity team);
    TeamsEntity getTeamById(Integer teamId);
    List<TeamsEntity> getAllTeams();

}
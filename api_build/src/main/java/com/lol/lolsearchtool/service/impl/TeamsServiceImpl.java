package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.TeamsEntity;
import com.lol.lolsearchtool.repository.TeamsRepository;
import com.lol.lolsearchtool.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TeamsServiceImpl implements TeamsService {

    private final TeamsRepository teamsRepository;

    @Autowired
    public TeamsServiceImpl(TeamsRepository teamsRepository) {
        this.teamsRepository = teamsRepository;
    }

    @Override
    public TeamsEntity createTeam(TeamsEntity team) {
        return teamsRepository.save(team);
    }

    @Override
    public TeamsEntity getTeamById(Integer teamId) {
        return teamsRepository.findById(teamId).orElseThrow(() -> new NoSuchElementException("Team not found with id: " + teamId));
    }

    @Override
    public List<TeamsEntity> getAllTeams() {
        return teamsRepository.findAll();
    }

}
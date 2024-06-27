package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.SummonerSpellEntity;
import com.lol.lolsearchtool.repository.SummonerSpellRepository;
import com.lol.lolsearchtool.service.SummonerSpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SummonerSpellServiceImpl implements SummonerSpellService {

    private final SummonerSpellRepository summonerSpellRepository;

    @Autowired
    public SummonerSpellServiceImpl(SummonerSpellRepository summonerSpellRepository) {
        this.summonerSpellRepository = summonerSpellRepository;
    }

    @Override
    public SummonerSpellEntity getSummonerSpellById(Integer id) {
        return summonerSpellRepository.findBySummonerSpellId(id)
                .orElseThrow(() -> new NoSuchElementException("Summoner spell not found with ID: " + id));
    }

    @Override
    public SummonerSpellEntity getSummonerSpellByName(String name) {
        return summonerSpellRepository.findByNameIgnoreCase(name)
                .orElseThrow(() -> new NoSuchElementException("Summoner spell not found with name: " + name));
    }

    @Override
    public List<SummonerSpellEntity> getAllSummonerSpells() {
        return summonerSpellRepository.findAll();
    }
}
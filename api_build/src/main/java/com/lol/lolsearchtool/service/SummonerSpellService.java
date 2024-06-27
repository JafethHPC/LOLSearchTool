package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.SummonerSpellEntity;

import java.util.List;

public interface SummonerSpellService {
    SummonerSpellEntity getSummonerSpellById(Integer id);
    SummonerSpellEntity getSummonerSpellByName(String name);
    List<SummonerSpellEntity> getAllSummonerSpells();
}
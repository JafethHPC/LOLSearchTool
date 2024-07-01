package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.RuneEntity;
import java.util.List;

public interface RuneService {
    RuneEntity getRuneById(Integer runeId);
    RuneEntity getRuneByName(String name);
    List<RuneEntity> getAllRunes(); 
}
package com.lol.lolsearchtool.controllers;

import com.lol.lolsearchtool.model.entity.ChampionEntity;
import com.lol.lolsearchtool.service.impl.ChampionServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/champions")
public class ChampionController {

	@Autowired
    public ChampionServiceImpl championServiceImpl;

    @GetMapping("/champion")
    public List<ChampionEntity> getAllChampions() {
        return championServiceImpl.getAllChampions();
    }

    @GetMapping("/champion/{id}")
    public ChampionEntity getChampionById(@PathVariable Long id) {
        return championServiceImpl.getChampionById(id);
    }

}
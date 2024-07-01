package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.RuneEntity;
import com.lol.lolsearchtool.repository.RuneRepository;
import com.lol.lolsearchtool.service.RuneService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class RuneServiceImpl implements RuneService {

    private final RuneRepository runeRepository;

    public RuneServiceImpl(RuneRepository runeRepository) {
        this.runeRepository = runeRepository;
    }

    @Override
    public RuneEntity getRuneById(Integer runeId) {
        return runeRepository.findByRuneId(runeId)
                .orElseThrow(() -> new NoSuchElementException("Rune not found with ID: " + runeId));
    }

    @Override
    public RuneEntity getRuneByName(String name) {
        return runeRepository.findByNameIgnoreCase(name)
                .orElseThrow(() -> new NoSuchElementException("Rune not found with name: " + name));
    }

    @Override
    public List<RuneEntity> getAllRunes() {
        return runeRepository.findAll();
    }
}
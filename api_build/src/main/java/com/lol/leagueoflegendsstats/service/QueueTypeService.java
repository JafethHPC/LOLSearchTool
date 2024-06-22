package com.lol.leagueoflegendsstats.service;

import com.lol.leagueoflegendsstats.model.entity.QueueTypeEntity;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface QueueTypeService {

    QueueTypeEntity getQueueTypeById(Long queueTypeId);

    List<QueueTypeEntity> getAllQueueTypes();
}
package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.QueueTypeEntity;

import java.util.Optional;

public interface QueueTypeService {

    QueueTypeEntity getQueueTypeById(Long queueTypeId);
    
}
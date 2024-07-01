package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.QueueTypeEntity;
import com.lol.lolsearchtool.repository.QueueTypeRepository;
import com.lol.lolsearchtool.service.QueueTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class QueueTypeServiceImpl implements QueueTypeService {

    private final QueueTypeRepository queueTypeRepository;

    @Autowired
    public QueueTypeServiceImpl(QueueTypeRepository queueTypeRepository) {
        this.queueTypeRepository = queueTypeRepository;
    }

    @Override
    public QueueTypeEntity getQueueTypeById(Long queueTypeId) {
        return queueTypeRepository.findById(queueTypeId.intValue())
                .orElseThrow(() -> new NoSuchElementException("Queue type not found with ID: " + queueTypeId));
    }
}
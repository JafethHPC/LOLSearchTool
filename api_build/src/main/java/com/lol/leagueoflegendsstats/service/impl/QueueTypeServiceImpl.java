package com.lol.leagueoflegendsstats.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lol.leagueoflegendsstats.model.entity.QueueTypeEntity;
import com.lol.leagueoflegendsstats.repository.QueueTypeRepository;
import com.lol.leagueoflegendsstats.service.QueueTypeService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class QueueTypeServiceImpl implements QueueTypeService {
	
	@PersistenceContext
	private EntityManager entityManager;

    private final QueueTypeRepository queueTypeRepository;

    public QueueTypeServiceImpl(QueueTypeRepository queueTypeRepository) {
        this.queueTypeRepository = queueTypeRepository;
    }

    public QueueTypeEntity getQueueTypeById(Long queueTypeId) {
        Optional<QueueTypeEntity> queueTypeOptional = queueTypeRepository.findById(queueTypeId);
        return queueTypeOptional.orElse(null);
    }

    public List<QueueTypeEntity> getAllQueueTypes() {
        return queueTypeRepository.findAll();
    }
}
package com.lol.lolsearchtool.controllers;

import com.lol.lolsearchtool.model.entity.QueueTypeEntity;
import com.lol.lolsearchtool.service.QueueTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/queue-types")
public class QueueTypeController {

    private final QueueTypeService queueTypeService;

    public QueueTypeController(QueueTypeService queueTypeService) {
        this.queueTypeService = queueTypeService;
    }

    @GetMapping
    public ResponseEntity<List<QueueTypeEntity>> getAllQueueTypes() {
        List<QueueTypeEntity> queueTypes = queueTypeService.getAllQueueTypes();
        return new ResponseEntity<>(queueTypes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<QueueTypeEntity> getQueueTypeById(@PathVariable("id") Long id) {
        QueueTypeEntity queueType = queueTypeService.getQueueTypeById(id);
        if (queueType != null) {
            return new ResponseEntity<>(queueType, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
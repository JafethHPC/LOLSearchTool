package com.lol.lolsearchtool.service.impl;

import com.lol.lolsearchtool.model.entity.ItemEntity;
import com.lol.lolsearchtool.repository.ItemRepository;
import com.lol.lolsearchtool.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemEntity getItemById(Integer itemId) {
        return itemRepository.findByItemId(itemId)
                .orElseThrow(() -> new NoSuchElementException("Item not found with ID: " + itemId));
    }

    @Override
    public ItemEntity getItemByName(String name) {
        return itemRepository.findByNameIgnoreCase(name)
                .orElseThrow(() -> new NoSuchElementException("Item not found with name: " + name));
    }
    
}
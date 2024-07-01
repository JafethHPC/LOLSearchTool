package com.lol.lolsearchtool.service;

import com.lol.lolsearchtool.model.entity.ItemEntity;
import java.util.List;

public interface ItemService {
    ItemEntity getItemById(Integer itemId);
    ItemEntity getItemByName(String name);
}
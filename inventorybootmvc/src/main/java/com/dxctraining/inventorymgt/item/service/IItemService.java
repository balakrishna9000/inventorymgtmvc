package com.dxctraining.inventorymgt.item.service;

import java.util.List;

import com.dxctraining.inventorymgt.item.entities.Item;

public interface IItemService {
	void add(Item item);

	void remove(int id);

	Item findItemById(int id);

	List<Item> displayAllItems();


}

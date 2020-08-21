package com.dxctraining.inventorymgt.item.dao;

import java.util.List;

import com.dxctraining.inventorymgt.item.entities.Item;

public interface IItemDao {
	void add(Item item);

	void remove(int id);

	Item findItemById(int id);

	List<Item> displayAllItems();

}

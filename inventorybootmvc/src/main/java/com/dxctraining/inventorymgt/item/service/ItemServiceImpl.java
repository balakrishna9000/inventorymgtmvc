package com.dxctraining.inventorymgt.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.item.dao.IItemDao;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.exceptions.InvalidArgumentException;
import com.dxctraining.inventorymgt.item.exceptions.ItemNotFoundException;

@Transactional
@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    private IItemDao dao;
   
    @Override
    public Item findItemById(int id) {
       Item item= dao.findItemById(id);
        return item;
    }

  @Override
    public void remove(int id) {
     dao.remove(id);
    }
  @Override
    public void add(Item item) {
	  validate(item);
	  dao.add(item);
       
       
    }
  public List<Item> displayAllItems() {
		List<Item>items=dao.displayAllItems();
		return items;
	}
  public void validate(Object arg){
      if(arg==null){
          throw new InvalidArgumentException("argument is null");
      }
  }
	

}

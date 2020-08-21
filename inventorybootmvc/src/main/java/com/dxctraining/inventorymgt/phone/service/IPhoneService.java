package com.dxctraining.inventorymgt.phone.service;

import java.util.List;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.phone.entities.Phone;

public interface IPhoneService {
	Phone findPhoneById(int id);

    void remove(int id);

	Phone add(Phone phone);

	List<Phone> allPhones();

}
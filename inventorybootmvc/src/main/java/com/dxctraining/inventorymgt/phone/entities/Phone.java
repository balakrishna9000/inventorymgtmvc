package com.dxctraining.inventorymgt.phone.entities;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.item.entities.Item;

@Entity
@Table(name="phones")
public class Phone extends Item {
	private int storageSize;

	public Phone(String name, Supplier supplier, int storageSize) {
		super(name, supplier);
		this.storageSize = storageSize;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	@Override
	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		}

		if (arg == null || !(arg instanceof Phone)) {
			return false;
		}

		Phone that = (Phone) arg;
		boolean isequal = this.getId() == that.getId();
		return isequal;
	}

	@Override
	public int hashCode() {
		return this.getId();
	}

}

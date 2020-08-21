package com.dxctraining.inventorymgt.dto;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public class CreatePhoneRequest {


    private String name;

    private Supplier supplier;

    private int storageSize;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
    
}

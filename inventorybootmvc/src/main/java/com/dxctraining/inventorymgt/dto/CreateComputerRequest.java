package com.dxctraining.inventorymgt.dto;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public class CreateComputerRequest {



    private String name;

    private Supplier supplier;

    private int diskSize;

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

	public int getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

}
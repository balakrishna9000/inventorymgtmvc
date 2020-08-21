package com.dxctraining.inventorymgt.supplier.service;

import java.util.List;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierService {
	Supplier add(Supplier supplier);
	Supplier findSupplierById(int id);
	void remove(int id);
	List<Supplier> displayAllSuppliers();


}

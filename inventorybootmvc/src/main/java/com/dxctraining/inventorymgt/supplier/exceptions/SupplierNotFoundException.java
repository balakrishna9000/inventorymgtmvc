package com.dxctraining.inventorymgt.supplier.exceptions;

public class SupplierNotFoundException extends RuntimeException{

    public SupplierNotFoundException(String msg){
        super(msg);
    }

}
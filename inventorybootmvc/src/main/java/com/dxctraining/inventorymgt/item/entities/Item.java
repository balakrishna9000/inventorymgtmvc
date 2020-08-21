package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "items")
public class Item {
	 @Id
	 @GeneratedValue
	private int id;
	private String name;
	@ManyToOne
	private Supplier supplier;
	public Item(String name,Supplier supplier) {
		this.name=name;
		this.supplier=supplier;
	}
	public Item() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	@Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}

	   if(arg==null || !(arg instanceof Item) ) {
			return false;
	   }

	    Item that=(Item)arg;	
		boolean isequal=this.id==that.id;
		return isequal;
	}

    @Override
    public int hashCode(){
		return id;
		}
}

package com.unittesting.learn.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {

	private String name;
	@Id
	private int id;
	private int price;
	private int quantity;
	
	
	@Transient
	private int value;

	public Item(int id, String name, int price, int quantity) {
		this.id  = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return String.format("Item [%d,%s,%d,%d]",id,name,price,quantity);
	}
	
	

}

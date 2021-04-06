package com.arvind.beans;

public class Item {
	
	//create all field in item class
	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemDiscount;
	//generate 0 param constructor 
	public Item() {
		super();
	}
	//Generate n param constructor
	public Item(int itemId, String itemName, double itemOrice, double itemDiscount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemOrice;
		this.itemDiscount = itemDiscount;
	}
	//generate settre and getter
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getItemDiscount() {
		return itemDiscount;
	}
	public void setItemDiscount(double itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	
	
	
}//class

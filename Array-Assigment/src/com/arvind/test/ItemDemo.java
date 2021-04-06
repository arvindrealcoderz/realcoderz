package com.arvind.test;

import java.util.Scanner;

import com.arvind.beans.Item;

public class ItemDemo {
	static Item[] itemArray=null;
	public static void main(String[] args) {
		//create scanner class object
		Scanner sc=new Scanner(System.in);
		int itemId=0;
		String itemName="";
		double itemPrice=0.0;
		double itemDiscount=0.0;
		itemArray=new Item[5];
		for (int i = 0; i <itemArray.length; i++) {
			System.out.print("Enter item Id\t:");
			itemId=sc.nextInt();sc.nextLine();
			System.out.print("Enter item Name\t:");
			itemName=sc.nextLine();
			System.out.print("Enter item Price");
			itemPrice=sc.nextDouble();
			System.out.print("Enter item Discount");
			itemDiscount=sc.nextDouble();sc.nextLine();
			//System.out.println("ItemDemo.main() before ");
			//add item object to array 
			Item item=new Item();
			item.setItemId(itemId);
			item.setItemName(itemName);
			//calculate discount 
			double discount=(itemPrice*itemDiscount)/100;
			item.setItemDiscount(itemDiscount);
			item.setItemPrice(itemPrice-discount);
			itemArray[i]=item;
		}//for
		System.out.println(getLeastPriceItem(itemArray));
	}//main
	public static String getLeastPriceItem(Item[] itemArray) {
		String itemName="";
		double min=itemArray[0].getItemPrice();
		
		for (int i = 1; i < itemArray.length; i++) {
			//System.out.println(itemArray[i].getItemName());
			if(min>itemArray[i].getItemPrice()) 
				min=itemArray[i].getItemPrice();
				//System.out.println(min);
			
		}
		//checking min price of the array 
		for (int i = 0; i < itemArray.length; i++) {
			if(min==itemArray[i].getItemPrice())
				itemName= itemArray[i].getItemName();
		}
		//return itemName
		return itemName;
	}//getLeastPriceItem
}//class

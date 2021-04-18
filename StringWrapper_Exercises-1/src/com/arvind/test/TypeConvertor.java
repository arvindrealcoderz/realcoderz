package com.arvind.test;

public class TypeConvertor {
	
	public static void main(String[] args) {
		TypeConvertor tc=new TypeConvertor();
		System.out.println(tc.binaryToLong("00111111111111111101111111111111111111111"));
		System.out.println(tc.stringToInteger("100"));
	}
	public Long binaryToLong(String binaryNumber){
		//convert binary to long 
		return Long.parseLong(binaryNumber, 2);
	}
	public int stringToInteger(String integerValue){
		//convert string to integer 
		return Integer.valueOf(integerValue);
	}
}

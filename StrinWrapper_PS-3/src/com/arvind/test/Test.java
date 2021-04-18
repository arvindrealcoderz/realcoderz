package com.arvind.test;

class Test {
	public static void main(String[] args) {
		//create stringBuffer object
		StringBuffer sb1=new StringBuffer("java");
		
		//create another stringBuffer object
		StringBuffer sb2=new StringBuffer(sb1);
		//StringBuffer's equals method returns true only when a StringBuffer object
		//is compared with itself. It returns false when compared with any other StringBuffer, 
		//even if the two contain the same characters
		
		
		if(sb1.equals(sb2))
			System.out.println("true");
		else
			System.out.println("false");
	}//main
}//class

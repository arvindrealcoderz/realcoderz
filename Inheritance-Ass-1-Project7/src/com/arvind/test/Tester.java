package com.arvind.test;

import com.arvind.inheritance.Bird;
import com.arvind.inheritance.Creature;

public class Tester{
	public static void main(String[] args) {
		Creature c1=new Bird();
		//I have change methods accessiblility modifier default to public becouse
		//default are provide assissbility only with in ackage
		//protected  are provide current package are its sub class
		//public are provide outside package
		
		System.out.println(c1.getName());
		//System.out.println(c1.hasFeature());
		Creature c2=new  Creature();
		System.out.println(c2.getName());
		
		
		
		
	}//main
}

package com.arvind.inheritance;

public class AirJet extends AirPlane {
	public AirJet() {
		super();//----------> no error : becouse super() call is first statement in the constructor 
		
		System.out.println("AirJet constructor ");
	}
	
	@Override
	void fly() {
		System.out.println("AirJet fly methods ");
		
	}
	//abstract void land(); CE: concreate class does not containe abstruct methods 
	

}

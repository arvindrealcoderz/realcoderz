package com.arvind.inheritance;

public class Paper implements Foldable {
/*
 //@Override is an annotaion which is used to tell compiler this methods is define in super class
  //we have provide implemention in subclass don't consider a normal methdos 
	public void fold() throws Exception {
		System.out.println("Paper.fold()");
	}
*/
	@Override
	public void fold() throws Exception {
		System.out.println("Paper.fold()");
	}

}

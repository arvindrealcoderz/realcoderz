package com.arvind.test;

import com.arvind.inheritance.Foldable;
import com.arvind.inheritance.Paper;

public class Tester {
	public static void main(String[] args) {
		//refrenec variable is interface type 
		//************************
		
		
		
		
		//Its rise CE: becouse this methods may be chance to throws exception we must handle this exception
		//We have two option 
		//1. declare methods to throws Exception 
		//2. Use try catch to handle exception
		//Foldable fold=new Paper();
		
		//fold.fold();
		
		//Solution  ::
		//========
		Foldable fold=new Paper();
		
		try {
			
			fold.fold();
		}catch (Exception e) {
			e.printStackTrace();
		}
		//Case2::
		//refrenec variable is class type 
		Paper p=new Paper();
		try {
			p.fold();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

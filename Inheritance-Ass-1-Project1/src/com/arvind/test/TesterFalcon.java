package com.arvind.test;

import com.arvind.inheritance.Bird;
import com.arvind.inheritance.Creature;
import com.arvind.inheritance.Falcon;

public class TesterFalcon {
	public static void main(String[] args) {
		Creature c1=new Bird();
		Falcon c2=new Falcon();
		//Falcon c3=new Bird();//---subclass refrence variable can't store parent class object .
		//Falcon c4=new Creature();//-subclass refrence variable can't store parent class object .
		Bird c5=new Falcon();
		//Bird c6=new Creature();//-subclass refrence variable can't store parent class object .
		
		
	}

}

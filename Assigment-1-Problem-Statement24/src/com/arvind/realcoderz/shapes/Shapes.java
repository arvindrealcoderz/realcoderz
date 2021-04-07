package com.arvind.realcoderz.shapes;

import com.arvind.realcoderz.Circle;
import com.arvind.realcoderz.Square;
import com.arvind.realcoderz.Triangle;

public class Shapes {
	private int noOfSides;
	
	public int calcuateShapArea(Object type,int noOfSide) {
		
		if(type instanceof Circle) {
			if(noOfSide==1) {
				Circle c=new Circle(10);
				c.calculateArea();
					
			}
		}else if(type instanceof Triangle && noOfSide==3) {
			Triangle t=new Triangle(10);
			t.calculateArea();
			
		}else {
			Square seq=new Square(10);
			seq.calculateArea();
		}
		
		return 0;
	}

}

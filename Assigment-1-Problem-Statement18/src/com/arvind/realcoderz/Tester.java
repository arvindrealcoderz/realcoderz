package com.arvind.realcoderz;

public class Tester {
	public static void main(String[] args) {
		int x=0;//0 1 2 3 4 5 6
		int y=0;//0 1 2 3 3 3 3
		
		for (int z = 0; z < 5; z++) {
			if((++x>2) &&(++y>2)){
				x++;
			}
		}
	System.out.println(x+"   "+y);
	}
}

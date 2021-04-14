
package com.arvind.inheritance;

public  abstract class AirPlane {
	//absruct class cantaine abstract and concreate methods both .becouse it is partial implemention
	
	abstract void fly();
	void land() {
		System.out.println("AirPlane.land()");
	}
	
}

package com.arvind.realcoderz;

public class CarDemo {
	public static void main(String[] args) {
		Car car1=new Car("amaze", 5, 500000.0);
		Car car2=new Car("verna", 5, 5000055450.0);
		Car car3=new Car("bulit", 5, 5087800.0);
		Car car4=new Car("volvo", 5, 50989551.0);
		System.out.println(getBestCar(car1,car2,car3,car4));
	}
	
	static String getBestCar(Car car1, Car car2, Car car3, Car car4) {
		Car one=car1;
		if(one.getOnRoadProce()>car1.getOnRoadProce() && one.getPassengerCapaci()>car1.getPassengerCapaci())
			one=car1;
		else if(one.getOnRoadProce()>car2.getOnRoadProce() && one.getPassengerCapaci()>car2.getPassengerCapaci())
			one=car2;
		else if(one.getOnRoadProce()>car3.getOnRoadProce() && one.getPassengerCapaci()>car3.getPassengerCapaci())
			one=car3;
		else if(one.getOnRoadProce()>car4.getOnRoadProce() && one.getPassengerCapaci()>car4.getPassengerCapaci())
			one=car4;
		return one.getModel();
		
	}
}

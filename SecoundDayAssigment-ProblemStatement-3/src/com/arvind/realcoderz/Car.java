package com.arvind.realcoderz;

import java.util.Locale.Category;
import java.util.Scanner;

public class Car {
	private String model;
	private double passengerCapaci;
	private double onRoadProce;
	
	public Car() {
		System.out.println("Car.Car()");
	}
	
	
	public Car(String model, double passengerCapaci, double onRoadProce) {
		this.model = model;
		this.passengerCapaci = passengerCapaci;
		this.onRoadProce = onRoadProce;
	}


	public String getModel() {
		return model;
	}


	public double getPassengerCapaci() {
		return passengerCapaci;
	}


	public double getOnRoadProce() {
		return onRoadProce;
	}


}
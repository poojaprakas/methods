package com.xworkz.controlStaments;

public class Ac {
	public static void on() {
		System.out.println("Ac is on");
	}
	public static void off() {
		System.out.println("Ac is off");
	}
	public static void increaseTemperature() {
		System.out.println("Ac temperature is increase");
	}
	public static void decreaseTemperature() {
		System.out.println("Ac temperature is decrease");
	}

	public static void main(String[] args) {
		Ac.on();
		Ac.off();
		Ac.increaseTemperature();
		Ac.decreaseTemperature();
		

	}

}

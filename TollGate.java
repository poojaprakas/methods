package com.xworkz.controlStaments;

public class TollGate {
	public static void open() {
		System.out.println("toll gate is open");
	}
	public static void close() {
		System.out.println("toll gate is close");
	}
	public static void tickets() {
		System.out.println("toll gate giving tickets");
	}
	public static void direction() {
		System.out.println("toll gate gives direction for cars");
	}

	public static void main(String[] args) {
		TollGate.open();
		TollGate.close();
		TollGate.tickets();
		TollGate.direction();


	}

}

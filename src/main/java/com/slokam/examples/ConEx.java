package com.slokam.examples;

public class ConEx {

	//
	public ConEx(String name) {
		System.out.println("I am " + name);
	}
	
	public ConEx() {
		System.out.println("zero argument Constructor");
	}

	
	public static void main(String[] args) {
		ConEx ex = new ConEx("bharath");
		ConEx ex1 = new ConEx();
		ex.test1();
	}
	public void test1() {
		System.out.println("abc");
	}

}

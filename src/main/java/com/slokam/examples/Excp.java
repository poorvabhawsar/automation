package com.slokam.examples;

public class Excp {

	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 20;
			int c = b / a;
			System.out.println(c);
			Thread.sleep(2000);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception handled");

	}
}

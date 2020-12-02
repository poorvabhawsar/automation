package com.slokam.examples;

public class A {

	int a = 20;
	static int b = 30;
	
	public static void test2() {
		System.out.println("I am static method");
	}
	public void test1() {
		b = a + b;
		a = a + 20;
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.test1();
		System.out.println(obj.a);
		System.out.println(A.b);
		A obj2 = new A();
		obj2.test1();
		System.out.println(obj2.a);
		System.out.println(A.b);
		A.test2();
	}
}

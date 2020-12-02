package com.slokam.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	
	public void test1() {
		A a = new A();
		ArrayList list = new ArrayList();
		list.add("Bharath");
		list.add(40);
		list.add(true);
		list.add(a);
		
		Object obj = list.get(0);
		//Type casting
		String st = (String) list.get(0);
		A obA = (A)list.get(3);
		System.out.println(obj);
		System.out.println(st);
		System.out.println(obA);
		
		for(int i=0; i<list.size();i++) {
			String ob = (String)list.get(i);
			System.out.println(ob);
		}
		
		int j[] = new int[10];
		
		// Generics 
		ArrayList<String> list2 = new ArrayList<String>();
		String st3 = new String("abhas");
		list2.add(st3);
		
		String st1 = list2.get(0);
		
		List<B> list3 = new ArrayList<B>();
		B bb = new B();
		B b2 = new B();
		list3.add(bb);
		list3.add(b2);
		
		for(int i=0;i<list3.size();i++) {
			B bbb = list3.get(i);
			bbb.test1();
		}
		
		// For each loop
		
		for(B bo : list3 ) {
			bo.test1();
		}
		
		
	}
	
	public static void main(String[] args) {
		ListExample le =new ListExample();
		le.test1();
	}
}

package com.slokam.examples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	
	public void test1() {
		// Wrapper classes
		Set<Integer> set = new HashSet<Integer>();
		set.add(109);
		set.add(200);
		set.add(333);
		
		System.out.println(set.size());
		set.add(109);
		System.out.println(set.size());
		
		for(Integer s : set) {
			System.out.println(s);
		}
		set.remove(109);
	}
	
	public static void main(String[] args) {
		SetExample set = new SetExample();
		set.test1();
	}
}

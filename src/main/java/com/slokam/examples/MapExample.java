package com.slokam.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	
	public void test1() {
		
		Map<Integer,String> map  = new HashMap<Integer,String>();
		
		map.put(1, "bharath");
		map.put(2, "kumar");
		map.put(3, "re");
		map.put(4, "ki");
		map.put(1, "ml");
		System.out.println(map.size());
		
		Set<Integer> se = map.keySet();
		for(Integer i : se) {
			System.out.println("Key : " + i + "value : " + map.get(i));
		}
	}
	
	public static void main(String[] args) {
		MapExample me = new MapExample();
		me.test1();
	}
}

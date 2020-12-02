package com.slokam.automation.opencart.commons.utilites;

import java.util.List;

public class DataManager {

	
	public static boolean compareLists(List<String> actual,List<String> expected) {
		boolean flag = true;
		if(actual.size()!=expected.size()) {
			return false;
		}
		for (String type : expected) {
			if(!actual.contains(type)) {
				System.out.println(type + "is not found in actual list");
				flag =false;
				break;
			}
		}
		
		return flag;
	}
}

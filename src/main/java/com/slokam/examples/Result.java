package com.slokam.examples;

public class Result {

	
	public String result(String name, int marks) throws Exception {
		String status="";
		if(name==null || name.equals("")) {
			throw new NameNotValidException("name not valid");
		}else {
			System.out.println(marks);
			System.out.println(name);
			if(marks>40) {
				status = "pass";
			}else {
				status = "fail";
			}
		}
		
		return status;
	}
}

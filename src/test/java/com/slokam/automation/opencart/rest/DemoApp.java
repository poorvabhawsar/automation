package com.slokam.automation.opencart.rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DemoApp {

	//@Test
	public void test1() {
		
		Response response = given()
		.header("Content-Type", "application/json")
		.body("{\r\n" + 
				"	\"username\":\"user\",\r\n" + 
				"	\"password\":\"password\"\r\n" + 
				"}")
		.post("http://localhost:8080/auth/signin");
		
		System.out.println(response.getStatusCode());
		
		Token tok = response.as(Token.class);
		
		 System.out.println(tok.getToken());
		response = given().header("Authorization", "Bearer "+ tok.getToken()).get("http://localhost:8080/me");
		System.out.println(response.getStatusCode());
		System.out.println(response.body().asString());
	}
	
	@Test
	public void test2() {
		User user = new User();
		user.setUsername("user");
		user.setPassword("password");
		
		Response response = given()
		.header("Content-Type", "application/json")
		.body(user)
		.post("http://localhost:8080/auth/signin");
		Token tok = response.as(Token.class);
		
		 System.out.println(tok.getToken());
		response = given().header("Authorization", "Bearer "+ tok.getToken()).get("http://localhost:8080/me");
		System.out.println(response.getStatusCode());
		
		Roles ro = response.as(Roles.class);
		System.out.println(ro.getUsername());
		System.out.println(ro.getRoles()[0]);
	}
}

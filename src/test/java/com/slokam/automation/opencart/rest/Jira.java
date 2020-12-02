package com.slokam.automation.opencart.rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Jira {

	
	@Test
	public void test1() {
		RestAssured.proxy("www-proxy-rmdc.us.oracle.com", 80);
		Response response = given()
				.auth()
				.preemptive()
				.basic("skkanigi@aconex.com", "Ias143@@@VPN")
				.header("Content-Type", "application/json")
		.get("https://www.acx.link/jira/rest/api/2/issue/175920");
		
		System.out.println(response.getStatusCode());
		

	}
}

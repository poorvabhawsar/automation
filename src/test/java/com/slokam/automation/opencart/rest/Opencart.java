package com.slokam.automation.opencart.rest;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Opencart {

	//@Test
	public void test1() {
		/*RestAssured.useRelaxedHTTPSValidation();
		Response response = given()
		.formParam("username", "Default")
		.formParam("key", "CtUwFiXHlqvH0HdMmUoTstnpyt3sdSYsrr0GKYslZ61atHWqd3ZcMWlQMsRdxIzJaq9o3OsT4EzgeUnSgfai9OiVFRGPESPyt3QXKQPMg1BmQVXF7KlFilPHcHXGTc7zGK8b1kaWfpjHD8QARcLtr0MLJXT8RQluu0hsdmSrNcOt3ZiKODJtPk4tnlV3qHQXLHK6EvpA45Gle55JNDSabfZQJay1qwl2QQ3UbV4NohSN1tSZYTeW63wT1NhiYpzE")
		.post("https://localhost/opencart/index.php?route=api/login");
	
		System.out.println(response.statusCode());
		System.out.println(response.getBody().asString());*/
	
	}
	
	@Test
	public void test2() {
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
		RequestBody body = RequestBody.create(mediaType, "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"username\"\r\n\r\nDefault\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"key\"\r\n\r\nCtUwFiXHlqvH0HdMmUoTstnpyt3sdSYsrr0GKYslZ61atHWqd3ZcMWlQMsRdxIzJaq9o3OsT4EzgeUnSgfai9OiVFRGPESPyt3QXKQPMg1BmQVXF7KlFilPHcHXGTc7zGK8b1kaWfpjHD8QARcLtr0MLJXT8RQluu0hsdmSrNcOt3ZiKODJtPk4tnlV3qHQXLHK6EvpA45Gle55JNDSabfZQJay1qwl2QQ3UbV4NohSN1tSZYTeW63wT1NhiYpzE\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--");
		Request request = new Request.Builder()
		  .url("https://localhost/opencart/index.php?route=api/login")
		  .post(body)
		  .addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
		  .addHeader("cache-control", "no-cache")
		  .build();
		
		try {
			Response response = client.newCall(request).execute();
			String st = response.body().string();
			System.out.println(st);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

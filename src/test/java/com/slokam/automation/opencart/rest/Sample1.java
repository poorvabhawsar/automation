package com.slokam.automation.opencart.rest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Sample1 {

	String url = "https://demo.opencart.com/admin/";
	String username = "user";
	String password = "user123";
	WebDriver driver = null;

	@Test
	public void VerifyStatasticsName() {
		System.out.println("Starting VerifyStatasticsName test " + System.currentTimeMillis());

		DesiredCapabilities cap = null;
		ChromeOptions options = null;
		String browser = "firefox";
		if (browser.equals("chrome")) {
			options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.setCapability(ChromeOptions.CAPABILITY, options);
			options.setCapability("browserName", "chrome");
			options.setCapability("acceptSslCerts", "true");
			options.setCapability("javascriptEnabled", "true");
			cap = DesiredCapabilities.chrome();
			options.merge(cap);

		} else if (browser.equals("firefox")) {
			cap = DesiredCapabilities.firefox();
		}

		URL hubUrl = null;
		try {
			hubUrl = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(hubUrl, options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();

	}

	@Test
	public void VerifyLoginName() {
		System.out.println("Starting VerifyLoginName test " + System.currentTimeMillis());
		DesiredCapabilities cap = null;
		String browser = "firefox";
		if (browser.equals("chrome")) {
			cap = DesiredCapabilities.chrome();
		} else if (browser.equals("firefox")) {
			cap = DesiredCapabilities.firefox();
		}

		URL hubUrl = null;
		try {
			hubUrl = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(hubUrl, cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();

	}

	@Test
	public void VerifyLoginName2() {
		System.out.println("Starting VerifyLoginName test " + System.currentTimeMillis());
		String browser = "firefox";
		DesiredCapabilities cap = null;
		if (browser.equals("chrome")) {
			cap = DesiredCapabilities.chrome();
		} else if (browser.equals("firefox")) {
			cap = DesiredCapabilities.firefox();
		}

		URL hubUrl = null;
		try {
			hubUrl = new URL("http://localhost:4444/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(hubUrl, cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();

	}
}

package com.slokam.automation.opencart.testscripts.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public String browser = "chrome";
	public String url = "https://demo.opencart.com/admin/";
	public String username = "user";
	public String password = "user123";
	public WebDriver driver = null;
	public boolean grid = false;

	@BeforeMethod
	public void launchBrowser() {
		if (grid == true) {
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
		} else {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void login() {
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

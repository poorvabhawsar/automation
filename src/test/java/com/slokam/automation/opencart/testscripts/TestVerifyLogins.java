package com.slokam.automation.opencart.testscripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.AdminLoginPage;
import com.slokam.automation.opencart.commons.pojo.UserLoginDTO;
import com.slokam.automation.opencart.commons.utilites.ExcelManager;
import com.slokam.automation.opencart.testscripts.base.TestBase;

public class TestVerifyLogins extends TestBase{

	
	@Test
	public void test1() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		String username = "u1";
		String password = "p1";
		boolean isLogedIn=  false;
		
		boolean actual = adminLoginPage.login(username,password);
		Assert.assertEquals(actual, isLogedIn);
		
	}
	
	@Test
	public void test2() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		String username = "user";
		String password = "user123";
		boolean isLogedIn=  true;
		
		boolean actual = adminLoginPage.login(username,password);
		Assert.assertEquals(actual, isLogedIn);
		
	}
	
	
	//@Test(dataProvider="excel")
	public void verifyLogin(String username,String password, boolean isLogedIn) {
		
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		boolean actual = adminLoginPage.login(username,password);
		Assert.assertEquals(actual, isLogedIn);
	}
	
	@Test(dataProvider="excelDTO")
	public void verifyLogin(UserLoginDTO dto) {
		
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		boolean actual = adminLoginPage.login(dto.getUsername(),dto.getPassword());
		Assert.assertEquals(actual, Boolean.parseBoolean(dto.getIsLogedIn()));
	}
	
	@DataProvider(name="excelDTO")
	public Iterator<UserLoginDTO> loginDataDTO(){
		ExcelManager excel  =new ExcelManager();
		 Set<UserLoginDTO> set = excel.getDataAsUserDTO();
		return set.iterator();
	}
	
	
	
	@DataProvider(name="excel")
	public Object[][] loginDataPExcel(){
		ExcelManager excel  =new ExcelManager();
		 Set<List<String>> set = excel.getData();
		 
		 Object[][] obj = new Object[set.size()][3];
		
		 int counter =0;
		 for(List<String> li : set) {
			 obj[counter][0] = li.get(0);
			 obj[counter][1] = li.get(1);
			 obj[counter][2] = Boolean.parseBoolean(li.get(2));
			 counter++;
		 }
		 
		 
		return obj;
	}
	
	
	@DataProvider(name="login")
	public Object[][] loginDataP() {
		Object[][] obj = new Object[5][3];
		
		obj[0][0] = "u1";
		obj[0][1] = "p1";
		obj[0][2] = false;
		
		obj[1][0] = "u2";
		obj[1][1] = "p2";
		obj[1][2] = false;
		
		obj[2][0] = "u4";
		obj[2][1] = "p4";
		obj[2][2] = false;
		
		
		obj[3][0] = "u3";
		obj[3][1] = "p3";
		obj[3][2] = false;
		
		
		obj[4][0] = "user";
		obj[4][1] = "user123";
		obj[4][2] = true;
		return obj;
	}
	
	
	
	
}

package com.slokam.automation.opencart.commons.utilites;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class AutoItUtil {
	AutoItX auto = null;
	
	public AutoItUtil() {
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, "C:\\Users\\bkristip\\git\\automation\\src\\test\\resources\\jacob-1.14.3-x64.dll");
		auto = new AutoItX();
	}
	
	
	public void uploadFile(String filePath) {
		auto.winWait("Open");
		auto.winActivate("Open");
		AutomationUtils.sleep(4);
		auto.controlSend("Open", "", "[CLASS:Edit; INSTANCE:1]", filePath);
		auto.controlClick("Open", "", "[CLASS:Button; INSTANCE:1]");
		
	}
}

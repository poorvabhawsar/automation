package com.slokam.automation.opencart.commons.enums;

public enum Navigation {

	SETTINGS,
	ORDERS,
	RETURNS,
	PRODUCTS("Catalog","Products"),
	STATISTICS("Reports","Statistics"),
	FILTERS;
	
	private String item;
	private String subItem;
	
	Navigation(){
		
	}
	
	Navigation(String item,String subItem){
		this.item = item;
		this.subItem = subItem;
	}
	
	public String getItem() {
		return item;
	}
	
	public String getSubItem() {
		return subItem;
	}
	
}

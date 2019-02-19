package com.WMSapplication.helper;

import org.openqa.selenium.WebDriver;

import com.WMSapplication.WMSTest;

public class PageobjectManager {

	private WebDriver driver;
	private WMSTest wmstest;
	
	public PageobjectManager(WebDriver Idriver)
	{
		this.driver = Idriver;
	}
	
	public WMSTest getWMSTest() {
		
		return (wmstest == null) ? wmstest = new WMSTest(driver) : wmstest;
		
	}

}

package com.WMSapp.Runner;

import java.io.File;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.WMSapplication.Baseclass;
import com.WMSapplication.helper.FilereaderManager;
import com.WMSapplication.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\WMSapp\\feature",glue="com.WMSapp.Stepdefinition",

tags = { "@login"})
//tags = { "@login,@Purchasemenu,@Farmdetails"},
/*monochrome = true, dryRun = true, 
strict = false, 
plugin = { "pretty",
		"html:Reports", 
		"json:Reports/Cucumber.json", 
		"junit:Reports/Cucumber.xml" })*/


public class TestRunner {

/*	public static WebDriver driver;
	@BeforeClass
	public static void setup() throws Exception {
		driver = Baseclass.browsers(FilereaderManager.getInstance().getConfigReader().getBrowserName());

	}

	@AfterClass
	public static void tearDown() throws Exception {
		Reporter.loadXMLConfig(
				new File(System.getProperty("user.dir")+"src\\test\\java\\com\\WMSapplication\\resources\\extent-config.xml"));

		driver.quit();}*/


}

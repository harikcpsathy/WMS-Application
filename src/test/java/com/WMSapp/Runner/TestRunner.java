package com.WMSapp.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\WMSapp\\feature",glue="com.WMSapp.Stepdefinition",

tags = { "@RawmaterialsGRN"})
//tags = { "@login,@Purchasemenu,@Farmdetails"})
//monochrome = true, dryRun = true, 
//strict = false, 
/*plugin = { "pretty",
		"html:Reports", 
		"json:Reports/Cucumber.json", 
		"junit:Reports/Cucumber.xml" })*/
public class TestRunner {

}

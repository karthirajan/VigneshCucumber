package com.telecom.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features ----> to specify feature file path
		features="src//test//resources//Features",
		//glue ------> package name where we are having our test scripts
                 glue = "com.telecom.stepdefinition",
                 //plugin ---> to generate reports
                 plugin = {"html:target","json:target/reports.json"},
                 //tags -----> to execute or skip particular scenario
                 tags = "@smoke",
                 //monochrome ----> to remove unwanted symbol from console
                 monochrome = true)

public class TestRunner {
	
	

}

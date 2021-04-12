package com.telecom.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Commonactions{
	
	
	
	@Before
	public void beforeScenario() {
		
		launch("http://www.demo.guru99.com/telecom/");

	}
	
	@After
	public void afterSce() {
		
		
		driver.close();

	}

}

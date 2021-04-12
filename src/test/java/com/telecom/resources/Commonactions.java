package com.telecom.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	public static WebDriver launch(String url) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get(url);
		return driver;		

	}
	
	public void insertText(WebElement ele,String value) {
		
         ele.sendKeys(value);
		
	}
	
	public void button(WebElement ele) {
		ele.click();

	}

}

package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AddCustomerSteps {
	
	

	@Given("user clicks on add customer button")
	public void user_clicks_on_add_customer_button() {
		
		Hooks.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("user fill all the details")
	public void user_fill_all_the_details() {
		
		Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys("karthi");
		Hooks.driver.findElement(By.id("lname")).sendKeys("rajan");
		Hooks.driver.findElement(By.id("email")).sendKeys("karthi@gmail.com");
		Hooks.driver.findElement(By.name("addr")).sendKeys("thanjavur");
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys("567564653");
	    
	}
	
	
	@When("user fill all the details {string},{string},{string},{string},{string}")
	public void user_fill_all_the_details(String fname, String lname, String mail, String addr, String phno) {
		
		Hooks.driver.findElement(By.xpath("//label[@for='done']")).click();
		Hooks.driver.findElement(By.id("fname")).sendKeys(fname);
		Hooks.driver.findElement(By.id("lname")).sendKeys(lname);
		Hooks.driver.findElement(By.id("email")).sendKeys(mail);
		Hooks.driver.findElement(By.name("addr")).sendKeys(addr);
		Hooks.driver.findElement(By.id("telephoneno")).sendKeys(phno);
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
		
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	}


}

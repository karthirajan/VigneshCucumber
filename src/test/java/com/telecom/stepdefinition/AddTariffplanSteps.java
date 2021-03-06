package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariffplanSteps {
	
	

	@Given("user click on add tariff button")
	public void user_click_on_add_tariff_button() {
		
		Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	    
	}

	@When("user fill up the plan details")
	public void user_fill_up_the_plan_details() {
		
		Hooks.driver.findElement(By.id("rental1")).sendKeys("100");
		Hooks.driver.findElement(By.id("local_minutes")).sendKeys("200");
		Hooks.driver.findElement(By.id("inter_minutes")).sendKeys("300");
		Hooks.driver.findElement(By.id("sms_pack")).sendKeys("400");
		Hooks.driver.findElement(By.id("minutes_charges")).sendKeys("1");
		Hooks.driver.findElement(By.id("inter_charges")).sendKeys("2");
		Hooks.driver.findElement(By.id("sms_charges")).sendKeys("3");
	    
	}

	@When("user clicked on submit button")
	public void user_clicked_on_submit_button() {
		
		Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("user should be displayed congratulation message")
	public void user_should_be_displayed_congratulation_message() {
		
		Assert.assertEquals("Congratulation you add Tariff Plan", Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText());
	    
	}

}

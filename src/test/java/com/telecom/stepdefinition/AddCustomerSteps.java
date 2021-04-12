package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddCustomerPage;
import com.telecom.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AddCustomerSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	AddCustomerPage acp = new AddCustomerPage();

	@Given("user clicks on add customer button")
	public void user_clicks_on_add_customer_button() {
		
		ca.button(acp.getAddCustomerButton());
	    
	}

	@When("user fill all the details")
	public void user_fill_all_the_details() {
		
		ca.button(acp.getDoneBtn());
		ca.insertText(acp.getFname(), "karthi");
		ca.insertText(acp.getLname(), "rajan");
		ca.insertText(acp.getEmail(), "karthi@gmail.com");
		ca.insertText(acp.getAddr(), "chennai");
		ca.insertText(acp.getPhno(), "575876988");
		
		
	    
	}
	
	
	@When("user fill all the details {string},{string},{string},{string},{string}")
	public void user_fill_all_the_details(String fname, String lname, String mail, String addr, String phno) {
		
		ca.button(acp.getDoneBtn());
		ca.insertText(acp.getFname(), fname);
		ca.insertText(acp.getLname(), lname);
		ca.insertText(acp.getEmail(), mail);
		ca.insertText(acp.getAddr(), addr);
		ca.insertText(acp.getPhno(), phno);
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		ca.button(acp.getSubmitBtn());
	   
	}

	@Then("user should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
		
		Assert.assertTrue(acp.getCustomerID().isDisplayed());
	    
	}


}

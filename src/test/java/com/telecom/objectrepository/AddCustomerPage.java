package com.telecom.objectrepository;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonactions;

public class AddCustomerPage extends Commonactions{
	
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomerButton;
	
	@FindBy(xpath="//label[@for='done']")
	private WebElement doneBtn;
	
	@FindBy(id="fname")
	private WebElement fname;
	
	@FindBy(id="lname")
	private WebElement lname;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="addr")
	private WebElement addr;
	
	@FindBy(id="telephoneno")
	private WebElement phno;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="(//td[@align='center'])[2]")
	private WebElement customerID;

	public WebElement getAddCustomerButton() {
		return addCustomerButton;
	}

	public WebElement getDoneBtn() {
		return doneBtn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getCustomerID() {
		return customerID;
	}
	
	
	
	
}

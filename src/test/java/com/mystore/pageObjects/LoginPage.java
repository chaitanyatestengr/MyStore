package com.mystore.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	// LoginPage constructor to initialize PageFactory
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Storing username field Locator using FindBy
	@FindBy(name = "userName")
	WebElement userName_Locator;

	// Storing password field Locator using FindBy
	@FindBy(name = "password")
	WebElement password_Locator;

	// Storing Sign-in button Locator using FindBy
	@FindBy(name = "login")
	WebElement signinbtn_Locator;

	//Action classes which enters username and password 
	public void setUserName(String uname) {
		userName_Locator.sendKeys(uname);
	}

	public void setPassword(String pwd) {

		password_Locator.sendKeys(pwd);
	}

	public void clickOnSignIn() {

		signinbtn_Locator.click();
	}

}

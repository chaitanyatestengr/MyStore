package com.mystore.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.ReadConfig;

public class BaseClass {

	// creating object of ReadConfig class
	ReadConfig readconfig = new ReadConfig();

	//storing values by calling methods of ReadConfig class
	public String baseUrl = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	Logger logger;

	//This method will setup Log4j settings and browser settings.This method will execute before the class
	@BeforeClass
	public void setUp() {
		logger = Logger.getLogger("Mercury Tours");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.drievr", readconfig.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	//This method will close all the connections. It will execute after the class
	@AfterClass
	public void teardown() {

		driver.quit();
	}

}

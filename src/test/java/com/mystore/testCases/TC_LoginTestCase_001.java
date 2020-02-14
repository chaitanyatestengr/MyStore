package com.mystore.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mystore.pageObjects.LoginPage;

public class TC_LoginTestCase_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {

		logger.info("URL opened Succesfully");

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("Entered Username");

		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickOnSignIn();
		logger.info("SignIn button clicked");

		Thread.sleep(3000);

		boolean loginVerify = driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).isDisplayed();
		if (loginVerify = true) {
			logger.info("Login Succesful");
		} else {
			logger.info("Login failed");
		}

	}
}

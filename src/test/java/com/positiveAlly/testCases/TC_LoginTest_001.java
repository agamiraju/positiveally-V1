package com.positiveAlly.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.positiveAlly.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws InterruptedException, IOException 
	{
		logger.info("URL is opened!");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is Entered");
		Thread.sleep(1000);
		lp.setPassword(password);
		logger.info("Password is Entered");
		Thread.sleep(1000);
		lp.clickLogin();
		Thread.sleep(1000);

		if (driver.findElement(By.linkText("Edit Signature")).isDisplayed() == true)

		{
			Assert.assertTrue(true);
			logger.info("Login test passed!");
		} else {
			// Pass the loginTest Method name
			Thread.sleep(2000);
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			Thread.sleep(2000);
			logger.info("Login Test Failed");
		}
	}

}

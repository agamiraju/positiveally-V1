package com.positiveAlly.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
		logger.info("Username is Entered.");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lp.setPassword(password);
		logger.info("Password is Entered.");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lp.clickLogin();
		logger.info("Clicked on Login button!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		if (driver.findElement(By.linkText("Welcome Raju")).isDisplayed() == true)

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

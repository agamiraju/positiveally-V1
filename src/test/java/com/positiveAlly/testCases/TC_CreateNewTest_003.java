package com.positiveAlly.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

//import com.google.j2objc.annotations.AutoreleasePool;
import com.positiveAlly.pageObjects.Create_Account_VirginiaPage;

import junit.framework.Assert;

public class TC_CreateNewTest_003 extends BaseClass {
	
	@Test
	public void createAccount_Parent(String email) throws InterruptedException {
		logger.info("Launch the first URL");
		Create_Account_VirginiaPage newaccount = new Create_Account_VirginiaPage(driver);

		newaccount.setClickCreateAccount();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Providing customer details....");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.custNamea("Raju");
		logger.info("Entered Firstname");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.setMiddleName("Kumar");
		logger.info("Entered middle name");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		newaccount.setLastName("Yadav");
		logger.info("Entered last name");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.setStreetAddress1("Calfornia");
		logger.info("Entered address1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.setStreetAddress2("Calfornia");
		logger.info("Entered address2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.select_listState();
		logger.info("clicked state name");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.select_state();
		logger.info("Selected virginia state");
		Thread.sleep(1000);

		newaccount.setCityName("Afton");
		logger.info("Entered city name");
		Thread.sleep(1000);

		newaccount.clickCityName();
		logger.info("Clicked on Afton city name");
        Thread.sleep(1000);
        
		newaccount.setZip("12345");
		logger.info("Selected zipcode");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.setEmailId(email);
		logger.info("Entered email address");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.setPassword("123456");
		logger.info("Entered password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.setconfirm_password("123456");
		logger.info("Entered confirm password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		newaccount.clickSignup();
		logger.info("Clicked signup button");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Validation started...");

	}

	@Test
	public void register_parent() 
	{
		try {
			createAccount_Parent("agami.test004@gmail.com");

			boolean res = driver.getPageSource().contains("Positive Ally — Registration");
			//"Activation link has been sent to your email. Please follow instructions in that email to activate your account. Check your spam folder if you do not receive the activation link email within 3 minutes.

			if (res == true) {
				Assert.assertTrue(true);
				logger.info("Test case is passed!");
				Thread.sleep(1000);
				TC_VerifyParentAccount_006 verifyParent = new TC_VerifyParentAccount_006();
				verifyParent.verifyAccount_Parent();

			} else {
				Create_Account_VirginiaPage newaccount = new Create_Account_VirginiaPage(driver);
				
				newaccount.existEmailid();
				logger.info("Clicked on back button, exist email Id");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				createAccount_Parent("agami.test013@gmail.com");
			}
		} 
		
		 catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
}

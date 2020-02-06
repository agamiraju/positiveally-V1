package com.positiveAlly.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.Admin_AddUserPage;

import junit.framework.Assert;

public class TC_Admin_AddUserAccountTest_002 extends BaseClass
{
	@Test
	public void admin_AddUserAcoount() throws InterruptedException, IOException
	{
		Admin_AddUserPage adminUser = new Admin_AddUserPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		adminUser.overMouseUser();
		logger.info("Mouse Over User");
		Thread.sleep(2000);
		
		adminUser.addUserAccount();
		logger.info("Click on Add UserAccount");
		Thread.sleep(1000);

		adminUser.selectPrivileges();
		logger.info("Select Privileges Parent");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		adminUser.selectStateUser();
		logger.info("Select User State");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		adminUser.selectCityUser("Afton");
		logger.info("Enter City Name User");
		Thread.sleep(2000);
		
		adminUser.setFirstNameUser("Harry");
		logger.info("Enter First Name Parent");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		adminUser.setLastNameUser("Katiyar");
		logger.info("Enter Last Name Parent");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		adminUser.setEmailUser("raju005@gmail.com");
		logger.info("Enter Email Id");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*// Random entering Email id
		String email = randomestring()+ "@gmail.com";
		adminUser.setEmailUser(email);*/
		
		adminUser.setStreetAddress1("Calfornia 420 Court City");
		logger.info("Enter Street Address");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		adminUser.setStreetAddress2("Virginia Wz 420 Court City");
		logger.info("Enter Street Address Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		adminUser.setZipCodeUser("12345");
		logger.info("Enter Zip Code");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		adminUser.setPasswordUser("123456");
		logger.info("Enter Passowrd");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		adminUser.clickSaveUser_Button();
		logger.info("Click save User to create account!");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		logger.info("Verification Point...");
		boolean res = driver.getPageSource().contains("User Created Successfully And Password and Login ID Mailed To User");
		
		if (res == true)
		{
			Assert.assertTrue(true);
			logger.info("Parent/User Account has been created Sucessfully!");
			Thread.sleep(3000);
			adminUser.clickBackButtonVerify();
		}
		else
		{
			logger.info("Test case Failed!");
			captureScreen (driver, "admin_AddUserAcoount");
			Assert.assertTrue(false);
		}
		
	}


/*//Random Numaber Method (Unique email id)
	public String randomestring()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}*/
}

package com.positiveAlly.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.Create_Account_WashingtonPage;

import junit.framework.Assert;

public class TC_Create_Account_Washington_006 extends BaseClass
{
	UserAccount_Verify_AdminTest_012 verify_parentAccount = new UserAccount_Verify_AdminTest_012();
	TC_Student_Registration_WA_AfterSchoolTest_013 afterSchool_Registration = new TC_Student_Registration_WA_AfterSchoolTest_013();
	@Test
	public void create_Account_WA() throws IOException, InterruptedException
	{
		logger.info("Url is opened!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Create_Account_WashingtonPage user_Account_WA = new Create_Account_WashingtonPage(driver);
		
		user_Account_WA.click_Create_NewAccount();
		logger.info("Click on create new account link!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_Firstname("Rajeev");
		logger.info("Enter user First name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_MiddleName("Kumar");
		logger.info("Enter User middle name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_LastName("Singh");
		logger.info("Enter User Last Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_StreetAddress1("Wz-420 High Court Calfornia");
		logger.info("Enter User Street Address1");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_StreetAddress2("WA 320 IT Court Washington");
		logger.info("Enter User Street Address2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_State();
		logger.info("Select State Name Washington");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.selectUser_City("Addy");
		logger.info("Select User City name Addy!");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.click_txtCityName();
		logger.info("Click on addy User City name Addy!");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		user_Account_WA.setUser_Zip("12345");
		logger.info("Enter User Zip code");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_Email("agami.test005@gmail.com");
		logger.info("Enter User Email id");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_Password("123456");
		logger.info("Enter User password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_confirmPassword("123456");
		logger.info("Enter user confirm Password!");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		user_Account_WA.setUser_Singup();
		logger.info("Click on signup button!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Positive Ally — Registration";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("User Account has been Registered Sucessfully!");
			Thread.sleep(1000);
			
			//Clicked on back button after getting registration message.
			user_Account_WA.clickBackButtonVerify();
			logger.info("Click on back button of the Aeactivation Link!");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			// Verify the parent account from admin side(Code)=============
			verify_parentAccount.user_AccountVerify_Admin();
			
			//Login Parent Account=================================
			user_Account_WA.user_Email("agami.test005@gmail.com");
			logger.info("Enter email id");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			user_Account_WA.user_Pass("123456");
			logger.info("Enter password.");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			user_Account_WA.user_Login_btn();
			logger.info("Clicked on Login button.");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			
			
			//Student registration for after school program==============
			afterSchool_Registration.studRegistration_WA_AfterSchool();
			
		}
		else
		{
			logger.info("Test case Failed!");
			captureScreen (driver, "create_Account_WA");
			Assert.assertTrue(false);
		}
		
		
		
	}

}

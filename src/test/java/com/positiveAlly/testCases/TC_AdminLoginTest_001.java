package com.positiveAlly.testCases;
import java.io.IOException;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.Admin_LoginPage;
import com.positiveAlly.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AdminLoginTest_001 extends BaseClass
{
	TC_Admin_AddUserAccountTest_002 addUserAccount = new TC_Admin_AddUserAccountTest_002();
	TC_RegisterSibling_VA_004 sibling_registration = new TC_RegisterSibling_VA_004();
	TC_Student_Registration_VA_005 studentRegistration = new TC_Student_Registration_VA_005();
	@Test
	public void adminLogin() throws InterruptedException, IOException
	{
		logger.info("URL is opened!");
		
		Admin_LoginPage  adminlogin = new Admin_LoginPage(driver);
		adminlogin.setAdminEmail("admin@positiveally.org");
		logger.info("Enter admin address!");
		Thread.sleep(1000);
		
		adminlogin.setAdminPassword("positiveally");
		logger.info("Enter Admin Password!");
		Thread.sleep(1000);
		
		adminlogin.clickAdminLog_In();
		logger.info("Click on Log In Button!");
		Thread.sleep(1000);
		
		logger.info("Verification Points...");
		boolean res = driver.getPageSource().contains("Welcome to Admin Page !");
		
		if (res == true)
		{
			Assert.assertTrue(true);
			logger.info("Test case is passed!");
			Thread.sleep(1000);
			addUserAccount.admin_AddUserAcoount();
			Thread.sleep(1000);
			adminlogin.mouseOverAdministrator();
			Thread.sleep(1000);
			adminlogin.Administrator_Logout();
			Thread.sleep(2000);
			//studentRegistration.studentRegistration();
			//sibling_registration.registerSibling();
			//adminUserList.admin_UserList();
		
		}
		else
		{
			logger.info("Test case Failed!");
			captureScreen (driver, "adminLogin");
			Assert.assertTrue(false);
		}
		
	}
		
	}


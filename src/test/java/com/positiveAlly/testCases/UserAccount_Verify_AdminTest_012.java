package com.positiveAlly.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.UserAccount_Verify_AdminPage;

public class UserAccount_Verify_AdminTest_012 extends BaseClass
{
	@Test
	public void user_AccountVerify_Admin() throws InterruptedException
	{
		
		UserAccount_Verify_AdminPage user_AccountVerify = new UserAccount_Verify_AdminPage(driver);
		
		//Login admin account details=========================
		user_AccountVerify.admin_emailId("admin@positiveally.org");
		logger.info("Enter email of the admin!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		user_AccountVerify.admin_password("positiveally");
		logger.info("Enter password of the admin!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		user_AccountVerify.admin_login_button();
		logger.info("Clicked on the login button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Clicked on the user list==================================
		user_AccountVerify.click_userList();
		logger.info("Clicked on user list image.");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		/*// Search Email id of the parent to verify account=========
		user_AccountVerify.select_search_option();
		logger.info("Clicked on search option.");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		user_AccountVerify.select_search_Email();
		logger.info("Encode and decoded values");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		user_AccountVerify.select_emailName("agami.test002@gmail.com");
		user_AccountVerify.click_search_Email();
		logger.info("Clicked on search email.");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		user_AccountVerify.click_search();
		logger.info("Clicked on search button!.");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		*/
		//Clicked on activate button==============
		user_AccountVerify.click_ActivateLock();
		logger.info("Clicked on activate button of the parent account!.");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		// Admin Logout==========================
		user_AccountVerify.mouseOverAdministrator();
		logger.info("MouseOver on administration name!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		user_AccountVerify.clickLogoutButton();
		logger.info("Clicked on logout button of the admin!.");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		
		
		
		
	}

}

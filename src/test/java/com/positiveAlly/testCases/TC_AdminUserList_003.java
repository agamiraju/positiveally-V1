package com.positiveAlly.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.Admin_User_ListPage;

import junit.framework.Assert;

public class TC_AdminUserList_003 extends BaseClass
{
	@Test
	public void admin_UserList() throws InterruptedException, IOException
	{
		Admin_User_ListPage adminUserlist = new Admin_User_ListPage(driver);
		
		adminUserlist.mouseOverUser();
		logger.info("MOuse Over on User.");
		Thread.sleep(2000);
		
		adminUserlist.clickUserList();
		logger.info("Click on user.");
		Thread.sleep(3000);
		
		adminUserlist.setUserNameSelect("Larryq");
		logger.info("Select user Name");
		Thread.sleep(5000);
		
		adminUserlist.clickUserSearch();
		logger.info("Click on search button");
		Thread.sleep(3000);
		
		adminUserlist.clickActiveButton();
		logger.info("Click Active BUttton");
		Thread.sleep(3000);
		
		// Admin Administrator Logout===============
		adminUserlist.mouseOverAdministrator();
		logger.info("Mouse over welcome Administrator");
		Thread.sleep(4000);
		
		adminUserlist.clickLogoutButton();
		logger.info("Click on Logout Button");
		Thread.sleep(3000);
		
		logger.info("Verification Points...");
		boolean res = driver.getPageSource().contains("LOGIN");
		
		if (res == true)
		{
			Assert.assertTrue(true);
			logger.info("Test case is passed!");
			Thread.sleep(3000);
			
		}
		else
		{
			logger.info("Test case Failed!");
			captureScreen (driver, "admin_UserList");
			Assert.assertTrue(false);
		}
		
		
	}

}

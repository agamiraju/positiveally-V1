package com.positiveAlly.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.LoginPage;
import com.positiveAlly.pageObjects.Parent_Account_GmailVerifyPage;

public class TC_VerifyParentAccount_006 extends BaseClass
{
	@Test
	public void verifyAccount_Parent() throws InterruptedException, AWTException
	{
		//Use robot class to press Ctrl+t keys     
		 Robot robot = new Robot();                          
		 robot.keyPress(KeyEvent.VK_CONTROL); 
		 robot.keyPress(KeyEvent.VK_T); 
		 robot.keyRelease(KeyEvent.VK_CONTROL); 
		 robot.keyRelease(KeyEvent.VK_T);
	    
		//Switch focus to new tab
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		//Launch URL in the new tab
		
		driver.get("https://accounts.google.com/signin");
		logger.info("Opened gmail url.");
	    Thread.sleep(1000);
	    
	    Parent_Account_GmailVerifyPage verify_ParentAccount = new Parent_Account_GmailVerifyPage(driver);

		verify_ParentAccount.setEmailAddress("agami.test003@gmail.com");
		logger.info("Entered email id");
	    Thread.sleep(1000);

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    verify_ParentAccount.setClickNext();
		logger.info("Clicked on Next Button");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		verify_ParentAccount.setPassword("Agami@2016");
		logger.info("Entered password");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		verify_ParentAccount.setClickNextButton();
		logger.info("Clicked on next button");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		verify_ParentAccount.click_menu();
		logger.info("Click on menu!");
		Thread.sleep(3000);
		
		//First Get parent window,means current window handle
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Title " + driver.getTitle());
		
		verify_ParentAccount.click_Gmail();
		logger.info("Clicked on gmail");
		Thread.sleep(2000);
		
		//Get All Tabs or Window handles and iterate using for each loop
		  for (String handle: driver.getWindowHandles()) {
		   System.out.println(handle);
		   driver.switchTo().window(handle);

		  }
		
		verify_ParentAccount.setClickEmailName();
		logger.info("Clicked on email id name");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//Go back to Parent window
		  driver.switchTo().window(parentWindow);
		
		
		 driver.switchTo().window(tabs.get(0));
		 Thread.sleep(2000);
	
		  
		//Click on Cart Button
		verify_ParentAccount.setClickVerifyEmail();
		logger.info("Clicked on verify email name link.");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		 
		 verify_ParentAccount.click_LoginText();
		 logger.info("Clicked on login button");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		 verify_ParentAccount.setUserEmail("agami.test004@gmail.com");
		 logger.info("Enter email id of the user");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		 verify_ParentAccount.password("123456");
		 logger.info("Enter password");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		 verify_ParentAccount.btnLogin();
		 logger.info("Clicke on login button");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		
		
	}
	
	

}

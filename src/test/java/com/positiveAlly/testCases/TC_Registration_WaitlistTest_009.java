package com.positiveAlly.testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.LoginPage;
import com.positiveAlly.pageObjects.Registration_Waitlist_VAPage;

public class TC_Registration_WaitlistTest_009 extends BaseClass
{
	@Test
	public void registration_Waitlist() throws InterruptedException
	{
		/*// Login Account parent======================
		logger.info("URL is opened!");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is Entered");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lp.setPassword(password);
		logger.info("Password is Entered");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/
		
		//Create Object to access action methods==============
		Registration_Waitlist_VAPage register_waitlist = new Registration_Waitlist_VAPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*//If parent logged and already register one student====
		register_waitlist.Sibling_Registration();
		logger.info("Clicked on sibling register");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
		//If parent is not logged==========================
		register_waitlist.home_Register();
		logger.info("Cliecked on Register module");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.academic_Session();
		logger.info("Clicked on academic session");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.select_sessionName();
		logger.info("Select session name 2018 - 2019");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.click_State();
		logger.info("Clicked on state name");
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		register_waitlist.select_StateName();
		logger.info("Select state name");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.clicknumberofStudent();
		logger.info("Clicked on student number");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.selectnumberofStudent();
		logger.info("Select number of the student");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.clickGrade();
		logger.info("Clicked on grade name");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.selectgradename();
		logger.info("Select grade name");
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		register_waitlist.click_schooldist();
		logger.info("clicked on school distric name");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.selectSchoolDistrict();
		logger.info("Select school district name");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.click_school();
		logger.info("Clicked on school name");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.select_School_name();
		logger.info("select school name");
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		register_waitlist.click_search_Button();
		logger.info("Clicked on search button");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		// Clicked on register in waitlist button==========
		register_waitlist.click_Registerwaitlist();
		String parentWindowHandle = driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		String lastWindowHandle = "";
		
		for(String handle : allWindowHandles)
		{
			lastWindowHandle = handle;
		}
		driver.switchTo().window(lastWindowHandle);
		logger.info("clicked on register waitlist button");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Student's Waitlist Details========================
		register_waitlist.studentfirstname("Mike");
		logger.info("Enter first name of the student");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Date of birth of the student============================
		register_waitlist.dateofbirth_student();
		logger.info("click on date of the student");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.selectmonth();
		logger.info("Select month of the date of the birth");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.selectyear();
		logger.info("Select year of the student date of the birth");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.clickdateof_birth();
		logger.info("Clicked on the date of birth");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.parentname("Larry");
		logger.info("Enter parent name");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.cell_Phone("8978988987");
		logger.info("Enter cell phone");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.father_email("agami.test006@gmail.com");
		logger.info("Enter email id parent");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		register_waitlist.click_submitButton();
		logger.info("Clicked on submit button of the waitlist form.");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Registration Success";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Student has been Waitlist-Registered Sucessfully!");
			Thread.sleep(1000);
		}
		else {
			System.out.println("Student has not been Waitlist-Registered Sucessfully!");
			Thread.sleep(1000);
		}
		
	}

}

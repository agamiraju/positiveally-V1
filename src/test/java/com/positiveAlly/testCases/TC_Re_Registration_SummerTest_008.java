package com.positiveAlly.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.LoginPage;
import com.positiveAlly.pageObjects.Re_Registration_SummerPage;

public class TC_Re_Registration_SummerTest_008 extends BaseClass
{
	@Test
	public void re_Registration_Summer() throws InterruptedException
	{
		logger.info("URL is opened!");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is Entered");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lp.setPassword(password);
		logger.info("Password is Entered");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Re_Registration_SummerPage re_registration_summer = new Re_Registration_SummerPage(driver);
		
		re_registration_summer.linkRe_Registration();
		logger.info("Clicked on Re-Registration");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.checkBox_Re_Registration();
		logger.info("Select check box of the student");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.summer_Program();
		logger.info("Select summer program");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.re_Register_button();
		logger.info("Clicked on register button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Student_Name();
		logger.info("Click on student name");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//Week 1- A.M Camps - 8:15-1:00 p.m.=====================
		re_registration_summer.click_Enrichment1();
		logger.info("Clicked on add button of enrichment1");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		/*re_registration_summer.click_Fieldtrip1();
		logger.info("Clicked on add button of the fieldtrip1");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/
		
		/*//Week 2- A.M Camps - 8:15-1:00 p.m.=====================
		re_registration_summer.click_Enrichement2();
		logger.info("Clicked on add button of enrichment2");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldtrip2();
		logger.info("Clicked on add button of fieldtrip2");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Week 3- A.M Camps - 8:15-1:00 p.m.=====================
		re_registration_summer.click_Enrichement3();
		logger.info("Clicked on add button of enrichment3");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldetrip3();
		logger.info("Clicked on add button of fieldtrip3");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Week 4- A.M Camps - 8:15-1:00 p.m.=====================
		re_registration_summer.click_Enrichement4();
		logger.info("Clicked on add button of the enrichment4");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldetrip4();
		logger.info("Cliecked on add button of fieldtrip4");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			@FindBy (id = "submit")
	@CacheLookup
	WebElement click_Submit;
		//Week 5- A.M Camps - 8:15-1:00 p.m.=====================
		re_registration_summer.click_Enrichement5();
		logger.info("Clicked on add button of enrichment5");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldetrip5();
		logger.info("Clicked on add button of fieldtrip5");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Week 6- A.M Camps - 8:15-1:00 p.m.=====================
		re_registration_summer.click_Enrichement6();
		logger.info("Clicked on add button the enrichment6");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldetrip6();
		logger.info("Clicked on add button of the fieldtrip6");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Week 7- A.M Camps - 8:15-1:00 p.m.=====================
		re_registration_summer.click_Enrichement7();
		logger.info("Clicked on add button of the enrichment7");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldetrip7();
		logger.info("Clicked on add button of the fieldTrip7");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Week 8- A.M Camps - 8:15-1:00 p.m.===================
		re_registration_summer.click_Enrichement8();
		logger.info("Clicked on add button of the enrichment8");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldetrip8();
		logger.info("Clicked on the add button of the fieldtrip8");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Week 9- A.M Camps - 8:15-1:00 p.m.===================
		re_registration_summer.click_Enrichement9();
		logger.info("Cliecked on the add button of the enrichmnet9");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldetrip9();
		logger.info("Cliecked on the add button of the fieldtrip9");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		//Week 10- A.M Camps - 8:15-1:00 p.m.===================
		re_registration_summer.click_Enrichement10();
		logger.info("Clicked on add button of the enrichment10");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.click_Fieldetrip10();
		logger.info("Clicked on the add button of the fieldtrip10");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/
		
		//Including Allergies===================================
		/*re_registration_summer.txt_including_Allergies("He has allergies");
		logger.info("Enter allergies name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/
		
		//Proceed to Payment============================
		re_registration_summer.click_ProceedToPayment();
		logger.info("Clicked on proceed to payment");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Edit button of the Checkout=====================
		re_registration_summer.click_Edit_Payment();
		logger.info("Click on edit button of the payment");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Student name to edit weeks======================
		re_registration_summer.edit_Student_Summer();
		logger.info("Clicked on edit student summer");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Proceed to Payment===============================
		re_registration_summer.previous_ProceedToPayment();
		logger.info("Clicked on previous payment button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Tuition Summary Details====================
		re_registration_summer.checkBoxTermsConditions3();
		logger.info("Checked checkbox of the terms and conditions");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Checkout Process==========================
		re_registration_summer.clickCheckoutButton1();
		logger.info("Click on checkout button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*//Payment Page Using PromoCode 333 Payment Method================
		re_registration_summer.clickHavePromoCode2();
		logger.info("Clicked on promo code");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtHavePromoCode2("333");
		logger.info("Enter promo code");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtClickAppy2();
		logger.info("Clicked on apply button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		re_registration_summer.clickSubmitPayment2();
		logger.info("Clicked on the submit button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		*/
		//Payment Credit Card Details=======================
		re_registration_summer.txtCardHolderName2("JASON HODGES");
		logger.info("Enter card holder name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtStreetAddress2("435 calfornia court");
		logger.info("Enter street address");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtCityName2("Calfornia");
		logger.info("Enter city name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtZipCode2("12345");
		logger.info("Enter zip code");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtPhoneNumber2("8789898998");
		logger.info("Enter phone number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtCreaditCardNumber2("4916010425776386");
		logger.info("Enter credit card number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtExpirationMonth2();
		logger.info("Select expiration month");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtExpirationYear2();
		logger.info("Select year of the expiration");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.txtCardSecurityNumber2("633");
		logger.info("Enter card security number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration_summer.clickPaymentSubmit2();
		logger.info("Clicked on payment button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Positive Ally — Registration";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Student has been Re-Registered Sucessfully!");
			Thread.sleep(1000);
		}
		else {
			System.out.println("Student has not been Re-Registered Sucessfully!");
			Thread.sleep(1000);
		}
		
	}

}

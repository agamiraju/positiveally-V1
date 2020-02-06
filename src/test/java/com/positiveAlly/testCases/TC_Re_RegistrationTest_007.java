package com.positiveAlly.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.LoginPage;
import com.positiveAlly.pageObjects.Re_RegistrationPage;

public class TC_Re_RegistrationTest_007 extends BaseClass
{
	@Test
	public void re_Registration() throws InterruptedException
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
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Click on Re-Registration Module====================
		Re_RegistrationPage re_registration = new Re_RegistrationPage(driver);
		re_registration.re_Registration();
		logger.info("Clicked on Re-Registration module");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.re_Registration_checkbox();
		logger.info("Clicked on check box button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.select_Program();
		logger.info("Select program name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.re_Register();
		logger.info("Clicked on re_Register Button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.proceedToPayment();
		logger.info("Proceed to Payment Button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.click_EditPaymentButton();
		logger.info("Click on edit Payment Button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.previous_ProceedToPayment();
		logger.info("Click on previous proceed to payment button!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Tuition Summary Details=======================
		re_registration.boxTermsConditions();
		logger.info("Click on checkbox button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Checkout Process===============================
		re_registration.checkoutButton();
		logger.info("Click on checkout button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		/*//Payment Page Using PromoCode 333 Payment Method================
		re_registration.clickHavePromoCode2();
		logger.info("Click on Promo code");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.enterHavePromoCode("333");
		logger.info("Enter Promocode");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.clickAppyButton();
		logger.info("Click on apply button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.submit_Payment();
		logger.info("Click on submit button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		*/
		//Payment Credit Card Details=======================
		re_registration.cardHolder("JASON HODGES");
		logger.info("Enter Card Holder name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.streetAddress("Wz 555 Court Hill Calfornia");
		logger.info("Enter street Address");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.cityName("Addy");
		logger.info("Enter City Name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.zipCode("12345");
		logger.info("Enter zip code Number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.phoneNumber("9898989789");
		logger.info("Enter phone number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.creditCardNum("4916010425776386");
		logger.info("Enter Credit Card Number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.expirationMonth();
		logger.info("Select month of the credit Card");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.expirationYear();
		logger.info("Enter year of the Credit Card");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.cardSecurityNum("633");
		logger.info("Enter credit card security Number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		re_registration.paymentSubmit();
		logger.info("Click on submit button of the payment!");
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(6000);
		
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

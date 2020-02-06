package com.positiveAlly.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.LoginPage;
import com.positiveAlly.pageObjects.Register_Sibling_VAPage;

import junit.framework.Assert;

public class TC_RegisterSibling_VA_004 extends BaseClass
{
	@Test
	public void registerSibling() throws InterruptedException
	{
		logger.info("URL is opened!");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is Entered");
		Thread.sleep(1000);
		lp.setPassword(password);
		logger.info("Password is Entered");
		Thread.sleep(1000);
		lp.clickLogin();
		Thread.sleep(1000);

		Register_Sibling_VAPage registersibling = new Register_Sibling_VAPage(driver);
		Thread.sleep(2000);
		registersibling.setClickRegisterSibling();
		logger.info("Opened search page to register");
		Thread.sleep(2000);
		
		registersibling.setClickSession();
		logger.info("Select session name");
		Thread.sleep(3000);
		
		registersibling.select_Session();
		logger.info("Select june 2018 to july 2019");
		Thread.sleep(2000);
		
		registersibling.setClickState();
		logger.info("Select state name");
		Thread.sleep(2000);
		registersibling.select_StateName();
		logger.info("select Virginia");
		Thread.sleep(2000);
		
		registersibling.setClickNumberOfStudent();
		logger.info("Select number of student");
		Thread.sleep(2000);
		registersibling.select_NumberOfStudent();
		logger.info("select One student");
		Thread.sleep(2000);
		
		registersibling.setClickGrade();
		logger.info("Clicked grade name");
		Thread.sleep(2000);
		registersibling.selectSelectGrade();
		logger.info("Select grade KG");
		Thread.sleep(2000);
		
		registersibling.setClickDistrict();
		logger.info("Click on district name");
		Thread.sleep(2000);
		registersibling.selectDistrict();
		logger.info("Select district name");
		Thread.sleep(2000);
		
		registersibling.selectSchool();
		logger.info("Click school name");
		Thread.sleep(2000);
		registersibling.selectSchool();
		logger.info("Selected school name");
		Thread.sleep(2000);
		
		registersibling.setClickSearch();
		logger.info("Clicked on search button");
		Thread.sleep(2000);
		
		
		// If page is showing Wait list due to seats issues.
		if (driver.findElement(By.linkText("Student 1")).isDisplayed() == true)
		{
			Assert.assertTrue(true);
			logger.info("Procced to registration!");
			
			registersibling.clickNext1();
			logger.info("Clicked on Next1 Father/Guardian's");
			Thread.sleep(1000);
			
			registersibling.clickNext2();
			logger.info("Clicked on next2 Mother/Guardian's ");
			Thread.sleep(1000);
			
			registersibling.clickNext3();
			logger.info("Clicked on next3 Emergency Contact's");
			Thread.sleep(1000);
			
			registersibling.clickNext4();
			logger.info("Clicked on next4 Registration filled by");
			Thread.sleep(1000);
			
			registersibling.clickNext5();
			logger.info("Clicked on next5 Program details");
			Thread.sleep(2000);
			
			registersibling.setStudentfirstName("Kaenad");
			logger.info("Enter student first name");
			Thread.sleep(1000);
			
			registersibling.setStudentlastName("Kumar");
			logger.info("Enter student lastName");
			Thread.sleep(1000);
			
			registersibling.clickStudentGender();
			logger.info("Clicked date of birth");
			Thread.sleep(1000);
			
			registersibling.selectStudentGender();
			logger.info("Select Gender Name");
			Thread.sleep(5000);
			
			registersibling.setStudentaddress("Wz-429 Calfornia");
			logger.info("Entered address name");
			Thread.sleep(2000);
			
			/*registersibling.clickStudentstate();
			logger.info("Clicked state name");
			Thread.sleep(1000);
			
			registersibling.selectStudentstate();
			logger.info("Select state Virginia");
			Thread.sleep(1000);*/
			
			registersibling.selectStudentcity("Afton");
			logger.info("Entered student city name");
			Thread.sleep(3000);
			
			registersibling.clickStudentcity1();
			logger.info("Select student city");
			Thread.sleep(3000);
			
			registersibling.setStudentzip("12345");
			logger.info("Enter zip code");
			Thread.sleep(3000);
			
			registersibling.setStudenthomephone("8999744341");
			logger.info("Entered home phone");
			Thread.sleep(3000);
			
			registersibling.clickStudentDateOfBirth();
			logger.info("Clicked on date of birth");
			Thread.sleep(3000);
			
			registersibling.selectMonthofBirth();
			logger.info("Select Month of the Birth");
			Thread.sleep(3000);
			
			registersibling.selectYearOfBirth();
			logger.info("Select 2011 year.");
			Thread.sleep(3000);
			
			registersibling.clickDateOfMonth();
			logger.info("Clicked on student date of year");
			Thread.sleep(2000);
			
			registersibling.clickPreviousButton();
			logger.info("Previous Button");
			
			registersibling.clickStudentpreviousDetails();
			logger.info("Student previous details Next Button.");
			
			registersibling.clickStudentDetails();
			logger.info("Click on Next Student Details");
			Thread.sleep(3000);
			
			registersibling.setDentalDoctorName("Raju");
			logger.info("Enter Doctor Name");
			Thread.sleep(2000);
			
			registersibling.setMedicalDoctorName("Ankit");
			logger.info("Enter Medical Doctor Name");
			Thread.sleep(3000);
			
			// Handle Physical medical datePicker---------
			registersibling.clickLastDentalCheckupDate();
			logger.info("Clicked on Dental DatePicker");
			Thread.sleep(2000);
			
			registersibling.setDentalMonth();
			logger.info("Select Month of the dental");
			Thread.sleep(2000);
			
			registersibling.setDentalYear();
			logger.info("Select Year of the Dental");
			Thread.sleep(2000);
			
			registersibling.clickDentalDate();
			logger.info("Select Dental Date");
			Thread.sleep(2000);
			
			// Handle Physical medical date picker-----
			registersibling.clickLastPhysical_CheckupDate();
			logger.info("Click on Medical date picker");
			Thread.sleep(2000);
			
			registersibling.setMedicalMonth();
			logger.info("Select Month of the Medical");
			Thread.sleep(2000);
			
			registersibling.setMedicalYear();
			logger.info("Select Year of the Medical date picker");
			Thread.sleep(2000);
			
			registersibling.clickMedicalDate();
			logger.info("Click on meical date of the datePicker");
			Thread.sleep(3000);
			
			registersibling.clickAllergiesChild();
			logger.info("Select Value from dropdown No");
			Thread.sleep(2000);
			
			//Click on Edit button preview medical-------------
			registersibling.clickEditButtonPreview();
			logger.info("Click on edit button preview.");
			Thread.sleep(2000);
			
			registersibling.clickNextPreview();
			logger.info("Click on Next button of the preview.");
			Thread.sleep(2000);
			
			registersibling.clickProceedToPreview();
			logger.info("Clicked to proceed to preview.");
			Thread.sleep(2000);
			
			// I agree to the Positive Ally Terms and Conditions
			registersibling.checkBoxTermsConditions();
			logger.info("Clicked on check button");
			Thread.sleep(2000);
			
			registersibling.clickCheckoutButton();
			logger.info("Clicked on checkout button.");
			Thread.sleep(3000);
			
			//Payment Credit Card Details=======================
			registersibling.setCardHorderName("JASON HODGES");
			logger.info("Enter Cardholder Name");
			Thread.sleep(2000);
			
			registersibling.setStreetAddress("WZ 420 Court House");
			logger.info("Enter Street Address");
			Thread.sleep(2000);
			
			registersibling.setCityNamePayment("420 Court IT Park");
			logger.info("Enter City Name Payment");
			Thread.sleep(2000);
			
			registersibling.setZipCodePayment("12345");
			logger.info("Enter Zip Code Paymnet");
			Thread.sleep(2000);
			
			registersibling.setPhoneNumberPayment("9967987894");
			logger.info("Enter Phone Number");
			Thread.sleep(2000);
			
			registersibling.setCreditCardNumber("4916010425776386");
			logger.info("Enter Creadit Card Number");
			Thread.sleep(2000);
			
			registersibling.setExpirationMonthCard();
			logger.info("Card expiration month");
			Thread.sleep(2000);
			
			registersibling.setExpirationYearCard();
			logger.info("Select Expiration Year Card");
			Thread.sleep(2000);
			
			registersibling.setCcvNumberCard("633");
			logger.info("Enter CCV Number");
			Thread.sleep(2000);
			
			registersibling.clickSubmitPaypalButton();
			logger.info("Click on Paypal Submit Button");
			Thread.sleep(5000);
			
			/*//Promo Code Payment Page================
			registersibling.clickHavePromoCode();
			logger.info("Clicked on check box promo code");
			Thread.sleep(3000);
			
			registersibling.setPromoCode("333");
			logger.info("Enter promo code");
			Thread.sleep(2000);
			
			registersibling.clickApplyButton();
			logger.info("Click on Apply button");
			Thread.sleep(2000);
			
			registersibling.clickSubmitPayment();
			logger.info("Clicked on payment submit button");
			Thread.sleep(6000);*/	
			
			
			
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Wait List verified successfully");
			registersibling.clickRegisterWaiting();
			logger.info("Clicked register Waiting");
			registersibling.setName("Rajan");
			logger.info("Enter name");
		}
		
		
		
		
	}
	

}

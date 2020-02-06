package com.positiveAlly.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.LoginPage;
import com.positiveAlly.pageObjects.Student_Registration_VAPage;

import junit.framework.Assert;

public class TC_Student_Registration_VA_005 extends BaseClass
{
	@Test
	public void studentRegistration() throws InterruptedException, IOException
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
		
		//Academic Session and Search===================
		Student_Registration_VAPage student_Registration = new Student_Registration_VAPage(driver);
		student_Registration.clickSessionDropDown();
		logger.info("Click session Drop-down");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectSessionName();
		logger.info("Select june 2019 to july 2020");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickStateDropDown();
		logger.info("Click on state dropdown name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectStateNameDropdown();
		logger.info("Select State name Virginia");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickNumberOfStudent();
		logger.info("Click on number of the student dropdown");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectNumberOfStudent();
		logger.info("Select one from dropdown");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Student#1 After-School details and Search=================
		student_Registration.clickGrade();
		logger.info("Click grade dropdown");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectGrade();
		logger.info("Select grade one");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickDistrict();
		logger.info("Click District Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectDistrictName();
		logger.info("Select district Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickSchool();
		logger.info("Select School Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectSchoolName();
		logger.info("Select School Name");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		student_Registration.clickSearchButton();
		logger.info("Clicked on Search Button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//Father/Guardian's Details================
		student_Registration.setFatherName("Umesh");
		logger.info("Enter Father name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setFatherWorkPhone("8989898987");
		logger.info("Enter Father Phone");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setFatherCell("9988878987");
		logger.info("Enter Father Cell");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setFatherEmail("agami.test001@gmail.com");
		logger.info("Enter Father Cell");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickFatherNextButton();
		logger.info("Clicked on Next Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Mother/Guardian's Details ======================
		student_Registration.setMotherName("Marina");
		logger.info("Enter Mother name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setMotherWorkPhone("9898789878");
		logger.info("Enter Mother Phone");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setMotherCellPhone("9887786483");
		logger.info("Enter Mother Cell Phone");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setMotherEmail("agami.test002@gmail.com");
		logger.info("Enter mother email");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Previous Button====================================
		student_Registration.clickPreviousButton();
		logger.info("Clicked on previous Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickParentNextButton();
		logger.info("Click on parent Next Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickMotherNextButton();
		logger.info("Clicked on Mother next Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Emergency Contact's Details=======================
		student_Registration.setEmergencyContact("Robin");
		logger.info("Enter Emergency Contact");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setParentEmergencyCell("8998987889");
		logger.info("Enter Parent Emergency Cell Number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setParentEmergencyAddress("430 IT Court Calfornia");
		logger.info("Enter Parent Emergency Address");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setEmergencyCont("Larry Boecker");
		logger.info("Enter Parent Emergency Contact Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setEmergencyCell("7898789879");
		logger.info("Enter Emergency Cell Number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setEmergencyAddress("890 High Court Calfornia");
		logger.info("Enter Emergency Address.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Previous Button==============================
		student_Registration.clickEmergencyPreviousButton();
		logger.info("Clicked on Emergency Previous Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickMotherPreviousNextButton();
		logger.info("Clicked on Mother Details Next Button.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickEmergencyNextButton();
		logger.info("Clicked on Emergency Next Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Registration filled========================
		student_Registration.registrantFiled("Jeff Hoid");
		logger.info("Enter registrant's Name ");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.registrantEmail("agami.test003@gmail.com");
		logger.info("Entered registrant's Email Address");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Previous Button=============================
		student_Registration.clickRegistrantsPreviousButton();
		logger.info("Clicked on Registrant Previous button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickEmergencyContactNextButton();
		logger.info("Click Emergency Contact Next Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickNextRegistrant();
		logger.info("Click Next Registrant");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		// Program Details Page==============================
		student_Registration.clickPreviousProgramButton();
		logger.info("Click Previous Program");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		student_Registration.clickPreviousNextRegistrant();
		logger.info("Click on previous Next Registrant");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		student_Registration.clickNextRegistrantButton();
		logger.info("Click Next Registrant button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//Student details====================================
		student_Registration.setFirstname("Subham");
		logger.info("Enter First name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setLastname("Kumar");
		logger.info("Enter Last Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickGender();
		logger.info("Click on gender drop down button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectGender();
		logger.info("Select gender name dropdown");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setAddressstudent("340 High Court Calfornia");
		logger.info("Enter Address name");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		student_Registration.selectStudentcity("Afton");
		logger.info("Select city name");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		student_Registration.clickCityName2();
		logger.info("Click Afton city name");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		student_Registration.setZip_code("12345");
		logger.info("Enter zip code");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		student_Registration.setPhone("8978987998");
		logger.info("Enter phone number");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Date of birth of the student======================
		student_Registration.clickDateOfBirth();
		logger.info("Click on date of birth");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectMonthBirth();
		logger.info("Select month of Birth");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.selectYearBirth();
		logger.info("Select Year of Birth");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickDateMonth();
		logger.info("Click on date of month");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Previous Button==================================
		student_Registration.clickStudentPrevious();
		logger.info("Click on previous Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.ClickProgramNext();
		logger.info("Click on program next button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.ClickStudentNext();
		logger.info("Click student Next Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Dental Doctor Information==========================
		student_Registration.setDentalDoctorName("Mike Hitended");
		logger.info("Enter dental doctor name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setMedicalDoctorName("Kurshid Khan");
		logger.info("Enter Medical Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Handle date picker of the Dental Check Up===========
		student_Registration.clickLastDentalCheckup_Date();
		logger.info("Click Last Dental Checkup Date");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		student_Registration.setLastDentalMonth();
		logger.info("Select Last Dental Month");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setLastDentalYear();
		logger.info("Set Last Dental Year");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickMonthDentalDate();
		logger.info("Click Month Dental Date");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		// Handle date picker of the Medical Check up.
		student_Registration.clickLastPhysical_CheckupDate();
		logger.info("Click physical checkup Date");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		student_Registration.setMedicalMonth();
		logger.info("Select Month medical");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setMedicalYear();
		logger.info("Select Year Medical");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickMedicalDate();
		logger.info("Click medical Date");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Does your child have any allergies, medical, and/or physical issues?
		student_Registration.clickPhysicalIssueName();
		logger.info("Select allergies child No.");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//Previous Button Allergies==================================
		student_Registration.clickMedicalPrevious();
		logger.info("Clicked on medical previous button.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickStudentFormNext();
		logger.info("Click on student form next button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickProceedToPreview();
		logger.info("Click on proceed to Previous Button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickEditCheckOut();
		logger.info("Click on Edit Checkout Button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		student_Registration.clickStudProceedToPreview();
		logger.info("Click! on student proceed to preview button");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//Tuition Summary Details & Checkout Process============================
		student_Registration.checkboxTerms_Conditions();
		logger.info("Click on terms and condition check box button");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		student_Registration.clickCheckoutButton();
		logger.info("Click on checkout button!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		//Checkout Process===============================
		/*student_Registration.clickPromoCode();
		logger.info("Click on promo code button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/
		
		/*//Payment Page Using PromoCode 333 Payment Method================
		student_Registration.clickPromoCode();
		logger.info("Clicked on promo code checkbox");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickHavePromoCode("333");
		logger.info("Enter promo code");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.ClickAppyButton();
		logger.info("Click on apply button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickSubmitPayment();
		logger.info("Click on submit button");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
		//Payment Credit Card Details=======================
		student_Registration.setCardHolderName("JASON HODGES");
		logger.info("Enter CardhsetCreditCardNumberolder Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setStreetAddress("WZ 420 Court House");
		logger.info("Enter Street Address");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setCityName("420 Court IT Park");
		logger.info("Enter City Name Payment");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setZip_Code("12345");
		logger.info("Enter Zip Code Paymnet");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setPhoneNumber("9878879887");
		logger.info("Enter phone number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setCreditCardNumber("4916010425776386");
		logger.info("Enter creditCard Number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setExpirationMonth();
		logger.info("Select card Expiration month");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setExpirationYear();
		logger.info("Enter Expiration year");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.setCardSecurityNumber("633");
		logger.info("Enter card security number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		student_Registration.clickPaymentSubmit();
		logger.info("Click on Payment submit button");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Positive Ally &mdash; Registration";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Student has been registered Sucessfully!");
		}
		else {
			System.out.println("Student has not been registered Sucessfully!");
		}
			
		
       /*boolean res = driver.getPageSource().contains("Congratulations! Your student has been registered successfully. Please do not forget to update all forms in parent portal.You will get a system generated email soon confirming it. If you do not receive it within the hour, please first check your spam folder and if you do not find it there, email contact@positiveally.com to let us know. You can also leave a message for Aman Narula at 425 449 2530.");
		
		if (res == true)
		{
			Assert.assertTrue(true);
			logger.info("Student has been registered Sucessfully!");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		}
		else
		{
			logger.info("Student has not been registered Sucessfully!");
			captureScreen (driver, "studentRegistration");
			Assert.assertTrue(false);
		}*/
		
	}
	

}

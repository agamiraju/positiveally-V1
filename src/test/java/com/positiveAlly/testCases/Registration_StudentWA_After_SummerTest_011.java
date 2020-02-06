package com.positiveAlly.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.LoginPage;
import com.positiveAlly.pageObjects.Registration_StudentWA_After_SummerPage;

import junit.framework.Assert;

public class Registration_StudentWA_After_SummerTest_011 extends BaseClass 
{
	@Test
	public void regisstration_WA_AfterSummer() throws InterruptedException
	{
		logger.info("URL is opened!");
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is Entered");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lp.setPassword(password);
		logger.info("Password is Entered");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Create page object Washignton State=====================
		Registration_StudentWA_After_SummerPage register_WA_AfterSummer = new Registration_StudentWA_After_SummerPage(driver);
		
		//Academic Session and Search Registration for afterschool and summer for June 2018 to June 2019===================
		register_WA_AfterSummer.click_Academic_Session();
		logger.info("Clicked on academic session");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.selectSession();
		logger.info("Select session academic");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickStateDropdown2();
		logger.info("Clicked on state dropdown");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.select_State();
		logger.info("Clicked on state name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.txtClickNumberOfStudenyDropdown2();
		logger.info("Clicked on number of student");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.selectNumberOfStudent();
		logger.info("Select number of students");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Student#1 After-School & summer details and Search==================
		register_WA_AfterSummer.check_afterSchool();
		logger.info("Checked on after school check box");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.check_summer();
		logger.info("Clicked on summer checkbox");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_GradeStudent();
		logger.info("Clicked on grade name of the student");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.select_studentGrade();
		logger.info("Select Grade name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_school_ditrict();
		logger.info("Clicked on school district");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.select_schoolDistrict();
		logger.info("Select school district");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_School();
		logger.info("Clicked on school name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.select_SchoolName();
		logger.info("Select school name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Search();
		logger.info("Clicked on search button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Father/Guardian's Details=============================
		register_WA_AfterSummer.setFathername("Helton");
		logger.info("Enter father name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setFatherWork("8989998989");
		logger.info("Enter father work phone");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		register_WA_AfterSummer.setCellFather("9898997989");
		logger.info("Enter father cell number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setfatheremail("agami.test005@gmail.com");
		logger.info("Enter father email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_NextButton();
		logger.info("Clicked on Next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Mother/Guardian's Details ==================
		register_WA_AfterSummer.setMother("Cutter");
		logger.info("Enter mother name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setMotherPhone("8989998988");
		logger.info("Enter mother phone");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.txtMotherCellPhone("8999878989");
		logger.info("Enter mother cell number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setMother_Emailid("agami.test006@gmail.com");
		logger.info("Enter mother email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Page===================================
		register_WA_AfterSummer.clickPreviousButton();
		logger.info("Clicked on previous button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickParentNextButton();
		logger.info("Clicked on parent details next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickMotherNextButton();
		logger.info("Clicked on the mother naext button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Emergency Contact's Details=========================
		register_WA_AfterSummer.setemergency_Name("Tends");
		logger.info("Enter emergency name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setwork_Phone("7989897897");
		logger.info("Enter work phone emergency");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setCell_Phone("8989898787");
		logger.info("Enter emergency cell phone");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setemergency_Email("agami.test007@gmail.com");
		logger.info("Enter emergency email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Button==============================
		register_WA_AfterSummer.clickEmergencyPrevious();
		logger.info("Clicked previous button of emergency");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickMotherPreviousNext();
		logger.info("Clicked on next button of mother");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickEmergencyNext();
		logger.info("Clicked on emergency next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Registration filled======================
		register_WA_AfterSummer.setRegistrationFiled("Russel");
		logger.info("Enter registratant name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setRegistrantEmail("agami.test008@gmail.com");
		logger.info("Enter registratnt email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Button===============================
		register_WA_AfterSummer.clickRegistrantsPrevious();
		logger.info("Enter registratnt previous button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickEmergencyContactNext();
		logger.info("Clicked on emergency next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickNextRegistrant();
		logger.info("Clicked on next button of the registratant details");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Program details page and select weeks for the summer program=============
		//Week 1- A.M Camps - 8:15-1:00 p.m.=====================
		register_WA_AfterSummer.click_Enrichment1();
		logger.info("Clicked on enrichment1 add button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		/*register_WA_AfterSummer.click_Fieldtrip1();
		logger.info("Clicked on the fieldtrip1");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Enrichement2();
		logger.info("Clicked on the add button of the enrichment2");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Fieldetrip2();
		logger.info("Clicked on the add button of the fieldtrip2");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Enrichement3();
		logger.info("Clicked on add button of the enrichment3");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Fieldetrip3();
		logger.info("Clicked on add button fieldTrip3");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Enrichement4();
		logger.info("Clicked on add button of the enrichment4");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Fieldetrip4();
		logger.info("Clicked on add button of fieldtrip4");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Enrichement5();
		logger.info("Clicked on add button enrichment5");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Fieldetrip5();
		logger.info("Clicked on the add button of the fieldtrip5");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Enrichement6();
		logger.info("Clicked on add button enrichment6");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Fieldetrip6();
		logger.info("Clicked on the add button of the fieldtrip6");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Enrichement7();
		logger.info("Clicked on add button enrichment7");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Fieldetrip7();
		logger.info("Clicked on the add button of the fieldtrip7");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Enrichement8();
		logger.info("Clicked on add button enrichment8");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Fieldetrip8();
		logger.info("Clicked on the add button of the fieldtrip8");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Enrichement9();
		logger.info("Clicked on add button enrichment9");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Fieldetrip9();
		logger.info("Clicked on the add button of the fieldtrip9");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		*/
		//Program Details Page(Previous) After school & summer program=====================
		register_WA_AfterSummer.clickPreviousProgram();
		logger.info("Clicked on previous button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickPreviousNextRegistrant();
		logger.info("Clicked on next button of the registratant");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickNextRegistrant2();
		logger.info("Clicked on the registratant next button");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//Student details for Registration After School & Summer Program==================
		register_WA_AfterSummer.setFirstname("Joue");
		logger.info("Enter student first name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setLastname("Katter");
		logger.info("Enter student last name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setGender();
		logger.info("Clicked on the gender");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.selectGenter();
		logger.info("Select gender name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setAddress1("450 DC Washington");
		logger.info("Enter first address name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.selectCity_Name("Addy");
		logger.info("Enter city name Addy!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_CityName();
		logger.info("Clicked city name");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		register_WA_AfterSummer.setZip_CodeStud("12345");
		logger.info("Enter zip code");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setMobile_number("9898988897");
		logger.info("Enter student mobile number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Date of birth of the student=======================
		register_WA_AfterSummer.clickDateOfBirth();
		logger.info("Clicked on date of birth");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setCalenderMonthOfBirth();
		logger.info("Set month of the date of birth");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.selectYearBirth();
		logger.info("Select year of the birth");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickDateMonth();
		logger.info("Clicked on date of the birth");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Button Student deatils page=============
		register_WA_AfterSummer.clickStudentPrevious();
		logger.info("Clicked on the previous button of the student");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.ClickProgramNext();
		logger.info("Clicked on the program next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.ClickStudentNext();
		logger.info("Clicked on the program next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Dental Doctor Information===================
		register_WA_AfterSummer.setDentalDoctorName("Ganetus");
		logger.info("Enter dental doctor name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setMedicalDoctorName("Zeyer");
		logger.info("Enter medical doctor name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Handle date picker of the Dental Check Up====
		register_WA_AfterSummer.clickLastDentalCheckup_Date();
		logger.info("Clicked on dental checkup date");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setLastDentalMonth();
		logger.info("Clicked on dental month");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setLastDentalYear();
		logger.info("Select year dental date");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickMonthDentalDate();
		logger.info("Click on date of the dental date");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// Handle date picker of the Medical Check up.
		register_WA_AfterSummer.clickLastPhysical_CheckupDate();
		logger.info("Clicked on medical date picker");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setMedicalMonth();
		logger.info("Select medical month");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setMedicalYear();
		logger.info("Select medical year");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickMedicalDate();
		logger.info("Clicked on date of the medical");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Does your child have any allergies, medical, and/or physical issues?
		register_WA_AfterSummer.clickPhysicalIssueName();
		logger.info("Clicked on physical name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Button Allergies=========================
		register_WA_AfterSummer.clickMedicalPrevious();
		logger.info("clicked on medical previous button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickStudentFormNext();
		logger.info("Clicked on student next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickProceedToPreview();
		logger.info("Clicked on procced to preview");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickEditCheckOut();
		logger.info("Clicked on edit checkout button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickStudProceedToPreview();
		logger.info("Clicked on the student preview button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Tuition Summary Details & Checkout Process====================
		register_WA_AfterSummer.checkboxTerms_Conditions();
		logger.info("Clicked on checkbox terms condition box");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickCheckoutButton();
		logger.info("Clicked on checkout button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		/*//Payment Page Using PromoCode 333 Payment Method================
		register_WA_AfterSummer.clickPromoCode();
		logger.info("Clicked on promocode");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.clickHavePromoCode("333");
		logger.info("Enter promo code");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		register_WA_AfterSummer.ClickAppyButton();
		logger.info("Clicked on apply button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		register_WA_AfterSummer.clickSubmitPayment();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Thread.sleep(3000);*/
		//Payment Credit Card Details=======================
		register_WA_AfterSummer.setCardHolderName("JASON HODGES");
		logger.info("Enter CardhsetCreditCardNumberolder Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setStreetAddress("WZ 420 Court House");
		logger.info("Enter Street Address");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setCityName("420 Court IT Park");
		logger.info("Enter City Name Payment");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.set_ZipCode("12345");
		logger.info("Enter Zip Code Paymnet");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.set_PhoneNum("9878879887");
		logger.info("Enter phone number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setCreditCardNumber("4916010425776386");
		logger.info("Enter creditCard Number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setExpirationMonth();
		logger.info("Select card Expiration month");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setExpirationYear();
		logger.info("Enter Expiration year");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.setCardSecurityNumber("633");
		logger.info("Enter card security number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSummer.click_Payment();
		logger.info("Click on Payment submit button");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(6000);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Positive Ally — Registration";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Student has been registered Sucessfully!");
			Thread.sleep(2000);
		}
		else {
			System.out.println("Student has not been registered Sucessfully!");
			Thread.sleep(1000);
		}
			
	
		
		//Digital Signature===================================
		/*Thread.sleep(3000);
		register_WA_AfterSummer.digital_Signature();
		logger.info("Parent digital signature!");
		Thread.sleep(3000);
		
		register_WA_AfterSummer.click_Signature_save();
		logger.info("Clicked on save button to signature!");
	    //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);*/
		
		
		
	}
}

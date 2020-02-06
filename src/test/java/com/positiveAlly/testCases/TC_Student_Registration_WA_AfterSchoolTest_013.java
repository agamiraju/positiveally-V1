package com.positiveAlly.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.Student_Registration_WA_AfterSchoolPage_013;

public class TC_Student_Registration_WA_AfterSchoolTest_013 extends BaseClass
{
	
	@Test
	public void studRegistration_WA_AfterSchool() throws InterruptedException
	{
		logger.info("Url is opened!");
		Thread.sleep(1000);
		
		//Create Instance of the page object======================
		Student_Registration_WA_AfterSchoolPage_013 register_WA_AfterSchool = new Student_Registration_WA_AfterSchoolPage_013(driver);
		
		//Academic Session and Search Registration for afterschool and summer for June 2018 to June 2019===================
		/*register_WA_AfterSchool.click_Academic_Session();
		logger.info("Clicked on academic session");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.selectSession();
		logger.info("Select session academic");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		*/
		register_WA_AfterSchool.clickStateDropdown2();
		logger.info("Clicked on state dropdown");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.select_State();
		logger.info("Clicked on state name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.txtClickNumberOfStudenyDropdown2();
		logger.info("Clicked on number of student");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.selectNumberOfStudent();
		logger.info("Select number of students");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Student#1 After-School & details and Search==================
		register_WA_AfterSchool.check_afterSchool();
		logger.info("Checked on after school check box");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.click_GradeStudent();
		logger.info("Clicked on grade name of the student");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.select_studentGrade();
		logger.info("Select Grade name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.click_school_ditrict();
		logger.info("Clicked on school district");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.select_schoolDistrict();
		logger.info("Select school district");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.click_School();
		logger.info("Clicked on school name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.select_SchoolName();
		logger.info("Select school name");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		register_WA_AfterSchool.click_Search();
		logger.info("Clicked on search button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Father/Guardian's Details=============================
		register_WA_AfterSchool.setFathername("Helton");
		logger.info("Enter father name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setFatherWork("8989998989");
		logger.info("Enter father work phone");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		register_WA_AfterSchool.setCellFather("9898997989");
		logger.info("Enter father cell number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setfatheremail("agami.test005@gmail.com");
		logger.info("Enter father email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.click_NextButton();
		logger.info("Clicked on Next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Mother/Guardian's Details ==================
		register_WA_AfterSchool.setMother("Cutter");
		logger.info("Enter mother name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setMotherPhone("8989998988");
		logger.info("Enter mother phone");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.txtMotherCellPhone("8999878989");
		logger.info("Enter mother cell number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setMother_Emailid("agami.test006@gmail.com");
		logger.info("Enter mother email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Page===================================
		register_WA_AfterSchool.clickPreviousButton();
		logger.info("Clicked on previous button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickParentNextButton();
		logger.info("Clicked on parent details next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickMotherNextButton();
		logger.info("Clicked on the mother naext button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Emergency Contact's Details=========================
		register_WA_AfterSchool.setemergency_Name("Tends");
		logger.info("Enter emergency name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setwork_Phone("7989897897");
		logger.info("Enter work phone emergency");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setCell_Phone("8989898787");
		logger.info("Enter emergency cell phone");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setemergency_Email("agami.test007@gmail.com");
		logger.info("Enter emergency email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Button==============================
		register_WA_AfterSchool.clickEmergencyPrevious();
		logger.info("Clicked previous button of emergency");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickMotherPreviousNext();
		logger.info("Clicked on next button of mother");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickEmergencyNext();
		logger.info("Clicked on emergency next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Registration filled======================
		register_WA_AfterSchool.setRegistrationFiled("Russel");
		logger.info("Enter registratant name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setRegistrantEmail("agami.test008@gmail.com");
		logger.info("Enter registratnt email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Button===============================
		register_WA_AfterSchool.clickRegistrantsPrevious();
		logger.info("Enter registratnt previous button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickEmergencyContactNext();
		logger.info("Clicked on emergency next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickNextRegistrant_Next();
		logger.info("Clicked on next button of the registratant details");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Program Details Page(Previous) After school & summer program=====================
		register_WA_AfterSchool.clickPreviousProgram();
		logger.info("Clicked on previous button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickPreviousNextRegistrant();
		logger.info("Clicked on next button of the registratant");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickNextRegistrant2();
		logger.info("Clicked on the registratant next button");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//Student details for Registration After School Program==================
		register_WA_AfterSchool.setFirstname("Joue");
		logger.info("Enter student first name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setLastname("Katter");
		logger.info("Enter student last name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setGender();
		logger.info("Clicked on the gender");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.selectGenter();
		logger.info("Select gender name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setAddress1("450 DC Washington");
		logger.info("Enter first address name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.selectCity_Name("Addy");
		logger.info("Enter city name Addy!");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.click_CityName();
		logger.info("Clicked city name");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		register_WA_AfterSchool.setZip_CodeStud("12345");
		logger.info("Enter zip code");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setMobile_number("9898988897");
		logger.info("Enter student mobile number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Date of birth of the student=======================
		register_WA_AfterSchool.clickDateOfBirth();
		logger.info("Clicked on date of birth");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setCalenderMonthOfBirth();
		logger.info("Set month of the date of birth");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.selectYearBirth();
		logger.info("Select year of the birth");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickDateMonth();
		logger.info("Clicked on date of the birth");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Button Student deatils page=============
		register_WA_AfterSchool.clickStudentPrevious();
		logger.info("Clicked on the previous button of the student");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.ClickProgramNext();
		logger.info("Clicked on the program next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.ClickStudentNext();
		logger.info("Clicked on the program next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Dental Doctor Information===================
		register_WA_AfterSchool.setDentalDoctorName("Ganetus");
		logger.info("Enter dental doctor name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setMedicalDoctorName("Zeyer");
		logger.info("Enter medical doctor name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Handle date picker of the Dental Check Up====
		register_WA_AfterSchool.clickLastDentalCheckup_Date();
		logger.info("Clicked on dental checkup date");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setLastDentalMonth();
		logger.info("Clicked on dental month");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setLastDentalYear();
		logger.info("Select year dental date");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickMonthDentalDate();
		logger.info("Click on date of the dental date");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		// Handle date picker of the Medical Check up.
		register_WA_AfterSchool.clickLastPhysical_CheckupDate();
		logger.info("Clicked on medical date picker");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		register_WA_AfterSchool.setMedicalMonth();
		logger.info("Select medical month");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setMedicalYear();
		logger.info("Select medical year");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickMedicalDate();
		logger.info("Clicked on date of the medical");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//Does your child have any allergies, medical, and/or physical issues?
		register_WA_AfterSchool.clickPhysicalIssueName();
		logger.info("Clicked on physical name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Previous Button Allergies=========================
		register_WA_AfterSchool.clickMedicalPrevious();
		logger.info("clicked on medical previous button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickStudentFormNext();
		logger.info("Clicked on student next button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickProceedToPreview();
		logger.info("Clicked on procced to preview");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickEditCheckOut();
		logger.info("Clicked on edit checkout button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickStudProceedToPreview();
		logger.info("Clicked on the student preview button");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Tuition Summary Details & Checkout Process====================
		register_WA_AfterSchool.checkboxTerms_Conditions();
		logger.info("Clicked on checkbox terms condition box");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.clickCheckoutButton();
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
		register_WA_AfterSchool.setCardHolderName("JASON HODGES");
		logger.info("Enter CardhsetCreditCardNumberolder Name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setStreetAddress("WZ 420 Court House");
		logger.info("Enter Street Address");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setCityName("420 Court IT Park");
		logger.info("Enter City Name Payment");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.set_ZipCode("12345");
		logger.info("Enter Zip Code Paymnet");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.set_PhoneNum("9878879887");
		logger.info("Enter phone number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setCreditCardNumber("4916010425776386");
		logger.info("Enter creditCard Number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setExpirationMonth();
		logger.info("Select card Expiration month");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setExpirationYear();
		logger.info("Enter Expiration year");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.setCardSecurityNumber("633");
		logger.info("Enter card security number");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_WA_AfterSchool.click_Payment();
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


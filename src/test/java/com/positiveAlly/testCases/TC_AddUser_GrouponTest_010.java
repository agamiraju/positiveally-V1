package com.positiveAlly.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.positiveAlly.pageObjects.AddUser_GrouponPage;
import com.positiveAlly.pageObjects.Registration_StudentWA_After_SummerPage;

public class TC_AddUser_GrouponTest_010 extends BaseClass
{
	UserAccount_Verify_AdminTest_012 verify_parentAccount = new UserAccount_Verify_AdminTest_012();
	@Test
	public void addUser_Groupon() throws InterruptedException
	{
		driver.get("http://localhost/positiveally/login/sign_up/groupon");
		AddUser_GrouponPage register_grouponCode = new AddUser_GrouponPage(driver);
		
		Thread.sleep(2000);
		//Create Account Parent for Groupon code==========
		register_grouponCode.user_Firstname("Amit");
		logger.info("Enter User first name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_Middlename("Singh");
		logger.info("Enter user middle name");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		register_grouponCode.user_Lastname("Kumar");
		logger.info("Enter user last name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_StreetAdrress1("633- High court calfornia");
		logger.info("Enter Street address1");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_StreetAdrress2("423-Addy washington");
		logger.info("Enter Street Address2");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_StateName();
		logger.info("Clicked on state drop down");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.select_StateName();
		logger.info("Select state name");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_CityName("Afton");
		logger.info("Select city name Afton");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		register_grouponCode.click_Cityname();
        logger.info("Clicked on Afton city name");
        Thread.sleep(2000);
		
		register_grouponCode.user_Zip_code("12345");
		logger.info("Enter user ZIP code");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_EmailId("agami.test004@gmail.com");
		logger.info("Enter user email id");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_Password("123456");
		logger.info("Enter user password");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_confirm_password("123456");
		logger.info("Enter confirm password");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		register_grouponCode.user_Signup_Button();
		logger.info("Clicked on the signup button");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Positive Ally — Registration";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("User Account has been Registered Sucessfully!");
			Thread.sleep(1000);
			
			//Clicked on back button after getting registration message.
			register_grouponCode.user_Back_Button();
			logger.info("Clicked on back button.");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			// Verify the parent account from admin side(Code)=============
			verify_parentAccount.user_AccountVerify_Admin();
			
			//Parent Login account===============================
			register_grouponCode.user_Email("agami.test004@gmail.com");
			logger.info("Enter email id");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.user_Pass("123456");
			logger.info("Enter password.");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			register_grouponCode.user_Login_btn();
			logger.info("Clicked on Login button.");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			//After Logging Account_Groupon- register student for summer program using groupon code.
			register_grouponCode.click_GradeName();
			logger.info("Clicked on grade name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.select_gradeName();
			logger.info("Select grade name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_submit_button();
			logger.info("Clicked on submit button");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			//Father/Guardian's Details=============================
			register_grouponCode.setFathername("Helton");
			logger.info("Enter father name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setFatherWork("8989998989");
			logger.info("Enter father work phone");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(1000);
			
			register_grouponCode.setCellFather("9898997989");
			logger.info("Enter father cell number");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setfatheremail("agami.test005@gmail.com");
			logger.info("Enter father email id");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_NextButton();
			logger.info("Clicked on Next button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Mother/Guardian's Details ==================
			register_grouponCode.setMother("Cutter");
			logger.info("Enter mother name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setMotherPhone("8989998988");
			logger.info("Enter mother phone");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.txtMotherCellPhone("8999878989");
			logger.info("Enter mother cell number");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setMother_Emailid("agami.test006@gmail.com");
			logger.info("Enter mother email id");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Previous Page===================================
			register_grouponCode.clickPreviousButton();
			logger.info("Clicked on previous button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickParentNextButton();
			logger.info("Clicked on parent details next button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickMotherNextButton();
			logger.info("Clicked on the mother naext button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Emergency Contact's Details=========================
			register_grouponCode.setemergency_Name("Tends");
			logger.info("Enter emergency name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setwork_Phone("7989897897");
			logger.info("Enter work phone emergency");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setAddressname("Wz 430 calfornia");
			logger.info("Enter emergency cell phone");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setemergency_Name2("Raju Yadav");
			logger.info("Enter emergency email id");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setemergency_phone("8987898789");
			logger.info("Enter emergency email id");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.txtemergenc_Address("High court whit house calfornia");
			logger.info("Enter emergency email id");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			
			//Previous Button==============================
			register_grouponCode.clickEmergencyPrevious();
			logger.info("Clicked previous button of emergency");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickMotherPreviousNext();
			logger.info("Clicked on next button of mother");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickEmergencyNext();
			logger.info("Clicked on emergency next button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Registration filled======================
			register_grouponCode.setRegistrationFiled("Russel");
			logger.info("Enter registratant name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setRegistrantEmail("agami.test008@gmail.com");
			logger.info("Enter registratnt email id");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Previous Button===============================
			register_grouponCode.clickRegistrantsPrevious();
			logger.info("Enter registratnt previous button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickEmergencyContactNext();
			logger.info("Clicked on emergency next button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickNextRegistrant();
			logger.info("Clicked on next button of the registratant details");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Have groupon code?==================================
			register_grouponCode.text_GrouponCode("AZEMGGVZ");
			logger.info("Enter groupon code!");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_groupon_apply_button();
			logger.info("Clicked on Apply button of the groupon code.");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			
			/*//Select weeks Enrichment + FieldTrip(GROUPON-CODE) summer program=============
			//Week 1- A.M Camps - 8:15-1:00 p.m.
			register_grouponCode.click_Enrichment_1();
			logger.info("Clicked on the Enrichment");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldtrip_1();
			logger.info("Clicked on the Fieldtrip");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_2();
			logger.info("Clicked on the Enrichement2");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_2();
			logger.info("Clicked on the Fieldtrip2");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_3();
			logger.info("Clicked on the Enrichement_3");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_3();
			logger.info("Clicked on the Fieldetrip_3");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_4();
			logger.info("Clicked on the Enrichement_4");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_4();
			logger.info("Clicked on the Fieldetrip_4");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_5();
			logger.info("Clicked on the Enrichement_5");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_5();
			logger.info("Clicked on the Fieldetrip_5");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_6();
			logger.info("Clicked on the Enrichement_6");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_6();
			logger.info("Clicked on the Fieldetrip_6");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_7();
			logger.info("Clicked on the Enrichement_7");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_7();
			logger.info("Clicked on the Fieldetrip_7");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_8();
			logger.info("Clicked on the Enrichement_8");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_8();
			logger.info("Clicked on the Fieldetrip_8");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_9();
			logger.info("Clicked on the Enrichement_9");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_9();
			logger.info("Clicked on the Fieldetrip_9");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_10();
			logger.info("Clicked on the Enrichement_10");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip_10();
			logger.info("Clicked on the Fieldetrip_10");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			*/
			
			
			//Select weeks Specialty + FieldTrip(GROUPON-CODE) summer program=============
			//Week 1- A.M Camps - 8:15-1:00 p.m.=====================
			/*register_grouponCode.click_AMSpecialty1();
			logger.info("Clicked on enrichment1 add button");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(3000);*/
			
			/*register_grouponCode.click_Fieldtrip1();
			logger.info("Clicked on the fieldtrip1");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement2();
			logger.info("Clicked on the add button of the enrichment2");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip2();
			logger.info("Clicked on the add button of the fieldtrip2");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement3();
			logger.info("Clicked on add button of the enrichment3");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip3();
			logger.info("Clicked on add button fieldTrip3");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement4();
			logger.info("Clicked on add button of the enrichment4");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip4();
			logger.info("Clicked on add button of fieldtrip4");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement5();
			logger.info("Clicked on add button enrichment5");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip5();
			logger.info("Clicked on the add button of the fieldtrip5");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement6();
			logger.info("Clicked on add button enrichment6");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip6();
			logger.info("Clicked on the add button of the fieldtrip6");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement7();
			logger.info("Clicked on add button enrichment7");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip7();
			logger.info("Clicked on the add button of the fieldtrip7");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement8();
			logger.info("Clicked on add button enrichment8");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip8();
			logger.info("Clicked on the add button of the fieldtrip8");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement9();
			logger.info("Clicked on add button enrichment9");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip9();
			logger.info("Clicked on the add button of the fieldtrip9");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement10();
			logger.info("Clicked on the add button of the fieldtrip9");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty10();
			logger.info("Clicked on the add button of the fieldtrip9");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Fieldetrip10();
			logger.info("Clicked on the add button of the fieldtrip9");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			*/
			
			//ENRICHMENT (GROUPON-CODE) summer program==============================
			
			//Week 1- A.M Camps - 8:15-1:00 p.m.
			register_grouponCode.click_Enrichment_One();
			logger.info("Clicked on the add button of the Enrichment_One");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			/*register_grouponCode.click_Enrichement_Two();
			logger.info("Clicked on the add button of the Enrichement_Two");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_Three();
			logger.info("Clicked on the add button of the Enrichement_Three");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_Four();
			logger.info("Clicked on the add button of the Enrichement_Four");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_Five();
			logger.info("Clicked on the add button of the Enrichement_Five");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_Six();
			logger.info("Clicked on the add button of the Enrichement_Six");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_Seven();
			logger.info("Clicked on the add button of the Enrichement_Seven");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_Eight();
			logger.info("Clicked on the add button of the Enrichement_Eight");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_Nine();
			logger.info("Clicked on the add button of the Enrichement_Nine");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Enrichement_Ten();
			logger.info("Clicked on the add button of the Enrichement_Ten");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			*/
			
			/*//SPECIALTY (GROUPON-CODE) summer program==================================
			//Week 1- A.M Camps - 8:15-1:00 p.m.
			register_grouponCode.click_AMSpecialty_One();
			logger.info("Clicked on the add button of the AMSpecialty_One");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Two();
			logger.info("Clicked on the add button of the AMSpecialty_Two");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Three();
			logger.info("Clicked on the add button of the AMSpecialty_Three");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Four();
			logger.info("Clicked on the add button of the AMSpecialty_Four");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Five();
			logger.info("Clicked on the add button of the AMSpecialty_Five");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Six();
			logger.info("Clicked on the add button of the AMSpecialty_Six");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Seven();
			logger.info("Clicked on the add button of the AMSpecialty_Seven");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Eight();
			logger.info("Clicked on the add button of the AMSpecialty_Eight");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Nine();
			logger.info("Clicked on the add button of the AMSpecialty_Nine");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_AMSpecialty_Ten();
			logger.info("Clicked on the add button of the AMSpecialty_Ten");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/
			
			
			/*//FIELDTRIP (GROUPON-CODE) summer program===================================	
			//P.M Camp 1:00-5:45
			register_grouponCode.click_FieldTrip_One();
			logger.info("Clicked on the add button of the FieldTrip_One");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Two();
			logger.info("Clicked on the add button of the FieldTrip_Two");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Three();
			logger.info("Clicked on the add button of the FieldTrip_Three");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Four();
			logger.info("Clicked on the add button of the FieldTrip_Four");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Five();
			logger.info("Clicked on the add button of the FieldTrip_Five");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Six();
			logger.info("Clicked on the add button of the FieldTrip_Six");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Seven();
			logger.info("Clicked on the add button of the FieldTrip_Seven");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Eight();
			logger.info("Clicked on the add button of the FieldTrip_Eight");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Nine();
			logger.info("Clicked on the add button of the FieldTrip_Nine");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_FieldTrip_Ten();
			logger.info("Clicked on the add button of the FieldTrip_Ten");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/
			
			//Program Details Page(Previous) After school & summer program=====================
			register_grouponCode.clickPreviousProgram();
			logger.info("Clicked on previous button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickPreviousNextRegistrant();
			logger.info("Clicked on next button of the registratant");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			register_grouponCode.clickNextRegistrant2();
			logger.info("Clicked on the registratant next button");
			//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			//Student details for Registration After School & Summer Program==================
			register_grouponCode.setFirstname("Joue");
			logger.info("Enter student first name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setLastname("Katter");
			logger.info("Enter student last name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setGender();
			logger.info("Clicked on the gender");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.selectGenter();
			logger.info("Select gender name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setAddress1("450 DC Washington");
			logger.info("Enter first address name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.selectCity_Name("Afton");
			logger.info("Enter city name Afton!");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(1000);
			
			register_grouponCode.click_CityName();
			logger.info("Clicked city name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setZip_CodeStudent("12345");
			logger.info("Enter zip code");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setMobile_number("9898988897");
			logger.info("Enter student mobile number");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Date of birth of the student=======================
			register_grouponCode.clickDateOfBirth();
			logger.info("Clicked on date of birth");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setCalenderMonthOfBirth();
			logger.info("Set month of the date of birth");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.selectYearBirth();
			logger.info("Select year of the birth");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickDateMonth();
			logger.info("Clicked on date of the birth");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Previous Button Student deatils page=============
			register_grouponCode.clickStudentPrevious();
			logger.info("Clicked on the previous button of the student");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.ClickProgramNext();
			logger.info("Clicked on the program next button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.ClickStudentNext();
			logger.info("Clicked on the program next button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Dental Doctor Information===================
			register_grouponCode.setDentalDoctorName("Ganetus");
			logger.info("Enter dental doctor name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setMedicalDoctorName("Zeyer");
			logger.info("Enter medical doctor name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Handle date picker of the Dental Check Up====
			register_grouponCode.clickLastDentalCheckup_Date();
			logger.info("Clicked on dental checkup date");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setLastDentalMonth();
			logger.info("Clicked on dental month");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setLastDentalYear();
			logger.info("Select year dental date");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickMonthDentalDate();
			logger.info("Click on date of the dental date");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			// Handle date picker of the Medical Check up.
			register_grouponCode.clickLastPhysical_CheckupDate();
			logger.info("Clicked on medical date picker");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setMedicalMonth();
			logger.info("Select medical month");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setMedicalYear();
			logger.info("Select medical year");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickMedicalDate();
			logger.info("Clicked on date of the medical");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Does your child have any allergies, medical, and/or physical issues?
			register_grouponCode.clickPhysicalIssueName();
			logger.info("Clicked on physical name");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Previous Button Allergies=========================
			register_grouponCode.clickMedicalPrevious();
			logger.info("clicked on medical previous button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickStudentFormNext();
			logger.info("Clicked on student next button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickProceedToPreview();
			logger.info("Clicked on procced to preview");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickEditCheckOut();
			logger.info("Clicked on edit checkout button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickStudProceedToPreview();
			logger.info("Clicked on the student preview button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Tuition Summary Details & Checkout Process====================
			register_grouponCode.checkboxTerms_Conditions();
			logger.info("Clicked on checkbox terms condition box");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickCheckoutButton();
			logger.info("Clicked on checkout button");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			/*//Payment Page Using PromoCode 333 Payment Method================
			register_grouponCode.clickPromoCode();
			logger.info("Clicked on promocode");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.clickHavePromoCode("333");
			logger.info("Enter promo code");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			register_grouponCode.ClickAppyButton();
			logger.info("Clicked on apply button");
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			register_grouponCode.clickSubmitPayment();
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			Thread.sleep(3000);*/
			//Payment Credit Card Details=======================
			register_grouponCode.setCardHolderName("JASON HODGES");
			logger.info("Enter CardhsetCreditCardNumberolder Name");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			register_grouponCode.setStreetAddress("WZ 420 Court House");
			logger.info("Enter Street Address");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.setCityName("420 Court IT Park");
			logger.info("Enter City Name Payment");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.set_ZipCode("12345");
			logger.info("Enter Zip Code Paymnet");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.set_PhoneNum("9878879887");
			logger.info("Enter phone number");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			register_grouponCode.setCreditCardNumber("4916010425776386");
			logger.info("Enter creditCard Number");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			register_grouponCode.setExpirationMonth();
			logger.info("Select card Expiration month");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			register_grouponCode.setExpirationYear();
			logger.info("Enter Expiration year");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			register_grouponCode.setCardSecurityNumber("633");
			logger.info("Enter card security number");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			register_grouponCode.click_Payment();
			logger.info("Click on Payment submit button");
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(6000);
			
			String actualTitle1 = driver.getTitle();
			String expectedTitle1 = "Positive Ally — Registration";
			if(actualTitle1.equalsIgnoreCase(expectedTitle1))
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

}

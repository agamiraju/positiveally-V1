package com.positiveAlly.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUser_GrouponPage 
{
	WebDriver ldriver;
	public AddUser_GrouponPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Create Account Parent for Groupon code===================
	@FindBy(how=How.ID, using="firstname")
	@CacheLookup
	WebElement user_Firstname;
	
	@FindBy(how=How.NAME, using="middlename")
	@CacheLookup
	WebElement user_Middlename;
	
	@FindBy(how=How.NAME, using="lastname")
	@CacheLookup
	WebElement user_Lastname;
	
	@FindBy(how=How.NAME, using="street_address1")
	@CacheLookup
	WebElement user_StreetAdrress1;
	
	@FindBy(how=How.NAME, using="street_address2")
	@CacheLookup
	WebElement user_StreetAdrress2;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement user_StateName;
	
	@FindBy(how= How.ID, using="city")
	@CacheLookup
	WebElement user_CityName;
	
	@FindBy (how = How.CLASS_NAME, using = "ui-menu-item")
	@CacheLookup
	WebElement txtCityName;
	
	@FindBy(how= How.ID, using="zip")
	@CacheLookup
	WebElement userZipcode;
	
	@FindBy(how= How.NAME, using="email_id")
	@CacheLookup
	WebElement user_EmailId;
	
	@FindBy(how= How.NAME, using="password")
	@CacheLookup
	WebElement user_Password;
	
	@FindBy(how= How.NAME, using="confirm_password")
	@CacheLookup
	WebElement user_confirm_password;
	
	@FindBy(how= How.XPATH, using="//*[@class = 'btn btn-warning first-tabs-button']")
	@CacheLookup
	WebElement user_Signup_Button;
	
	//Clicked on back button after getting registration message.
	@FindBy(how= How.XPATH, using="//*[@href = 'http://localhost/positiveally/login/login_form']")
	@CacheLookup
	WebElement user_Back_Button;
	
	// Login parent account================================
	@FindBy(how= How.NAME, using="user_email_id")
	@CacheLookup
	WebElement user_Email;
	
	@FindBy(how= How.ID, using="password")
	@CacheLookup
	WebElement user_Pass;
	
	@FindBy(how= How.XPATH, using="//*[@class = 'btn btn-warning first-tabs-button']")
	@CacheLookup
	WebElement user_Login_btn;
	
	//Please select grade for Summer Registration====
	@FindBy(how= How.ID, using="student_grade")
	@CacheLookup
	WebElement select_GradeName;
		
	@FindBy(how= How.ID, using="grade_summer_button")
	@CacheLookup
	WebElement click_submit_button;
	
	//Father/Guardian's Details=====================
	@FindBy (how = How.ID, using = "father")
	@CacheLookup
	WebElement txtFather;
	
	@FindBy (how = How.ID, using = "fatherwork")
	@CacheLookup
	WebElement txtFatherWork;
	
	@FindBy (how = How.ID, using = "fathercell")
	@CacheLookup
	WebElement txtCellFather;
	
	@FindBy (how = How.ID, using = "fatheremail")
	@CacheLookup
	WebElement txtFatherEmailid;
	
	@FindBy (how = How.ID, using = "next")
	@CacheLookup
	WebElement click_NextButton;
	
	//Mother/Guardian's Details ==================
	@FindBy (how = How.ID, using = "mother")
	@CacheLookup
	WebElement txtMother;
	
	@FindBy (how = How.ID, using = "motherwork")
	@CacheLookup
	WebElement txtMotherPhone;
	
	@FindBy (how = How.ID, using = "mothercell")
	@CacheLookup
	WebElement txtMotherCellPhone;
	
	@FindBy (how = How.ID, using = "motheremail")
	@CacheLookup
	WebElement txtMotherEmail;
	
	//Previous===================================
	@FindBy (how = How.ID, using = "previous")
	@CacheLookup
	WebElement clickPreviousButton;
	
	@FindBy (how = How.ID, using = "next")
	@CacheLookup
	WebElement clickParentNextButton;
	
	@FindBy (how = How.ID, using = "next")
	@CacheLookup
	WebElement txtMotherNextButton;
	
	//Emergency Contact's Details=========================
	@FindBy (how = How.ID, using = "emergency")
	@CacheLookup
	WebElement txtemergency_Name;
	
	@FindBy (how = How.ID, using = "emergencycell")
	@CacheLookup
	WebElement txtwork_Phone;
	
	@FindBy (how = How.ID, using = "emergency_address")
	@CacheLookup
	WebElement txtwork_Address;
	
	@FindBy (how = How.ID, using = "emergency1")
	@CacheLookup
	WebElement txtName_Emergency;
	
	@FindBy (how = How.ID, using = "emergencycell1")
	@CacheLookup
	WebElement txtCell_Phone;
	
	@FindBy (how = How.ID, using = "emergencyaddress1")
	@CacheLookup
	WebElement txtemergenc_Address;
	
	//Previous Button==============================
	@FindBy (how = How.ID, using = "previous")
	@CacheLookup
	WebElement txtEmergencyPreviousButton;
	
	@FindBy (how = How.ID, using = "next")
	@CacheLookup
	WebElement txtMotherPreviousNextButton;
	
	@FindBy (how = How.ID, using = "next")
	@CacheLookup
	WebElement clickEmergencyNextButton;
	
	//Registration filled======================
	@FindBy (how = How.NAME, using = "parent[registrant]")
	@CacheLookup
	WebElement txtRegistrationFiled;
	
	@FindBy (how = How.NAME, using = "parent[email]")
	@CacheLookup
	WebElement txtRegistrantEmail;
	
	//Previous Button===============================
	@FindBy (id = "previous")
	@CacheLookup
	WebElement clickRegistrantsPreviousButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickEmergencyContactNextButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickNextRegistrant;
	
	//Have groupon code?============================
	@FindBy (id = "groupon_code")
	@CacheLookup
	WebElement text_GrouponCode;
	
	@FindBy (how = How.CLASS_NAME, using = "groupon-apply-button")
	@CacheLookup
	WebElement click_groupon_apply_button;

	//Select weeks Enrichment + FieldTrip(GROUPON-CODE) summer program=============
	
	//Week 1- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//*[@class = 'labelauty-unchecked'][1]")
	@CacheLookup
	WebElement click_Enrichment_1;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath ="//*[@class = 'labelauty-unchecked'][2]")
	@CacheLookup
	WebElement click_Fieldtrip_1;
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_2;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_2;
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_3;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_3;
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_4;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_4;
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_5;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_5;
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_6;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_6;
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_7;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_7;
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_8;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_8;
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_9;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_9;
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_10;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip_10;


	//Select weeks Speciality + FieldTrip(GROUPON-CODE) summer program=============
	
	//Week 1- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked[1]")
	@CacheLookup
	WebElement click_AMSpecialty1;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath ="//*[@class = 'labelauty-unchecked'][2]")
	@CacheLookup
	WebElement click_Fieldtrip1;
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty2;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip2;
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty3;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip3;
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty4;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip4;
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty5;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip5;
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty6;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip6;
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty7;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip7;
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty8;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip8;
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty9;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip9;
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty10;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip10;
	
	
	//ENRICHMENT (GROUPON-CODE) summer program==============================
	
	//Week 1- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//*[@class = 'labelauty-unchecked']")
	@CacheLookup
	WebElement click_Enrichment_One;
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//*[@class = 'labelauty-unchecked']")
	@CacheLookup
	WebElement click_Enrichement_Two;
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_Three;
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_Four;
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_Five;
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_Six;
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_Seven;
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_Eight;
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_Nine;
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement_Ten;
		
	
	//SPECIALTY (GROUPON-CODE) summer program==================================
	
	//Week 1- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked[1]")
	@CacheLookup
	WebElement click_AMSpecialty_One;
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Two;
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Three;
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Four;
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Five;

	//Week 6- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Six;
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Seven;
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Eight;
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Nine;
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty_Ten;
	
	
	//FIELDTRIP (GROUPON-CODE) summer program===================================	
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath ="//*[@class = 'labelauty-unchecked'][2]")
	@CacheLookup
	WebElement click_FieldTrip_One;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Two;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Three;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Four;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Five;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Six;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Seven;
		
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Eight;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Nine;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_FieldTrip_Ten;
		
	
	
	//Program Details Page(Previous) After school & summer program=====================
	@FindBy (how=How.ID, using = "previous")
	@CacheLookup
	WebElement clickPreviousProgramButton;
	
	@FindBy (how=How.ID, using = "next")
	@CacheLookup
	WebElement clickPreviousNextRegistrant;
	
	@FindBy (how=How.ID, using = "next")
	@CacheLookup
	WebElement clickNextRegistrant2;
	
	//Student details for Registration After School & Summer Program==================
	@FindBy (how=How.NAME, using = "student[0][firstname]")
	@CacheLookup
	WebElement txtFirstname;
	
	@FindBy (how=How.ID, using = "lastname0")
	@CacheLookup
	WebElement txtLastname;
	
	@FindBy (how=How.ID, using = "gender0")
	@CacheLookup
	WebElement txtGender;
	
	@FindBy (how=How.ID, using = "address0")
	@CacheLookup
	WebElement txtAddress1;
	
	@FindBy (how=How.ID, using = "city0")
	@CacheLookup
	WebElement txtCity_Name;
	
	@FindBy (how=How.CLASS_NAME, using = "ui-menu-item")
	@CacheLookup
	WebElement txtCityName1;
	
	@FindBy (how=How.NAME, using = "student[0][zip]")
	@CacheLookup
	WebElement txtZip_Code_stud;
	
	@FindBy (how=How.ID, using = "phone0")
	@CacheLookup
	WebElement txtPhone;
	
	//Date of birth of the student===========
	@FindBy (how=How.ID, using = "birth0")
	@CacheLookup
	WebElement txtDateOfBirth;
	
	@FindBy (how=How.CLASS_NAME, using = "ui-datepicker-month")
	@CacheLookup
	WebElement txtCalenderMonthOfBirth;
	
	@FindBy (how=How.CLASS_NAME, using = "ui-datepicker-year")
	@CacheLookup
	WebElement txtCalenderYearOfBirth;
	
	@FindBy (how=How.CLASS_NAME, using = "ui-state-default")
	@CacheLookup
	WebElement clickCalenderDateOfBirth;
	
	//Previous Button------------
	@FindBy (how=How.ID, using = "previous")
	@CacheLookup
	WebElement clickStudentPreviousButton; 
	
	@FindBy (how=How.ID, using = "next")
	@CacheLookup
	WebElement ClickProgramNextButton;
	
	@FindBy (how=How.ID, using = "next")
	@CacheLookup
	WebElement ClickStudentNextButton;

	//Dental Doctor Information===================
	@FindBy (how=How.ID, using = "dental_doctor_name0")
	@CacheLookup
	WebElement txtDentalDoctorName;
	
	@FindBy (how=How.ID, using = "medical_doctor_name0")
	@CacheLookup
	WebElement txtMedicalDoctorName;
	
	//Handle date picker of the Dental Check Up=====
	@FindBy (how=How.ID, using = "dental0")
	@CacheLookup
	WebElement txtLastDentalCheckupDate; 
	
	@FindBy (how=How.CLASS_NAME, using = "ui-datepicker-month")
	@CacheLookup
	WebElement txtLastDentalMonth; 
	
	@FindBy (how=How.CLASS_NAME, using = "ui-datepicker-year")
	@CacheLookup
	WebElement txtLastDentalYear; 
	
	@FindBy (how=How.CLASS_NAME, using = "ui-state-default")
	@CacheLookup
	WebElement txtMonthDentalDate; 
	
	// Handle date picker of the Medical Check up.
	@FindBy (how=How.ID, using = "medical0")
	@CacheLookup
	WebElement clcikLastPhysicalCheckupDate;
	
	@FindBy (how=How.CLASS_NAME, using = "ui-datepicker-month")
	@CacheLookup
	WebElement txtMedicalMonth;
	
	@FindBy (how=How.CLASS_NAME, using = "ui-datepicker-year")
	@CacheLookup
	WebElement txtMedicalYear;
	
	@FindBy (how=How.CLASS_NAME, using = "ui-state-default")
	@CacheLookup
	WebElement txtMedicalDate;
	
	//Does your child have any allergies, medical, and/or physical issues?
	@FindBy (how=How.ID, using = "have_issue0")
	@CacheLookup
	WebElement txtPhysicalIssueName;
	
	//Previous Button Allergies===================
	@FindBy (how=How.ID, using = "previous")
	@CacheLookup
	WebElement click_PreviousButton;
	
	@FindBy (how=How.ID, using = "next")
	@CacheLookup
	WebElement clickStudentFormNextButton;
	
	@FindBy (how=How.ID, using = "submit_button")
	@CacheLookup
	WebElement clickProceedToPreview;
	
	@FindBy (how=How.XPATH, using = "//*[@ class = 'btn btn-info']")
	@CacheLookup
	WebElement clickEditCheckoutButton;
	
	@FindBy (how=How.XPATH, using = "//*[@ class = 'col-lg-4 col-md-3 col-sm-5 col-xs-5 margin20']/img")
	@CacheLookup
	WebElement clickStudProceedToPreview;

	//Tuition Summary Details====================
	@FindBy (how=How.NAME, using = "agree")
	@CacheLookup
	WebElement checkBoxTermsConditions3;
	
	//Checkout Process------------
	@FindBy (how=How.ID, using = "proceed_to_payment")
	@CacheLookup
	WebElement clickCheckoutButton1;
	
	//Payment Page Using PromoCode 333 Payment Method================
	@FindBy (how=How.ID, using = "check")
	@CacheLookup
	WebElement clickHavePromoCode2;
	
	@FindBy (how=How.ID, using = "promocode")
	@CacheLookup
	WebElement txtHavePromoCode2;
	
	@FindBy (how=How.ID, using = "apply_promocode")
	@CacheLookup
	WebElement txtClickAppy2;
	
	@FindBy (how=How.ID, using = "paypal_submit")
	@CacheLookup
	WebElement clickSubmitPayment2;
	
	//Payment Credit Card Details=======================
	@FindBy (how=How.ID, using = "customer_first_name")
	@CacheLookup
	WebElement txtCardHolderName2;
	
	@FindBy (how=How.NAME, using = "customer_address1")
	@CacheLookup
	WebElement txtStreetAddress2;

	@FindBy (how=How.NAME, using = "customer_city")
	@CacheLookup
	WebElement txtCityName2;
	
	@FindBy (how=How.ID, using = "customer_zip")
	@CacheLookup
	WebElement txtZipCode2;
	
	@FindBy (how=How.ID, using = "phonenumber")
	@CacheLookup
	WebElement txtPhone_Number2;
	
	@FindBy (how=How.NAME, using = "customer_credit_card_number")
	@CacheLookup
	WebElement txtCreaditCardNumber2;
	
	@FindBy (how=How.NAME, using = "cc_expiration_month")
	@CacheLookup
	WebElement txtExpirationMonth2;
	
	@FindBy (how=How.NAME, using = "cc_expiration_year")
	@CacheLookup
	WebElement txtExpirationYear2;
	
	@FindBy (how=How.NAME, using = "cc_cvv2_number")
	@CacheLookup
	WebElement txtCardSecurityNumber2;
	
	@FindBy (how=How.XPATH, using = "//*[@id = 'paypal_submit']")
	@CacheLookup
	WebElement click_Payment;
	
	//Digial Signature========================
	@FindBy (how = How.XPATH, using = "//*[@id = 'signature-pad']")
	@CacheLookup
	WebElement txtSignature_Pad;
	
	@FindBy (how = How.ID, using = "save_signature")
	@CacheLookup
	WebElement click_Signature_save;
	
	
	//Action Method================================
	//Create Account Parent for Groupon code==========
	public void user_Firstname(String firstname)
	{
		user_Firstname.sendKeys(firstname);
	}
	
	public void user_Middlename(String middlename)
	{
		user_Middlename.sendKeys(middlename);
	}
	
	public void user_Lastname(String lastname)
	{
		user_Lastname.sendKeys(lastname);
	}
	
	public void user_StreetAdrress1(String streetaddre1)
	{
		user_StreetAdrress1.sendKeys(streetaddre1);
	}

	public void user_StreetAdrress2(String streetadre2)
	{
		user_StreetAdrress2.sendKeys(streetadre2);
	}
	
	public void user_StateName()
	{
		user_StateName.click();
	}
	
	public void select_StateName()
	{
		Select drop_stateName = new Select(user_StateName);
		drop_stateName.selectByVisibleText("Virginia");
	}
	
	public void user_CityName(String Afton)
	{
		user_CityName.sendKeys(Afton);
		selectOptionWithText(Afton);
	}
	
	private void selectOptionWithText(String afton) {
		// TODO Auto-generated method stub
		
	}
	
	public void click_Cityname()
	{
		txtCityName.click();
	}

	public void user_Zip_code(String zipcode)
	{
		userZipcode.sendKeys(zipcode);
	}
	
	public void user_EmailId(String emailid)
	{
		user_EmailId.sendKeys(emailid);
	}
	
	public void user_Password(String password)
	{
		user_Password.sendKeys(password);
	}
	
	public void user_confirm_password(String conf_password)
	{
		user_confirm_password.sendKeys(conf_password);
	}
	
	public void user_Signup_Button()
	{
		user_Signup_Button.click();
	}

	//Clicked on back button after getting registration message.
	public void user_Back_Button()
	{
		user_Back_Button.click();
	}
	
	// Login parent account================================
	public void user_Email(String email)
	{
		user_Email.sendKeys(email);
	}
	
	public void user_Pass(String pass)
	{
		user_Pass.sendKeys(pass);
	}
	
	public void user_Login_btn()
	{
		user_Login_btn.click();
	}
	
	//After Logging Account_Groupon- register student for summer program using groupon code.
	public void click_GradeName()
	{
		select_GradeName.click();
	}
	
	public void select_gradeName()
	{
		Select drop_grade = new Select(select_GradeName);
		drop_grade.selectByVisibleText("KG");	
				
	}
	public void click_submit_button()
	{
		click_submit_button.click();
	}
	
	//Father/Guardian's Details=====================
	public void setFathername(String fathername)
	{
		txtFather.sendKeys(fathername);
	}
	
	public void setFatherWork(String fatherwork)
	{
		txtFatherWork.sendKeys(fatherwork);
	}
	
	public void setCellFather(String cellfather)
	{
		txtCellFather.sendKeys(cellfather);
	}
	
	public void setfatheremail(String emailfather)
	{
		txtFatherEmailid.sendKeys(emailfather);
	}
	
	public void click_NextButton()
	{
		click_NextButton.click();
	}
	
	//Mother/Guardian's Details ==================
	public void setMother(String fathername)
	{
		txtMother.sendKeys(fathername);
	}
	
	public void setMotherPhone(String motherphone)
	{
		txtMotherPhone.sendKeys(motherphone);
	}
	
	public void txtMotherCellPhone(String mothercellphone)
	{
		txtMotherCellPhone.sendKeys(mothercellphone);
	}
	
	public void setMother_Emailid(String motheremail)
	{
		txtMotherEmail.sendKeys(motheremail);
	}

	//Previous===================================
	public void clickPreviousButton()
	{
		clickPreviousButton.click();
	}
	
	public void clickParentNextButton()
	{
		clickParentNextButton.click();
	}
	
	public void clickMotherNextButton()
	{
		txtMotherNextButton.click();
	}
	
	//Emergency Contact's Details=========================
	public void setemergency_Name(String emergency)
	{
		txtemergency_Name.sendKeys(emergency);
	}
	
	public void setwork_Phone(String workphone)
	{
		txtwork_Phone.sendKeys(workphone);
	}

	public void setAddressname(String address)
	{
		txtwork_Address.sendKeys(address);
	}
	
	public void setemergency_Name2(String emergency)
	{
		txtName_Emergency.sendKeys(emergency);
	}
	
	public void setemergency_phone(String phone)
	{
		txtCell_Phone.sendKeys(phone);
	}
	
	public void txtemergenc_Address(String secondAdd)
	{
		txtemergenc_Address.sendKeys(secondAdd);
	}
	
	//Previous Button==============================
	public void clickEmergencyPrevious()
	{
		txtEmergencyPreviousButton.click();
	}

	public void clickMotherPreviousNext()
	{
		txtMotherPreviousNextButton.click();
	}
	
	public void clickEmergencyNext()
	{
		clickEmergencyNextButton.click();
	}
	
	//Registration filled======================
	public void setRegistrationFiled(String registrant)
	{
		txtRegistrationFiled.sendKeys(registrant);
	}
	
	public void setRegistrantEmail(String registratantemail)
	{
		txtRegistrantEmail.sendKeys(registratantemail);
	}
	
	//Previous Button===============================
	public void clickRegistrantsPrevious()
	{
		clickRegistrantsPreviousButton.click();
	}
	
	public void clickEmergencyContactNext()
	{
		clickEmergencyContactNextButton.click();
	}
	
	public void clickNextRegistrant()
	{
		clickNextRegistrant.click();
	}
	
	//Have groupon code?============================
	public void text_GrouponCode(String grouponCode)
	{
		text_GrouponCode.sendKeys(grouponCode);
	}
	
	public void click_groupon_apply_button()
	{
		click_groupon_apply_button.click();
	}
	
	
	//Select weeks Enrichment + FieldTrip(GROUPON-CODE) summer program=============
	//Week 1- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichment_1()
	{
		//click_Enrichment_1.click();
		List<WebElement> we = new ArrayList<WebElement>();
	    we = ldriver.findElements(By.className("labelauty-unchecked"));
	    
	    /*we.get(0).click(); // clicks on "first"
        we.get(1).click(); // clicks on "second"
        we.get(2).click(); // clicks on "third"
        we.get(3).click(); // clicks on "third"
        we.get(4).click(); // clicks on "third"
        we.get(5).click(); // clicks on "third"
        we.get(6).click(); // clicks on "third"
*/    
        //If we want to select every week then we need to use loop.
        for(WebElement check: we)
    {
        check.click(); // click all the 10 elements and comes out of loop
    }
      
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldtrip_1()
	{
		click_Fieldtrip_1.click();
	}
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_2()
	{
		click_Enrichement_2.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_2()
	{
		click_Fieldetrip_2.click();
	}
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_3()
	{
		click_Enrichement_3.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_3()
	{
		click_Fieldetrip_3.click();
	}
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_4()
	{
		click_Enrichement_4.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_4()
	{
		click_Fieldetrip_4.click();
	}
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_5()
	{
		click_Enrichement_5.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_5()
	{
		click_Fieldetrip_5.click();
	}
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_6()
	{
		click_Enrichement_6.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_6()
	{
		click_Fieldetrip_6.click();
	}
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_7()
	{
		click_Enrichement_7.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_7()
	{
		click_Fieldetrip_7.click();
	}
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_8()
	{
		click_Enrichement_8.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_8()
	{
		click_Fieldetrip_8.click();
	}
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_9()
	{
		click_Enrichement_9.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_9()
	{
		click_Fieldetrip_9.click();
	}
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_10()
	{
		click_Enrichement_10.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip_10()
	{
		click_Fieldetrip_10.click();
	}

	
	//Select weeks Specialty + FieldTrip(GROUPON-CODE) summer program=============
	//Week 1- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_AMSpecialty1()
	{
		List<WebElement> we = new ArrayList<WebElement>();
	    we = ldriver.findElements(By.className("labelauty-unchecked"));
	    
	    /*we.get(0).click(); // clicks on "first"
        we.get(1).click(); // clicks on "second"
        we.get(2).click(); // clicks on "third"
        we.get(3).click(); // clicks on "third"
        we.get(4).click(); // clicks on "third"
        we.get(5).click(); // clicks on "third"
        we.get(6).click(); // clicks on "third"
*/    
        //If we want to select every week then we need to use loop.
        for(WebElement check: we)
    {
        check.click(); // click all the 10 elements and comes out of loop
    }
      
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldtrip1()
	{
		click_Fieldtrip1.click();
	}
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty2()
	{
		click_AMSpecialty2.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip2()
	{
		click_Fieldetrip2.click();
	}
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty3()
	{
		click_AMSpecialty3.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip3()
	{
		click_Fieldetrip3.click();
	}
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty4()
	{
		click_AMSpecialty4.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip4()
	{
		click_AMSpecialty4.click();
	}
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty5()
	{
		click_AMSpecialty5.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip5()
	{
		click_Fieldetrip5.click();
	}
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty6()
	{
		click_AMSpecialty6.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip6()
	{
		click_Fieldetrip6.click();
	}
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty7()
	{
		click_AMSpecialty7.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip7()
	{
		click_Fieldetrip7.click();
	}
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty8()
	{
		click_AMSpecialty8.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip8()
	{
		click_Fieldetrip8.click();
	}
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty9()
	{
		click_AMSpecialty9.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip9()
	{
		click_Fieldetrip9.click();
	}
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty10()
	{
		click_AMSpecialty10.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip10()
	{
		click_Fieldetrip10.click();
	}
	
	
	//ENRICHMENT (GROUPON-CODE) summer program==============================
	
	//Week 1- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichment_One()
	{
		//click_Enrichment_One.click();
		List<WebElement> we = new ArrayList<WebElement>();
	    we = ldriver.findElements(By.className("labelauty-unchecked"));
	    
	    /*we.get(0).click(); // clicks on "first"
        we.get(1).click(); // clicks on "second"
        we.get(2).click(); // clicks on "third"
        we.get(3).click(); // clicks on "third"
        we.get(4).click(); // clicks on "third"
        we.get(5).click(); // clicks on "third"
        we.get(6).click(); // clicks on "third"
*/    
        //If we want to select every week then we need to use loop.
        for(WebElement check: we)
    {
        check.click(); // click all the 10 elements and comes out of loop
    }
	}
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Two()
	{
		click_Enrichement_Two.click();
	}
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Three()
	{
		click_Enrichement_Three.click();
	}
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Four()
	{
		click_Enrichement_Four.click();
	}
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Five()
	{
		click_Enrichement_Five.click();
	}
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Six()
	{
		click_Enrichement_Six.click();
	}
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Seven()
	{
		click_Enrichement_Seven.click();
	}
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Eight()
	{
		click_Enrichement_Eight.click();
	}
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Nine()
	{
		click_Enrichement_Nine.click();
	}
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.
	public void click_Enrichement_Ten()
	{
		click_Enrichement_Ten.click();
	}
		
	
	//SPECIALTY (GROUPON-CODE) summer program==================================
	//Week 1- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_One()
	{
		//click_AMSpecialty_One.click();
		List<WebElement> we = new ArrayList<WebElement>();
	    we = ldriver.findElements(By.className("labelauty-unchecked"));
	    
	    /*we.get(0).click(); // clicks on "first"
        we.get(1).click(); // clicks on "second"
        we.get(2).click(); // clicks on "third"
        we.get(3).click(); // clicks on "third"
        we.get(4).click(); // clicks on "third"
        we.get(5).click(); // clicks on "third"
        we.get(6).click(); // clicks on "third"
*/    
        //If we want to select every week then we need to use loop.
        for(WebElement check: we)
    {
        check.click(); // click all the 10 elements and comes out of loop
    }
	}
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Two()
	{
		click_AMSpecialty_Two.click();
	}
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Three()
	{
		click_AMSpecialty_Three.click();
	}
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Four()
	{
		click_AMSpecialty_Four.click();
	}
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Five()
	{
		click_AMSpecialty_Five.click();
	}

	//Week 6- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Six()
	{
		click_AMSpecialty_Six.click();
	}
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Seven()
	{
		click_AMSpecialty_Seven.click();
	}
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Eight()
	{
		click_AMSpecialty_Eight.click();
	}
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Nine()
	{
		click_AMSpecialty_Nine.click();
	}
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.
	public void click_AMSpecialty_Ten()
	{
		click_AMSpecialty_Ten.click();
	}
	
	
	//FIELDTRIP (GROUPON-CODE) summer program===================================	
   //P.M Camp 1:00-5:45
	public void click_FieldTrip_One()
	{
		//click_FieldTrip_One.click();
		List<WebElement> we = new ArrayList<WebElement>();
	    we = ldriver.findElements(By.className("labelauty-unchecked"));
	    
	    /*we.get(0).click(); // clicks on "first"
        we.get(1).click(); // clicks on "second"
        we.get(2).click(); // clicks on "third"
        we.get(3).click(); // clicks on "third"
        we.get(4).click(); // clicks on "third"
        we.get(5).click(); // clicks on "third"
        we.get(6).click(); // clicks on "third"
*/    
        //If we want to select every week then we need to use loop.
        for(WebElement check: we)
    {
        check.click(); // click all the 10 elements and comes out of loop
    }
	}
	
	//P.M Camp 1:00-5:45
	public void click_FieldTrip_Two()
	{
		click_FieldTrip_Two.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_FieldTrip_Three()
	{
		click_FieldTrip_Three.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_FieldTrip_Four()
	{
		click_FieldTrip_Four.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_FieldTrip_Five()
	{
		click_FieldTrip_Five.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_FieldTrip_Six()
	{
		click_FieldTrip_Six.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_FieldTrip_Seven()
	{
		click_FieldTrip_Seven.click();
	}
		
	//P.M Camp 1:00-5:45
	public void click_FieldTrip_Eight()
	{
		click_FieldTrip_Eight.click();
	}
	
	//P.M Camp 1:00-5:45.
	public void click_FieldTrip_Nine()
	{
		click_FieldTrip_Nine.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_FieldTrip_Ten()
	{
		click_FieldTrip_Ten.click();
	}
	
	//Program Details Page(Previous) After school & summer program=====================
	public void clickPreviousProgram()
	{
		clickPreviousProgramButton.click();
	}
	
	public void clickPreviousNextRegistrant()
	{
		clickPreviousNextRegistrant.click();
	}
	
	public void clickNextRegistrant2()
	{
		clickNextRegistrant2.click();
	}
	
	//Student details for Registration After School & Summer Program==================
	public void setFirstname(String firstname)
	{
		txtFirstname.sendKeys(firstname);
	}
	
	public void setLastname(String lastname)
	{
		txtLastname.sendKeys(lastname);
	}
	
	public void setGender()
	{
		txtGender.click();
	}
	 
	public void selectGenter()
	{
		Select drop_gender = new Select(txtGender);
		drop_gender.selectByVisibleText("Male");
	}
	 
	public void setAddress1(String address1)
	{
		txtAddress1.sendKeys(address1);
	}
	
	public void selectCity_Name(String Afton)
	{
		txtCity_Name.sendKeys(Afton);
		selectOptionWithText(Afton);
	}
	
	private void selectOptionWithText1(String afton) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void click_CityName()
	{
		txtCityName1.click();
	}
	
	public void setZip_CodeStudent(String zipcode)
	{
		txtZip_Code_stud.sendKeys(zipcode);
	}
	
	public void setPhoneNumber(String phone_NUM)
	{
		txtPhone.sendKeys(phone_NUM);
	}
	
	public void setMobile_number(String numbermobile)
	{
		txtPhone.sendKeys(numbermobile);
	}
	
	//Date of birth of the student=======================
	public void clickDateOfBirth()
	{
		txtDateOfBirth.click();
	}
	
	public void setCalenderMonthOfBirth()
	{
		Select drop_selectMonth2 = new Select(txtCalenderMonthOfBirth);
		drop_selectMonth2.selectByVisibleText("Feb");
	}
	
	public void selectYearBirth()
	{
		Select drop_selectYear = new Select(txtCalenderYearOfBirth);
		drop_selectYear.selectByVisibleText("2011");
	}
	
	public void clickDateMonth()
	{
		clickCalenderDateOfBirth.click();
	}
	//Previous Button Student deatils page====================
	public void clickStudentPrevious()
	{
		clickStudentPreviousButton.click();
	}
	
	public void ClickProgramNext()
	{
		ClickProgramNextButton.click();
	}
	
	public void ClickStudentNext()
	{
		ClickStudentNextButton.click();
	}
	
	//Dental Doctor Information===================
	public void setDentalDoctorName(String dentalDocName)
	{
		txtDentalDoctorName.sendKeys(dentalDocName);
	}
	
	public void setMedicalDoctorName(String medicalDocName)
	{
		txtMedicalDoctorName.sendKeys(medicalDocName);
	}
	
	//Handle date picker of the Dental Check Up====
	public void clickLastDentalCheckup_Date()
	{
		txtLastDentalCheckupDate.click();
	}

	public void setLastDentalMonth()
	{
		Select drop_DentalMonth3 = new Select(txtLastDentalMonth);
		drop_DentalMonth3.selectByVisibleText("Jan");
	}
	
	public void setLastDentalYear()
	{
		Select drop_DentalYear = new Select(txtLastDentalYear);
		drop_DentalYear.selectByVisibleText("2018");
	}
	 
	public void clickMonthDentalDate()
	{
		txtMonthDentalDate.click();
	}
	
	// Handle date picker of the Medical Check up.
	public void clickLastPhysical_CheckupDate()
	{
		clcikLastPhysicalCheckupDate.click();
	}
	
	public void setMedicalMonth()
	{
		Select drop_Medical_Month5 = new Select(txtMedicalMonth);
		drop_Medical_Month5.selectByVisibleText("Jan");
	}
	
	public void setMedicalYear()
	{
		Select drop_MedicalYear5 = new Select(txtMedicalYear);
		drop_MedicalYear5.selectByVisibleText("2018");
	}
	
	public void clickMedicalDate()
	{
		txtMedicalDate.click();
	}
	//Does your child have any allergies, medical, and/or physical issues?
	public void clickPhysicalIssueName()
	{
		Select drop_AllergiesChild3 = new Select(txtPhysicalIssueName);
		drop_AllergiesChild3.selectByVisibleText("No");
	}
	
	//Previous Button Allergies=========================
	public void clickMedicalPrevious()
	{
		clickPreviousButton.click();
	}
	
	public void clickStudentFormNext()
	{
		clickStudentFormNextButton.click();
	}
	
	public void clickProceedToPreview()
	{
		clickProceedToPreview.click();
	}
	
	public void clickEditCheckOut()
	{
		clickEditCheckoutButton.click();
	}
	
	public void clickStudProceedToPreview()
	{
		clickStudProceedToPreview.click();
	}
	
	//Tuition Summary Details & Checkout Process====================
	public void checkboxTerms_Conditions()
	{
		checkBoxTermsConditions3.click();
	}
	
	public void clickCheckoutButton()
	{
		clickCheckoutButton1.click();
	}
	
	//Payment Page Using PromoCode 333 Payment Method================
	public void clickPromoCode()
	{
		clickHavePromoCode2.click();
	}
	
	public void clickHavePromoCode(String promoCode)
	{
		txtHavePromoCode2.sendKeys(promoCode);
	}
	
	public void ClickAppyButton()
	{
		txtClickAppy2.click();
	}
	
	public void clickSubmitPayment()
	{
		clickSubmitPayment2.click();
	}
	
	//Payment Credit Card Details=======================
	public void setCardHolderName(String cardHolder)
	{
		txtCardHolderName2.sendKeys(cardHolder);
	}
	
	public void setStreetAddress(String streetAddress)
	{
		txtStreetAddress2.sendKeys(streetAddress);
	}

	public void setCityName(String cityname)
	{
		txtCityName2.sendKeys(cityname);
	}
	
	public void set_ZipCode(String zip_Code1)
	{
		txtZipCode2.sendKeys(zip_Code1);
	}
	
	public void set_PhoneNum(String phone_number)
	{
		txtPhone_Number2.sendKeys(phone_number);
	}
	
	public void setCreditCardNumber(String credit_number)
	{
		txtCreaditCardNumber2.sendKeys(credit_number);
	}
	
	public void setExpirationMonth()
	{
		Select drop_ExpirationMonth = new Select(txtExpirationMonth2);
		drop_ExpirationMonth.selectByVisibleText("02");
	}
	
	public void setExpirationYear()
	{
		Select drop_ExpirationYear = new Select(txtExpirationYear2);
		drop_ExpirationYear.selectByVisibleText("2020");
	}
	
	public void setCardSecurityNumber(String ccv_Number)
	{
		txtCardSecurityNumber2.sendKeys(ccv_Number);
	}
	
	public void click_Payment()
	{
		click_Payment.click();
	}
	
	//Digital Signature===================================
	public void digital_Signature()
	{
		Actions builder = new Actions(ldriver);
		Action drawAction = builder.moveToElement(txtSignature_Pad,20,30) //start points x axis and y axis. 
	              .click()
	              .moveByOffset(40, 60) // 2nd points (x1,y1)
	              .click()
	              .moveByOffset(20, 30)// 3rd points (x2,y2)
	              .doubleClick()
	              .build();
	    drawAction.perform();
	}
	
	public void click_Signature_save()
	{
		click_Signature_save.click();
	}
	
	

	
	
	
	

}

package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Student_Registration_VAPage 
{
	WebDriver ldriver;
	public Student_Registration_VAPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Academic Session and Search===================
	@FindBy (name = "session")
	@CacheLookup
	WebElement txtClickSessionDropdown2;
	
	@FindBy (name = "state")
	@CacheLookup
	WebElement txtClickStateDropdown2;
	
	@FindBy (name = "select_student_nos")
	@CacheLookup
	WebElement txtClickNumberOfStudenyDropdown2;
	
	//Student#1 After-School details and Search-------------------
	@FindBy (id = "studentgrd1")
	@CacheLookup
	WebElement txtClickGrade2;
	
	@FindBy (id = "schooldistrict_1")
	@CacheLookup
	WebElement txtClickDistrict2;
	
	@FindBy (id = "schoolattend_1")
	@CacheLookup
	WebElement txtClickSchool2;
	
	@FindBy (id = "afterschoolcenter_1")
	@CacheLookup
	WebElement txtClickCenter2;
	
	@FindBy (xpath = "//*[@ class = 'btn btn-info']")
	@CacheLookup
	WebElement clickClickSearch2;
	
	//Father/Guardian's Details================
	@FindBy (id = "father")
	@CacheLookup
	WebElement txtFatherName;
	
	@FindBy (id = "fatherwork")
	@CacheLookup
	WebElement txtFatherWorkPhone;
	
	@FindBy (id = "fathercell")
	@CacheLookup
	WebElement txtCellPhone;
	
	@FindBy (id = "fatheremail")
	@CacheLookup
	WebElement txtFatherEmail;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtFartherNextButton;
	
	//Mother/Guardian's Details ==================
	@FindBy (name = "parent[mother]")
	@CacheLookup
	WebElement txtMotherName;
	
	@FindBy (name = "parent[motherwork]")
	@CacheLookup
	WebElement txtMotherWorkPhone;
	
	@FindBy (name = "parent[mothercell]")
	@CacheLookup
	WebElement txtMotherCellPhone;
	
	@FindBy (name = "parent[motheremail]")
	@CacheLookup
	WebElement txtMotherEmail;
	
	//Previous============================================
	@FindBy (id = "previous")
	@CacheLookup
	WebElement clickPreviousButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickParentNextButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtMotherNextButton;
	
	//Emergency Contact's Details=========================
	@FindBy (name = "parent[emergency]")
	@CacheLookup
	WebElement txtEmergencyContact1;
	
	
	@FindBy (name = "parent[emergencycell]")
	@CacheLookup
	WebElement txtParentEmergencyCell;
	
	@FindBy (name = "parent[emergencyaddress]")
	@CacheLookup
	WebElement txtParentEmergencyAddress;
	
	@FindBy (name = "parent[emergency1]")
	@CacheLookup
	WebElement txtEmergencyContact2;
	
	@FindBy (name = "parent[emergencycell1]")
	@CacheLookup
	WebElement txtParentEmergencyCell2;
	
	@FindBy (name = "parent[emergencyaddress1]")
	@CacheLookup
	WebElement txtParentEmergencyAddress2;
	
	//Previous Button=======================
	@FindBy (id = "previous")
	@CacheLookup
	WebElement txtEmergencyPreviousButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtMotherPreviousNextButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickEmergencyNextButton;
	
	//Registration filled======================
	@FindBy (name = "parent[registrant]")
	@CacheLookup
	WebElement txtRegistrationFiled;
	
	@FindBy (name = "parent[email]")
	@CacheLookup
	WebElement txtRegistrantEmail;
	
	//Previous Button=======================
	@FindBy (id = "previous")
	@CacheLookup
	WebElement clickRegistrantsPreviousButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickEmergencyContactNextButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickNextRegistrant;
	
	// Program Details Page=====================
	@FindBy (id = "previous")
	@CacheLookup
	WebElement clickPreviousProgramButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickPreviousNextRegistrant;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickNextRegistrant2;
	
	//Student details for Registration==================
	@FindBy (name = "student[0][firstname]")
	@CacheLookup
	WebElement txtFirstname;
	
	@FindBy (id = "lastname0")
	@CacheLookup
	WebElement txtLastname;
	
	@FindBy (id = "gender0")
	@CacheLookup
	WebElement txtGender;
	
	@FindBy (id = "address0")
	@CacheLookup
	WebElement txtAddress1;
	
	@FindBy (id = "city0")
	@CacheLookup
	WebElement txtCity_Name;
	
	@FindBy (className = "ui-menu-item")
	@CacheLookup
	WebElement txtCityName1;
	
	@FindBy (id = "zip0")
	@CacheLookup
	WebElement txtZip_Code;
	
	@FindBy (id = "phone0")
	@CacheLookup
	WebElement txtPhone;
	
	//Date of birth of the student===========
	@FindBy (id = "birth0")
	@CacheLookup
	WebElement txtDateOfBirth;
	
	@FindBy (className = "ui-datepicker-month")
	@CacheLookup
	WebElement txtCalenderMonthOfBirth;
	
	@FindBy (className = "ui-datepicker-year")
	@CacheLookup
	WebElement txtCalenderYearOfBirth;
	
	@FindBy (className = "ui-state-default")
	@CacheLookup
	WebElement clickCalenderDateOfBirth;
	
	//Previous Button------------
	@FindBy (id = "previous")
	@CacheLookup
	WebElement clickStudentPreviousButton; 
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement ClickProgramNextButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement ClickStudentNextButton;
	
	//Dental Doctor Information===================
	@FindBy (id = "dental_doctor_name0")
	@CacheLookup
	WebElement txtDentalDoctorName;
	
	@FindBy (id = "medical_doctor_name0")
	@CacheLookup
	WebElement txtMedicalDoctorName;
	
	//Handle date picker of the Dental Check Up=====
	@FindBy (id = "dental0")
	@CacheLookup
	WebElement txtLastDentalCheckupDate; 
	
	@FindBy (className = "ui-datepicker-month")
	@CacheLookup
	WebElement txtLastDentalMonth; 
	
	@FindBy (className = "ui-datepicker-year")
	@CacheLookup
	WebElement txtLastDentalYear; 
	
	@FindBy (className = "ui-state-default")
	@CacheLookup
	WebElement txtMonthDentalDate; 
	
	// Handle date picker of the Medical Check up.
	@FindBy (id = "medical0")
	@CacheLookup
	WebElement clcikLastPhysicalCheckupDate;
	
	@FindBy (className = "ui-datepicker-month")
	@CacheLookup
	WebElement txtMedicalMonth;
	
	@FindBy (className = "ui-datepicker-year")
	@CacheLookup
	WebElement txtMedicalYear;
	
	@FindBy (className = "ui-state-default")
	@CacheLookup
	WebElement txtMedicalDate;
	
	//Does your child have any allergies, medical, and/or physical issues?
	@FindBy (id = "have_issue0")
	@CacheLookup
	WebElement txtPhysicalIssueName;
	
	//Previous Button Allergies===================
	@FindBy (id = "previous")
	@CacheLookup
	WebElement click_PreviousButton;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement clickStudentFormNextButton;
	
	@FindBy (id = "submit_button")
	@CacheLookup
	WebElement clickProceedToPreview;
	
	@FindBy (xpath = "//*[@ class = 'btn btn-info']")
	@CacheLookup
	WebElement clickEditCheckoutButton;
	
	@FindBy (xpath = "//*[@ class = 'col-lg-4 col-md-3 col-sm-5 col-xs-5 margin20']/img")
	@CacheLookup
	WebElement clickStudProceedToPreview;
	
	//Tuition Summary Details====================
	@FindBy (name = "agree")
	@CacheLookup
	WebElement checkBoxTermsConditions3;
	
	//Checkout Process------------
	@FindBy (id = "proceed_to_payment")
	@CacheLookup
	WebElement clickCheckoutButton1;
	
	//Payment Page Using PromoCode 333 Payment Method================
	@FindBy (id = "check")
	@CacheLookup
	WebElement clickHavePromoCode2;
	
	@FindBy (id = "promocode")
	@CacheLookup
	WebElement txtHavePromoCode2;
	
	@FindBy (id = "apply_promocode")
	@CacheLookup
	WebElement txtClickAppy2;
	
	@FindBy (id = "paypal_submit")
	@CacheLookup
	WebElement clickSubmitPayment2;
	
	//Payment Credit Card Details=======================
	@FindBy (id = "customer_first_name")
	@CacheLookup
	WebElement txtCardHolderName2;
	
	@FindBy (name = "customer_address1")
	@CacheLookup
	WebElement txtStreetAddress2;

	@FindBy (name = "customer_city")
	@CacheLookup
	WebElement txtCityName2;
	
	@FindBy (id = "customer_zip")
	@CacheLookup
	WebElement txtZipCode2;
	
	@FindBy (id = "phonenumber")
	@CacheLookup
	WebElement txtPhoneNumber2;
	
	@FindBy (name = "customer_credit_card_number")
	@CacheLookup
	WebElement txtCreaditCardNumber2;
	
	@FindBy (name = "cc_expiration_month")
	@CacheLookup
	WebElement txtExpirationMonth2;
	
	@FindBy (name = "cc_expiration_year")
	@CacheLookup
	WebElement txtExpirationYear2;
	
	@FindBy (name = "cc_cvv2_number")
	@CacheLookup
	WebElement txtCardSecurityNumber2;
	
	@FindBy (id = "paypal_submit")
	@CacheLookup
	WebElement clickPaymentSubmit2;
	
	//Digial Signature========================
	@FindBy (how = How.CLASS_NAME, using = "signature-pad")
	@CacheLookup
	WebElement txtSignature_Pad;
	
	
	
	//Action Methods Student Registration=============
	public void clickSessionDropDown()
	{
		txtClickSessionDropdown2.click();
	}
	
	//Academic Session and Search===================
	public void selectSessionName()
	{
		Select drop_search1 = new Select(txtClickSessionDropdown2);
		drop_search1.selectByIndex(2);
	}
	
	public void clickStateDropDown()
	{
		txtClickStateDropdown2.click();
	}
	
	public void selectStateNameDropdown()
	{
		Select drop_state3 = new Select(txtClickStateDropdown2);
		drop_state3.selectByVisibleText("Virginia");
	}
	
	public void clickNumberOfStudent()
	{
		txtClickNumberOfStudenyDropdown2.click();
	}
	
	public void selectNumberOfStudent()
	{
		Select drop_numberofstudent3 = new Select(txtClickNumberOfStudenyDropdown2);
		drop_numberofstudent3.selectByVisibleText("One");
	}
	
	//Student#1 After-School details and Search=================
	public void clickGrade()
	{
		txtClickGrade2.click();
	}
	
	public void selectGrade()
	{
		Select drop_Grade3 = new Select(txtClickGrade2);
		drop_Grade3.selectByVisibleText("KG");
	}
	
	public void clickDistrict()
	{
		txtClickDistrict2.click();
	}
	
	public void selectDistrictName()
	{
		Select drop_district3 = new Select(txtClickDistrict2);
		drop_district3.selectByVisibleText("Loudoun County Public Schools");
	}
	
	public void clickSchool()
	{
		txtClickSchool2.click();
	}
	
	public void selectSchoolName()
	{
		Select drop_school3 = new Select(txtClickSchool2);
		drop_school3.selectByVisibleText("Liberty");
	}
	
	public void clickSearchButton()
	{
		clickClickSearch2.click();
	}
	
	//Father/Guardian's Details=======================
	public void setFatherName(String fatherName)
	{
		txtFatherName.sendKeys(fatherName);
	}
	
	public void setFatherWorkPhone(String fatherphone)
	{
		txtFatherWorkPhone.sendKeys(fatherphone);
	}
	
	public void setFatherCell(String fatherCell)
	{
		txtCellPhone.sendKeys(fatherCell);
	}
	
	public void setFatherEmail(String fatherEmail)
	{
		txtFatherEmail.sendKeys(fatherEmail);
	}
	
	public void clickFatherNextButton()
	{
		txtFartherNextButton.click();
	}
	
	//Mother/Guardian's Details ==================
	public void setMotherName(String motherName)
	{
		txtMotherName.sendKeys(motherName);
	}
	
	public void setMotherWorkPhone(String motherPhone)
	{
		txtMotherWorkPhone.sendKeys(motherPhone);
	}
	
	public void setMotherCellPhone(String motherCell)
	{
		txtMotherCellPhone.sendKeys(motherCell);
	}
	
	public void setMotherEmail(String motherEmail)
	{
		txtMotherEmail.sendKeys(motherEmail);
	}
	
	//Previous Button=======================
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
	
	//Emergency Contact's Details===================
	public void setEmergencyContact(String emergency)
	{
		txtEmergencyContact1.sendKeys(emergency);
	}
	
	public void setParentEmergencyCell(String parentCell)
	{
		txtParentEmergencyCell.sendKeys(parentCell);
	}
	
	public void setParentEmergencyAddress(String emergencyAddress)
	{
		txtParentEmergencyAddress.sendKeys(emergencyAddress);
	}
	
	public void setEmergencyCont(String emergencyContact)
	{
		txtEmergencyContact2.sendKeys(emergencyContact);
	}
	
	public void setEmergencyCell(String emergencyCell)
	{
		txtParentEmergencyCell2.sendKeys(emergencyCell);
	}

	public void setEmergencyAddress(String parentEmergencyAddress)
	{
		txtParentEmergencyAddress2.sendKeys(parentEmergencyAddress);
	}

	//Previous Button==============================
	public void clickEmergencyPreviousButton()
	{
		txtEmergencyPreviousButton.click();
	}
	
	public void clickMotherPreviousNextButton()
	{
		txtMotherPreviousNextButton.click();
	}
	
	public void clickEmergencyNextButton()
	{
		clickEmergencyNextButton.click();
	}
	
	//Registration filled======================
	public void registrantFiled(String registrationfield)
	{
		txtRegistrationFiled.sendKeys(registrationfield);
	}
	
	public void registrantEmail(String registerEmail)
	{
		txtRegistrantEmail.sendKeys(registerEmail);
	}
	
	
	//Previous Button=======================
	public void clickRegistrantsPreviousButton()
	{
		clickRegistrantsPreviousButton.click();
	}
	
	public void clickEmergencyContactNextButton()
	{
		clickEmergencyContactNextButton.click();
	}
	
	public void clickNextRegistrant()
	{
		clickNextRegistrant.click();
	}
	
	// Program Details Page====================
	public void clickPreviousProgramButton()
	{
		clickPreviousProgramButton.click();
	}
	
	public void clickPreviousNextRegistrant()
	{
		clickPreviousNextRegistrant.click();
	}
	
	public void clickNextRegistrantButton()
	{
		clickNextRegistrant2.click();
	}
	
	//Student details==================
	public void setFirstname(String firstName)
	{
		txtFirstname.sendKeys(firstName);
	}
	
	public void setLastname(String lastName)
	{
		txtLastname.sendKeys(lastName);
	}
	
	public void clickGender()
	{
		txtGender.click();
	}
	
	public void selectGender()
	{
		Select drop_studentgender2 = new Select(txtGender);
		drop_studentgender2.selectByVisibleText("Male");
	}
	
	public void setAddressstudent(String studentAddress)
	{
		txtAddress1.sendKeys(studentAddress);
	}
	
	public void selectStudentcity(String Afton)
	{
		txtCity_Name.sendKeys(Afton);

        selectOptionWithText4(Afton);
	}
	
	private void selectOptionWithText4(String afton) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void clickCityName2()
	{
		txtCityName1.click();
	}
	
	public void setZip_code(String zipCode)
	{
		txtZip_Code.sendKeys(zipCode);
	}
	
	public void setPhone(String phone)
	{
		txtPhone.sendKeys(phone);
	}
	
	
	//Date of birth of the student===========
	public void clickDateOfBirth()
	{
		txtDateOfBirth.click();
	}
	
	public void selectMonthBirth()
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
		
	//Previous Button========================= 
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
	
	public void setZip_Code(String zip_Code)
	{
		txtZipCode2.sendKeys(zip_Code);
	}
	
	public void setPhoneNumber(String phone_number)
	{
		txtPhoneNumber2.sendKeys(phone_number);
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
	
	public void clickPaymentSubmit()
	{
		clickPaymentSubmit2.click();
	}
	
	//Digital Signature===================================
	public void digital_Signature()
	{
		Actions builder = new Actions(ldriver);
	    WebElement element = null;
		Action drawAction = builder.moveToElement(element,20,30) //start points x axis and y axis. 
	              .click()
	              .moveByOffset(40, 60) // 2nd points (x1,y1)
	              .click()
	              .moveByOffset(20, 30)// 3rd points (x2,y2)
	              .doubleClick()
	              .build();
	    drawAction.perform();
	}

}

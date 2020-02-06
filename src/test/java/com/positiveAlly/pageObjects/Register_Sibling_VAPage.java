package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_Sibling_VAPage 
{
	WebDriver ldriver;
	public Register_Sibling_VAPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Academic Session and Search---------------------------
	@FindBy (linkText = "Register Sibling")
	@CacheLookup
	WebElement txtClickRegisterSibling;
	
	@FindBy (name = "session")
	@CacheLookup
	WebElement txtClickSessionDropdown;
	
	@FindBy (name = "state")
	@CacheLookup
	WebElement txtClickStateDropdown;
	
	@FindBy (name = "select_student_nos")
	@CacheLookup
	WebElement txtClickNumberOfStudenyDropdown;
	
	//Student#1 After-School details and Search-------------------
	@FindBy (id = "studentgrd1")
	@CacheLookup
	WebElement txtClickGrade;
	
	@FindBy (id = "schooldistrict_1")
	@CacheLookup
	WebElement txtClickDistrict;
	
	@FindBy (id = "schoolattend_1")
	@CacheLookup
	WebElement txtClickSchool;
	
	@FindBy (id = "afterschoolcenter_1")
	@CacheLookup
	WebElement txtClickCenter;
	
	@FindBy (xpath = "//*[@ class = 'btn btn-info']")
	@CacheLookup
	WebElement txtClickSearch;
	
	//Parent details next button-----------
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtClickNext1;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtClickNext2;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtClickNext3;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtClickNext4;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtClickNext5;
	
//Student details==================
	@FindBy (name = "student[0][firstname]")
	@CacheLookup
	WebElement txtStudentFirstname;
	
	@FindBy (id = "lastname0")
	@CacheLookup
	WebElement txtStudentLastname;
	
	@FindBy (id = "gender0")
	@CacheLookup
	WebElement txtStudentGender;
	
	@FindBy (id = "address0")
	@CacheLookup
	WebElement txtStudentAddress1;
	
	@FindBy (id = "city0")
	@CacheLookup
	WebElement txtStudentCity;
	
	@FindBy (className = "ui-menu-item")
	@CacheLookup
	WebElement txtStudentcity;
	
	@FindBy (id = "zip0")
	@CacheLookup
	WebElement txtStudentZipCode;
	
	@FindBy (id = "phone0")
	@CacheLookup
	WebElement txtStudentPhone;
	
	//Date of birth of the student===========
	@FindBy (id = "birth0")
	@CacheLookup
	WebElement txtStudentDateOfBirth;
	
	@FindBy (className = "ui-datepicker-month")
	@CacheLookup
	WebElement txtMonthOfBirth;
	
	@FindBy (className = "ui-datepicker-year")
	@CacheLookup
	WebElement txtYearOfBirth;
	
	
	@FindBy (className = "ui-state-default")
	@CacheLookup
	WebElement txtDateOfBirth;
	
	//Previous Button------------
	@FindBy (id = "previous")
	@CacheLookup
	WebElement txtpreviousButton; 
	
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtClickNext6;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtClickNext7;
	
	// Dental Doctor Information-----------
	@FindBy (id = "dental_doctor_name0")
	@CacheLookup
	WebElement txtDental_doctorName;
	
	@FindBy (id = "medical_doctor_name0")
	@CacheLookup
	WebElement txtMedical_doctorName;
	
	// Handle date picker of the Dental Check up.
	@FindBy (id = "dental0")
	@CacheLookup
	WebElement txtLastDental_CheckupDate; 
	
	@FindBy (className = "ui-datepicker-month")
	@CacheLookup
	WebElement txtLastDental_Month; 
	
	@FindBy (className = "ui-datepicker-year")
	@CacheLookup
	WebElement txtLastDental_Year; 
	
	@FindBy (className = "ui-state-default")
	@CacheLookup
	WebElement txtMonthDental_Date; 
	
	// Handle date picker of the Medical Check up.
	@FindBy (id = "medical0")
	@CacheLookup
	WebElement txtLastPhysical_CheckupDate;
	
	@FindBy (className = "ui-datepicker-month")
	@CacheLookup
	WebElement txtMedical_Month;
	
	@FindBy (className = "ui-datepicker-year")
	@CacheLookup
	WebElement txtMedical_Year;
	
	@FindBy (className = "ui-state-default")
	@CacheLookup
	WebElement txtMedical_Date;
	
	@FindBy (id = "have_issue0")
	@CacheLookup
	WebElement txtPhysicalIssue;
	
	//Click on Previous button======================
	@FindBy (id = "previous")
	@CacheLookup
	WebElement txtEditToPreview;
	
	@FindBy (id = "next")
	@CacheLookup
	WebElement txtNextToPreview;
			
	@FindBy (id = "submit_button")
	@CacheLookup
	WebElement txtEditProceedToPreview;
	
	//I agree to the Positive Ally Terms and Conditions
	@FindBy (id = "agree")
	@CacheLookup
	WebElement checkBoxTermsConditions;
	
	//Checkout Process------------
	@FindBy (id = "proceed_to_payment")
	@CacheLookup
	WebElement clickCheckoutButton;
	
	//Payment Credit Card Details=======================
	@FindBy (id = "customer_first_name")
	@CacheLookup
	WebElement txtCardHolderName;
	
	@FindBy (name = "customer_address1")
	@CacheLookup
	WebElement txtStreetAddress;

	@FindBy (name = "customer_city")
	@CacheLookup
	WebElement txtCityName;
	
	@FindBy (id = "customer_zip")
	@CacheLookup
	WebElement txtZipCode;
	
	@FindBy (id = "phonenumber")
	@CacheLookup
	WebElement txtPhoneNumber;
	
	@FindBy (name = "customer_credit_card_number")
	@CacheLookup
	WebElement txtCreaditCardNumber;
	
	@FindBy (name = "cc_expiration_month")
	@CacheLookup
	WebElement txtExpirationMonth;
	
	@FindBy (name = "cc_expiration_year")
	@CacheLookup
	WebElement txtExpirationYear;
	
	@FindBy (name = "cc_cvv2_number")
	@CacheLookup
	WebElement txtCardSecurityNumber;
	
	@FindBy (id = "paypal_submit")
	@CacheLookup
	WebElement txtPaymentSubmit;
	
	
	//Payment Page Using PromoCode 333 Payment Method================
	@FindBy (id = "check")
	@CacheLookup
	WebElement clickHavePromoCode;
	
	@FindBy (id = "promocode")
	@CacheLookup
	WebElement txtHavePromoCode;
	
	@FindBy (id = "apply_promocode")
	@CacheLookup
	WebElement txtClickAppy;
	
	@FindBy (id = "paypal_submit")
	@CacheLookup
	WebElement clickSubmitPayment;
	
	
	//Wait List page and registration for the student.
	@FindBy (xpath ="//*[@ class = 'btn btn-warning'")
	@CacheLookup
	WebElement txtClickRegisterWaiting;
	
	@FindBy (name ="firstname")
	@CacheLookup
	WebElement txtName;
	
	
   //Action methods Sibling Registration==================
	public void setClickRegisterSibling()
	{
		txtClickRegisterSibling.click();
	}
	
	public void setClickSession()
	{
		txtClickSessionDropdown.click();
	}
	
	public void select_Session()
	{
		Select drop_search = new Select(txtClickSessionDropdown);
		drop_search.selectByIndex(1);
	}
	
	public void setClickState()
	{
		txtClickStateDropdown.click();
	}
	
	public void select_StateName()
	{
		Select drop_state = new Select(txtClickStateDropdown);
		drop_state.selectByVisibleText("Virginia");
	}
	
	public void setClickNumberOfStudent()
	{
		txtClickNumberOfStudenyDropdown.click();
	}
	
	public void select_NumberOfStudent()
	{
		Select drop_numberofstudent = new Select(txtClickNumberOfStudenyDropdown);
		drop_numberofstudent.selectByVisibleText("One");
	}
	
	public void setClickGrade()
	{
		txtClickGrade.click();
	}
	
	public void selectSelectGrade()
	{
		Select drop_Grade = new Select(txtClickGrade);
		drop_Grade.selectByVisibleText("KG");
	}
	
	public void setClickDistrict()
	{
		txtClickDistrict.click();
	}
	
	public void selectDistrict()
	{
		Select drop_district = new Select(txtClickDistrict);
		drop_district.selectByVisibleText("Loudoun County Public Schools");
	}
	
	public void setClickSchool()
	{
		txtClickSchool.click();
	}
	
	public void selectSchool()
	{
		Select drop_school = new Select(txtClickSchool);
		drop_school.selectByVisibleText("Liberty");
	}
	
	public void setClickSearch()
	{
		txtClickSearch.click();
	}
	
	//Father/Guardian's Details================
	public void clickNext1()
	{
		txtClickNext1.click();
	}
	
	public void clickNext2()
	{
		txtClickNext2.click();
	}
	
	public void clickNext3()
	{
		txtClickNext3.click();
	}
	
	public void clickNext4()
	{
		txtClickNext4.click();
	}
	
	public void clickNext5()
	{
		txtClickNext5.click();
	}
	
	// Student details action methods
	public void setStudentfirstName(String firstname)
	{
		txtStudentFirstname.sendKeys(firstname);
	}
	
	public void setStudentlastName(String lastname)
	{
		txtStudentLastname.sendKeys(lastname);
	}
	
	public void clickStudentGender()
	{
		txtStudentGender.click();
	}
	
	public void selectStudentGender()
	{
		Select drop_studentgender = new Select(txtStudentGender);
		drop_studentgender.selectByVisibleText("Male");
	}
	
	public void setStudentaddress(String address1)
	{
		txtStudentAddress1.sendKeys(address1);
	}
	
	//Student address already fill up.
	/*public void clickStudentstate()
	{
		txtStudentState.click();
	}
	
	public void selectStudentstate()
	{
		Select drop_studentstate = new Select(txtStudentState);
		drop_studentstate.selectByVisibleText("Virginia");
	}*/
	
	public void selectStudentcity(String Afton)
	{
		txtStudentCity.sendKeys(Afton);

        selectOptionWithText1(Afton);
	}
	
	private void selectOptionWithText1(String afton) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void clickStudentcity1()
	{
		txtStudentcity.click();
	}

	public void setStudentzip(String zipcode)
	{
		txtStudentZipCode.sendKeys(zipcode);
	}
	
	public void setStudenthomephone(String homephone)
	{
		txtStudentPhone.sendKeys(homephone);
	}
	
	public void clickStudentDateOfBirth()
	{
		txtStudentDateOfBirth.click();
	}
	
	public void selectMonthofBirth()
	{
		
		Select drop_selectMonth = new Select(txtMonthOfBirth);
		drop_selectMonth.selectByVisibleText("Jan");
	}
	
	public void selectYearOfBirth()
	{
		Select drop_selectYear = new Select(txtYearOfBirth);
		drop_selectYear.selectByVisibleText("2011");
	}
	
	public void clickDateOfMonth()
	{
		txtDateOfBirth.click();
	}
	
	// Click on Previous Button of the Student Details.
	public void clickPreviousButton()
	{
		txtpreviousButton.click();
	}
	
	public void clickStudentpreviousDetails()
	{
		txtClickNext7.click();
	}
	
	public void clickStudentDetails()
	{
		txtClickNext6.click();
	}
	
	// Dental And Medical Doctor details Form..........
	public void setDentalDoctorName(String dentalDoctor)
	{
		txtDental_doctorName.sendKeys(dentalDoctor);
	}
	
	public void setMedicalDoctorName(String medicalDoctor)
	{
		txtMedical_doctorName.sendKeys(medicalDoctor);
	}
	
	
	// Handle Physical medical datePicker=====================
	public void clickLastDentalCheckupDate()
	{
		txtLastDental_CheckupDate.click();
	}
	
	public void setDentalMonth()
	{
		Select drop_DentalMonth = new Select(txtLastDental_Month);
		drop_DentalMonth.selectByVisibleText("Jan");
	}
	
	public void setDentalYear()
	{
		Select drop_DentalYear = new Select(txtLastDental_Year);
		drop_DentalYear.selectByVisibleText("2018");
	}
	
	public void clickDentalDate()
	{
		txtMonthDental_Date.click();
	}
	
	// Handle Physical medical date picker-----
	
	public void clickLastPhysical_CheckupDate()
	{
		txtLastPhysical_CheckupDate.click();
	}
	
	public void setMedicalMonth()
	{
		Select drop_MedicalMonth = new Select(txtMedical_Month);
		drop_MedicalMonth.selectByVisibleText("Jan");
	}
	
	public void setMedicalYear() 
	{
		Select drop_MedicalYear = new Select(txtMedical_Year);
		drop_MedicalYear.selectByVisibleText("2018");
	}
	
	public void clickMedicalDate()
	{
		txtMedical_Date.click();
	}
	
	public void clickAllergiesChild()
	{
		Select drop_AllergiesChild = new Select(txtPhysicalIssue);
		drop_AllergiesChild.selectByVisibleText("No");
	}
	
	//Click on Edit button preview medical-------------
	public void clickEditButtonPreview()
	{
		txtEditToPreview.click();
	}
	
	public void clickNextPreview()
	{
		txtNextToPreview.click();
	}
	
	public void clickProceedToPreview()
	{
		txtEditProceedToPreview.click();
	}
	
	//Click on Edit button-------------
	public void clickEditCheckout()
	{
		txtEditToPreview.click();
	}
	
	public void proceedToPreviewButton()
	{
		txtEditProceedToPreview.click();
	}
	
	// I agree to the Positive Ally Terms and Conditions
	public void checkBoxTermsConditions()
	{
		checkBoxTermsConditions.click();
	}
	
	public void clickCheckoutButton()
	{
		clickCheckoutButton.click();
	}
	
	//Payment Credit Card Details=======================
	public void setCardHorderName(String cardholder)
	{
		txtCardHolderName.sendKeys(cardholder);
	}
		
	public void setStreetAddress(String streetAddress)
	{
		txtStreetAddress.sendKeys(streetAddress);
	}
		
	public void setCityNamePayment(String citynamePaymnet)
	{
		txtCityName.sendKeys(citynamePaymnet);
	}
		
	public void setZipCodePayment(String zipcodepayment)
	{
		txtZipCode.sendKeys(zipcodepayment);
	}
		
	public void setPhoneNumberPayment(String phonenumberpayment)
	{
		txtPhoneNumber.sendKeys(phonenumberpayment);
	}
		
	public void setCreditCardNumber(String creditcardnumber)
	{
		txtCreaditCardNumber.sendKeys(creditcardnumber);
	}
		
	public void setExpirationMonthCard()
	{
		Select drop_ExpirationMonth = new Select(txtExpirationMonth);
		drop_ExpirationMonth.selectByVisibleText("02");
	}
		
	public void setExpirationYearCard()
	{
		Select drop_ExpirationYear = new Select(txtExpirationYear);
		drop_ExpirationYear.selectByVisibleText("2020");
	}
		
	public void setCcvNumberCard(String ccv)
	{
		txtCardSecurityNumber.sendKeys(ccv);
	}
		
	public void clickSubmitPaypalButton()
	{
		txtPaymentSubmit.click();
	}	
		
	/*// PromoCode Payment Page ================
	public void clickHavePromoCode()
	{
		clickHavePromoCode.click();
	}
		
	public void setPromoCode(String promocode)
	{
		txtHavePromoCode.sendKeys(promocode);
			
	}
		
	public void clickApplyButton()
	{
		txtClickAppy.click();
	}
		
	public void clickSubmitPayment()
	{
		clickSubmitPayment.click();
	}*/
		
	
		
	
	// Wait List registration new student------------
	public void clickRegisterWaiting()
	{
		txtClickRegisterWaiting.click();
	}
	
	public void setName(String name)
	{
		txtName.sendKeys(name);
	}

}

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

public class Registration_StudentWA_After_SummerPage 
{
	WebDriver ldriver;
	public Registration_StudentWA_After_SummerPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Academic Session and Search Registration for afterschool and summer for June 2018 to June 2019===================
	@FindBy (how = How.ID, using = "session")
	@CacheLookup
	WebElement click_Academic_Session;
	
	@FindBy (how = How.ID, using = "search_state")
	@CacheLookup
	WebElement txtClickStateDropdown2;
	
	@FindBy (how = How.ID, using ="select_student_nos")
	@CacheLookup
	WebElement txtClickNumberOfStudenyDropdown2;
	
	//Student#1 After-School & summer details and Search==================
	@FindBy (how = How.ID, using = "prg_2_1") 
	@CacheLookup
	WebElement check_afterSchool;
	
	@FindBy (how = How.ID, using = "prg_3_1")
	@CacheLookup
	WebElement check_summer;
	
	@FindBy (how = How.ID, using = "studentgrd1")
	@CacheLookup
	WebElement select_Student_grade;
	
	@FindBy (how = How.ID, using = "schooldistrict_1")
	@CacheLookup
	WebElement select_school_ditrict;
	
	@FindBy (how = How.ID, using = "schoolattend_1")
	@CacheLookup
	WebElement select_School;
	
	@FindBy (xpath = "//*[@ class = 'btn btn-info']")
	@CacheLookup
	WebElement Search_Button;
	
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
	
	@FindBy (how = How.ID, using = "emergencywork")
	@CacheLookup
	WebElement txtwork_Phone;
	
	@FindBy (how = How.ID, using = "emergencycell")
	@CacheLookup
	WebElement txtCell_Phone;
	
	@FindBy (how = How.ID, using = "emergencyemail")
	@CacheLookup
	WebElement txtemergenc_Email;
	
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
	
	//Program details page and select weeks for the summer program=============
	//Week 1- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//*[@class = 'labelauty-unchecked'][1]")
	@CacheLookup
	WebElement click_Enrichment1;
	
	@FindBy (className = "labelauty-unchecked[1]")
	@CacheLookup
	WebElement click_AMSpecialty1;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath ="//*[@class = 'labelauty-unchecked'][2]")
	@CacheLookup
	WebElement click_Fieldtrip1;
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement2;
	
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty2;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip2;
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement3;
	
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty3;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip3;
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement4;
	
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty4;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip4;
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement5;
	
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty5;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip5;
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement6;
	
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty6;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip6;
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement7;
	
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty7;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip7;
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.===================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement8;
	
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty8;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip8;
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.===================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement9;
	
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_AMSpecialty9;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip9;

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
	
	@FindBy (how=How.XPATH, using = "//*[@id = 'zip0']")
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
	
	
	
	//Action Methods Student Registration After School & Summer==================
	
	
	//Academic Session and Search Registration for afterschool and summer for June 2018 to June 2019===================
	public void click_Academic_Session()
	{
		click_Academic_Session.click();
	}
	
	public void selectSession()
	{
		Select drop_session = new Select(click_Academic_Session);
		drop_session.selectByVisibleText("June 2019 to June 2020");
	}
	
	public void clickStateDropdown2()
	{
		txtClickStateDropdown2.click();
	}
	
	public void select_State()
	{
		Select drop_state = new Select(txtClickStateDropdown2);
		drop_state.selectByVisibleText("Washington");
	}
	
	public void txtClickNumberOfStudenyDropdown2()
	{
		txtClickNumberOfStudenyDropdown2.click();
	}
	
	public void selectNumberOfStudent()
	{
		Select drop_number = new Select(txtClickNumberOfStudenyDropdown2);
		drop_number.selectByVisibleText("One");		
	}
	
	//Student#1 After-School & summer details and Search==================
	public void check_afterSchool()
	{
		check_afterSchool.click();
	}
	
	public void check_summer()
	{
		check_summer.click();
	}
	
	public void click_GradeStudent()
	{
		select_Student_grade.click();
	}
	
	public void select_studentGrade()
	{
		Select drop_studentGrade = new Select(select_Student_grade);
		drop_studentGrade.selectByVisibleText("KG");
	}
	
	public void click_school_ditrict()
	{
		select_school_ditrict.click();
	}
	
	public void select_schoolDistrict()
	{
		Select drop_school = new Select(select_school_ditrict);
		drop_school.selectByVisibleText("Lake Washington School District");
	}
	
	public void click_School()
	{
		select_School.click();
	}
	
	public void select_SchoolName()
	{
		Select drop_schoolName = new Select(select_School);
		drop_schoolName.selectByVisibleText("Rosa Parks");
	}
	
	public void click_Search()
	{
		Search_Button.click();	
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
	
	public void setCell_Phone(String cellphone)
	{
		txtCell_Phone.sendKeys(cellphone);
	}

	public void setemergency_Email(String emergency)
	{
		txtemergenc_Email.sendKeys(emergency);
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
	
	//Program details page and select weeks for the summer program=============
	//Week 1- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichment1()
	{
		List<WebElement> we = new ArrayList<WebElement>();
	    we = ldriver.findElements(By.className("labelauty-unchecked"));
	    
	    we.get(0).click(); // clicks on "first"
        we.get(1).click(); // clicks on "second"
        we.get(2).click(); // clicks on "third"
        we.get(3).click(); // clicks on "third"
        we.get(4).click(); // clicks on "third"
        we.get(5).click(); // clicks on "third"
        we.get(6).click(); // clicks on "third"
    
        //If we want to select every week then we need to use loop.
        /*for(WebElement check: we)
    {
        check.click(); // click all the 9 elements and comes out of loop
    }
      */
    }

	//P.M Camp 1:00-5:45
	public void click_Fieldtrip1()
	{
		click_Fieldtrip1.click();
	}
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement2()
	{
		click_Enrichement2.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip2()
	{
		click_Fieldetrip2.click();
	}
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement3()
	{
		click_Enrichement3.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip3()
	{
		click_Fieldetrip3.click();
	}
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement4()
	{
		click_Enrichement4.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip4()
	{
		click_Fieldetrip4.click();
	}
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement5()
	{
		click_Enrichement5.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip5()
	{
		click_Fieldetrip5.click();
	}
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement6()
	{
		click_Enrichement6.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip6()
	{
		click_Fieldetrip6.click();
	}
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement7()
	{
		click_Enrichement7.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip7()
	{
		click_Fieldetrip7.click();
	}
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.===================
	public void click_Enrichement8()
	{
		click_Enrichement8.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip8()
	{
		click_Fieldetrip8.click();
	}
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.===================
	public void click_Enrichement9()
	{
		click_Enrichement9.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip9()
	{
		click_Fieldetrip9.click();
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
	
	public void selectCity_Name(String Addy)
	{
		txtCity_Name.sendKeys(Addy);
		selectOptionWithText2(Addy);
	}
	
	private void selectOptionWithText2(String addy) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void click_CityName()
	{
		txtCityName1.click();
	}
	
	public void setZip_CodeStud(String zipcode)
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

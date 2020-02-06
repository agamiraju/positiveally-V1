package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration_Waitlist_VAPage 
{
	WebDriver ldriver;
	public Registration_Waitlist_VAPage  (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	/*//Click on sibling registration===============
	@FindBy (linkText = "Register Sibling")
	@CacheLookup
	WebElement Sibling_Registration;*/
	
	//Click on Register module===================
	@FindBy (linkText = "REGISTER")
	@CacheLookup
	WebElement home_Register;
	
	@FindBy (id = "session")
	@CacheLookup
	WebElement academic_Session;
	
	@FindBy (id = "search_state")
	@CacheLookup
	WebElement click_State;
	
	@FindBy (id = "select_student_nos")
	@CacheLookup
	WebElement number_Of_student;
	
	@FindBy (id = "studentgrd1")
	@CacheLookup
	WebElement choose_grade;
	
	@FindBy (id = "schooldistrict_1")
	@CacheLookup
	WebElement school_District;
	
	@FindBy (id = "schoolattend_1")
	@CacheLookup
	WebElement school_Name;
	
	@FindBy (xpath = "//*[@ class = 'btn btn-info']")
	@CacheLookup
	WebElement click_Search;
	
	//Clicked on waitlist button=======================
	@FindBy (xpath = "//*[@class = 'btn btn-warning']")
	@CacheLookup
	WebElement register_in_waitlist;
	
	//Student's Waitlist Details========================
	@FindBy (id = "firstname")
	@CacheLookup
	WebElement first_name;
	
	//Student date of birth===================
	@FindBy (id = "birth")
	@CacheLookup
	WebElement date_of_birth;
	
	@FindBy (className = "ui-datepicker-month")
	@CacheLookup
	WebElement txtCalenderMonthOfBirth;
	
	@FindBy (xpath = "//*[@class = 'ui-datepicker-year']")
	@CacheLookup
	WebElement txtCalenderYearOfBirth;
	
	@FindBy (className = "ui-state-default")
	@CacheLookup
	WebElement clickCalenderDateOfBirth;
	
	@FindBy (id = "parent")
	@CacheLookup
	WebElement parent_name;
	
	@FindBy (id = "fathercell")
	@CacheLookup
	WebElement cell_Phone;
	
	@FindBy (id = "fatheremail")
	@CacheLookup
	WebElement father_email;
	
	@FindBy (id = "submit")
	@CacheLookup
	WebElement click_Submit;
	
	// Action Methods wait list registration======================================
	
	//If parent logged and already register one student====
	/*public void Sibling_Registration()
	{
		Sibling_Registration.click();
	}*/
	
	//If parent is not logged=================
	public void home_Register()
	{
		home_Register.click();
	}
	
	public void academic_Session()
	{
		academic_Session.click();
	}
	
	public void select_sessionName()
	{
		Select drop_sessionname = new Select(academic_Session);
		drop_sessionname.selectByIndex(1);
	}
	
	public void click_State()
	{
		click_State.click();
	}
	
	public void select_StateName()
	{
		Select drop_statename = new Select(click_State);
		drop_statename.selectByVisibleText("Virginia");
	}
	
	public void clicknumberofStudent()
	{
		number_Of_student.click();
	}
	
	public void selectnumberofStudent()
	{
		Select drop_numberStudent = new Select(number_Of_student);
		drop_numberStudent.selectByVisibleText("One");
	}
	
	public void clickGrade()
	{
		choose_grade.click();
	}
	
	public void selectgradename()
	{
		Select drop_gradename = new Select(choose_grade);
		drop_gradename.selectByVisibleText("KG");
	}
	
	public void click_schooldist()
	{
		school_District.click();
	}
	
	public void selectSchoolDistrict()
	{
		Select drop_district = new Select(school_District);
		drop_district.selectByVisibleText("Loudoun County Public Schools");
	}
	
	public void click_school()
	{
		school_Name.click();
	}
	
	public void select_School_name()
	{
		Select drop_schoolname = new Select(school_Name);
		drop_schoolname.selectByVisibleText("Liberty");
	}
	
	public void click_search_Button()
	{
		click_Search.click();
	}
	
	// Clicked on register in waitlist button==========
	public void click_Registerwaitlist()
	{
		register_in_waitlist.click();
	}
	
	//Student's Waitlist Details========================
	public void studentfirstname(String firstname)
	{
		first_name.sendKeys(firstname);
	}
	
	//Date of birth of the student===========
	public void dateofbirth_student()
	{
		date_of_birth.click();
	}
	
	public void selectmonth()
	{
		Select drop_selectmonth = new Select(txtCalenderMonthOfBirth);
		drop_selectmonth.selectByVisibleText("Feb");
	}
	
	public void selectyear()
	{
		Select drop_selectyear = new Select(txtCalenderYearOfBirth);
		drop_selectyear.selectByVisibleText("2011");
	}
	
	public void clickdateof_birth()
	{
		clickCalenderDateOfBirth.click();
	}
	
	public void parentname(String parentname)
	{
		parent_name.sendKeys(parentname);
	}
	
	public void cell_Phone(String cellphone)
	{
		cell_Phone.sendKeys(cellphone);
	}
	
	public void father_email(String fatheremail)
	{
		father_email.sendKeys(fatheremail);
	}
	
	public void click_submitButton()
	{
		click_Submit.click();
	}
		
	
}

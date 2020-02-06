package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Account_WashingtonPage 
{
	WebDriver ldriver;
	public Create_Account_WashingtonPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Create New User Account for Washington State============ 
	@FindBy (how = How.LINK_TEXT, using = "Create New Account")
	@CacheLookup
	WebElement txtClick_CreateNewAccount;
	
	@FindBy(how = How.ID, using = "firstname")
	@CacheLookup
	WebElement txtUser_FirstName;

	@FindBy(how = How.ID, using = "middlename")
	@CacheLookup
	WebElement txtUser_MiddleName;
	
	@FindBy(how = How.ID, using = "lastname")
	@CacheLookup
	WebElement txtUser_LastName;
	
	@FindBy(how = How.ID, using = "street_address1")
	@CacheLookup
	WebElement txtUser_Street_Address1;
	
	@FindBy(how = How.ID, using = "street_address2")
	@CacheLookup
	WebElement txtUser_Street_Address2;
	
	@FindBy(how = How.ID, using = "state")
	@CacheLookup
	WebElement setUser_State;
	
	@FindBy(how = How.ID, using = "city")
	@CacheLookup
	WebElement txtUser_City;
	
	@FindBy (how = How.CLASS_NAME, using = "ui-menu-item")
	@CacheLookup
	WebElement txtCityName;
	
	@FindBy(how = How.ID, using = "zip")
	@CacheLookup
	WebElement txtUser_Zip;
	
	@FindBy (how = How.ID, using = "email_id")
	@CacheLookup
	WebElement txtUser_Email;
	
	@FindBy(how = How.ID, using = "password")
	@CacheLookup
	WebElement txtUser_Password;
	
	@FindBy (how = How.ID, using = "confirm_password")
	@CacheLookup
	WebElement txtUser_confirm_password;
	
	@FindBy (how = How.XPATH, using = "//*[@class = 'btn btn-warning first-tabs-button']")
	@CacheLookup
	WebElement txtUser_Singup;
	
	@FindBy (className = "back")
	@CacheLookup
	WebElement clickBackButton;
	
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
	
	//Action Methods ====================================
	public void click_Create_NewAccount()
	{
		txtClick_CreateNewAccount.click();
	}
	
	public void setUser_Firstname(String First_Name)
	{
		txtUser_FirstName.sendKeys(First_Name);
	}

	public void setUser_MiddleName(String middleName)
	{
		txtUser_MiddleName.sendKeys(middleName);
	}
	
	public void setUser_LastName(String LastName)
	{
		txtUser_LastName.sendKeys(LastName);
	}
	
	public void setUser_StreetAddress1(String StreetAddress1)
	{
		txtUser_Street_Address1.sendKeys(StreetAddress1);
	}
	
	public void setUser_StreetAddress2(String Street_Address2)
	{
		txtUser_Street_Address2.sendKeys(Street_Address2);
	}
	
	public void setUser_State()
	{
		Select drop_stateWA = new Select(setUser_State);
		drop_stateWA.selectByIndex(2);
	}
	
	public void selectUser_City(String Addy)
	{
		txtUser_City.sendKeys(Addy);

        selectOptionWithText(Addy);
	}
	
	private void selectOptionWithText(String addy) 
	{
		// TODO Auto-generated method stub
	}
	
	public void click_txtCityName()
	{
		txtCityName.click();
	}

	public void setUser_Zip(String Zip_code)
	{
		txtUser_Zip.sendKeys(Zip_code);
	}

	public void setUser_Email(String user_email)
	{
		txtUser_Email.sendKeys(user_email);
	}
	
	public void setUser_Password(String password)
	{
		txtUser_Password.sendKeys(password);
	}
	
	public void setUser_confirmPassword(String confirm_Password)
	{
		txtUser_confirm_password.sendKeys(confirm_Password);
	}
	
	public void setUser_Singup()
	{
		txtUser_Singup.click();	
		
	}
	public void clickBackButtonVerify()
	{
		clickBackButton.click();
	}
	
	//Login parent account================================
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

}

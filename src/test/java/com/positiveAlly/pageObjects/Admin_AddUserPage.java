package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_AddUserPage 
{
	WebDriver ldriver;
	public Admin_AddUserPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (linkText = "User")
	@CacheLookup
	WebElement txtUser;
	
	@FindBy (partialLinkText = "Add User Account")
	@CacheLookup
	WebElement txtAddUserAccount;
	
	// Create Account Parent from Admin side===========
	@FindBy (id = "Privileges")
	@CacheLookup
	WebElement selectPrivileges;
	
	@FindBy (id = "state")
	@CacheLookup
	WebElement selectStateUser;
	
	@FindBy (id = "city")
	@CacheLookup
	WebElement selectCityUser;
	
	@FindBy (id = "first_name")
	@CacheLookup
	WebElement txtFirstNameUser;
	
	@FindBy (id = "last_name")
	@CacheLookup
	WebElement txtLastNameUser;
	
	@FindBy (id = "useremail")
	@CacheLookup
	WebElement txtEmailUser;
	
	@FindBy (id = "street_address1")
	@CacheLookup
	WebElement txtStreet_Address1User;
	
	@FindBy (id = "street_address2")
	@CacheLookup
	WebElement txtStreet_Address2User;
	
	@FindBy (id = "zipcode")
	@CacheLookup
	WebElement txtZipCodeUser;
	
	@FindBy (id = "password")
	@CacheLookup
	WebElement txtPasswrdUser;
	
	@FindBy (xpath = "//button[@class='btn btn-primary']")
	@CacheLookup
	WebElement clickSave_ButtonUser;
	
	@FindBy (className = "btn_back")
	@CacheLookup
	WebElement clickBackButton;
	
	//Action Methods==================
	public void overMouseUser()
	{
		
		Actions builder = new Actions(ldriver);
		WebElement menuElement2 = txtUser;
		builder.moveToElement(menuElement2).build().perform();
		
	}
	
	public void addUserAccount()
	{
		txtAddUserAccount.click();
	}
	
	// Create Account Parent from Admin side===========
		public void selectPrivileges()
		{
			Select drop_UserPrivileges = new Select(selectPrivileges);
			drop_UserPrivileges.selectByVisibleText("Parent");
		}
		
		public void selectStateUser()
		{
			Select drop_UserState = new Select(selectStateUser);
			drop_UserState.selectByVisibleText("Virginia");
		}
		
		public void selectCityUser(String Afton)
		{
			selectCityUser.sendKeys(Afton);

	        selectOptionWithText1(Afton);
		}
		
		private void selectOptionWithText1(String afton) 
		{
			// TODO Auto-generated method stub
			
		}
		
		public void setFirstNameUser(String firstnameUser)
		{
			txtFirstNameUser.sendKeys(firstnameUser);
		}
		
		public void setLastNameUser(String lastnameUser)
		{
			txtLastNameUser.sendKeys(lastnameUser);
		}
		
		public void setEmailUser(String emailUser)
		{
			txtEmailUser.sendKeys(emailUser);
		}
		
		public void setStreetAddress1(String streetAddress1)
		{
			txtStreet_Address1User.sendKeys(streetAddress1);
		}
		
		public void setStreetAddress2(String streetAddress2)
		{
			txtStreet_Address2User.sendKeys(streetAddress2);
		}
		
		public void setZipCodeUser(String zipCodeUser)
		{
			txtZipCodeUser.sendKeys(zipCodeUser);
		}
		
		public void setPasswordUser(String userpassword)
		{
			txtPasswrdUser.sendKeys(userpassword);
		}
		
		public void clickSaveUser_Button()
		{
			clickSave_ButtonUser.click();
		}
		
		public void clickBackButtonVerify()
		{
			clickBackButton.click();
		}
	

}

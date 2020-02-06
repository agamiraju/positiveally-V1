package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Account_VirginiaPage 
{
	WebDriver ldriver;
	public Create_Account_VirginiaPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (linkText = "Create New Account")
	@CacheLookup
	WebElement txtClickNewAccount;
	
	
	@FindBy(how = How.NAME, using = "firstname")
	@CacheLookup
	WebElement txtCustomerName;

	
	@FindBy (name = "middlename")
	@CacheLookup
	WebElement txtMiddlename;
	
	@FindBy (name = "lastname")
	@CacheLookup
	WebElement txtLastname;
	
	@FindBy (name = "street_address1")
	@CacheLookup
	WebElement txtStreetAddress1;
	
	@FindBy (name = "street_address2")
	@CacheLookup
	WebElement txtStreetAddress2;
	
	@FindBy (name = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy (name = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy (className = "ui-menu-item")
	@CacheLookup
	WebElement txtCityName;
	
	@FindBy (name = "zip")
	@CacheLookup
	WebElement txtZip;
	
	@FindBy (name = "email_id")
	@CacheLookup
	WebElement txtEmailId;
	
	@FindBy (name = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy (name = "confirm_password")
	@CacheLookup
	WebElement txtconfirm_password;
	
	@FindBy (xpath = "//*[@class = 'btn btn-warning first-tabs-button']")
	@CacheLookup
	WebElement txtSignup;
	
	@FindBy (linkText = "Back")
	@CacheLookup
	WebElement txtbackverify;
	
	
	
	//Action Methods for the Create new Account
	public void setClickCreateAccount()
	{
		txtClickNewAccount.click();
	}
	
	public void custNamea(String cname) 
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void setMiddleName(String middlename)
	{
		txtMiddlename.sendKeys(middlename);
	}
	
	public void setLastName(String lastname)
	{
		txtLastname.sendKeys(lastname);
	}
	
	public void setStreetAddress1(String address1)
	{
		txtStreetAddress1.sendKeys(address1);
	}
	
	public void setStreetAddress2(String address2)
	{
		txtStreetAddress2.sendKeys(address2);
	}
	
	public void select_listState()
	{
		txtState.click();
	}
	
	public void select_state()
	{
		Select drop = new Select(txtState);
	    drop.selectByIndex(1); 
	}
	
	public void setCityName(String Afton)
	{
		txtCity.sendKeys(Afton);

        selectOptionWithText(Afton);
	}
	
	private void selectOptionWithText(String afton) 
	{
		// TODO Auto-generated method stub
	}

	public void clickCityName()
	{
		txtCityName.click();
	}
	
	public void setZip(String Zip)
	{
		txtZip.sendKeys(Zip);
	}
	
	public void setEmailId(String email)
	{
		txtEmailId.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setconfirm_password(String confirm_password)
	{
		txtconfirm_password.sendKeys(confirm_password);
	}
	
	public void clickSignup()
	{
		txtSignup.click();
	}
	
	public void existEmailid()
	{
		txtbackverify.click();
	}

}

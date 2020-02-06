package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy (name = "user_email_id")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy (name = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy (xpath = "//button[@class=\"btn btn-warning first-tabs-button\"]")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy (id = "dropdownMenu1")
	@CacheLookup
	WebElement lnkWelcome;
	
	@FindBy (linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	// Action Methods
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickWelcome()
	{
		lnkWelcome.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}

}

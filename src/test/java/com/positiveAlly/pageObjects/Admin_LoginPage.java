package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_LoginPage 
{
	WebDriver ldriver;
	public Admin_LoginPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Admin Login Pagae====================
	@FindBy (name = "user_email_id")
	@CacheLookup
	WebElement txtAdminEmail;
	
	@FindBy (name = "password")
	@CacheLookup
	WebElement txtAdminPassword;
	
	@FindBy (xpath = "//button[@class=\"btn btn-warning first-tabs-button\"]")
	@CacheLookup
	WebElement clickLog_In;
	
	//Logout Administrator Account==================
	@FindBy (partialLinkText = "Welcome Administrator")
	@CacheLookup
	WebElement Welcome_Administrator;
	
	@FindBy (partialLinkText = "Logout")
	@CacheLookup
	WebElement Administrator_Logout;

	//Action Method====================================
	public void setAdminEmail(String adminEmail)
	{
		txtAdminEmail.sendKeys(adminEmail);
	}
	
	public void setAdminPassword(String adminPassword)
	{
		txtAdminPassword.sendKeys(adminPassword);
	}
	
	public void clickAdminLog_In()
	{
		clickLog_In.click();
	}
	
	//Logout Administrator Account=======================

	public void mouseOverAdministrator()
	{
		Actions builder = new Actions(ldriver);
		WebElement menuElement1 = Welcome_Administrator;
		builder.moveToElement(menuElement1).build().perform();
	}
		
	public void Administrator_Logout()
	{
		Administrator_Logout.click();
	}
}

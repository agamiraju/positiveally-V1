package com.positiveAlly.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Parent_Account_GmailVerifyPage 
{
	WebDriver ldriver;
	public Parent_Account_GmailVerifyPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (id = "identifierId")
	@CacheLookup
	WebElement txt_Email;
	
	@FindBy (xpath = "//span[@class='RveJvd snByac']")
	@CacheLookup
	WebElement txtClickNextButton;
	
	@FindBy (xpath = "//input[@class='whsOnd zHQkBf']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy (xpath = "//span[@class='RveJvd snByac']")
	@CacheLookup
	WebElement txtClickNext;
	
	@FindBy (className = "gb_D")
	@CacheLookup
	WebElement click_Menu;
	
	@FindBy (id = "gb23")
	@CacheLookup
	WebElement click_Gmail;
	
	@FindBy (how = How.PARTIAL_LINK_TEXT, using = "DEV - Email verification for Positive Ally")
	@CacheLookup
	WebElement click_PositiveAlly;
	
	@FindBy (partialLinkText = "Click here to verify your email address")
	@CacheLookup
	WebElement txtClickVerifyEmail;
	
	//Login Parent Account==================
	@FindBy (how=How.LINK_TEXT, using = "LOGIN")
	@CacheLookup
	WebElement click_LoginText;
	
	@FindBy (name = "user_email_id")
	@CacheLookup
	WebElement txtUserEmail;
	
	@FindBy (name = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy (xpath = "//button[@class=\"btn btn-warning first-tabs-button\"]")
	@CacheLookup
	WebElement btnLogin;
	
	
//Action Methods for the Create new Account
	public void setEmailAddress(String gmailemail)
	{
		txt_Email.sendKeys(gmailemail);
	}
	
	public void setClickNext() 
	{
		txtClickNextButton.click();
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setClickNextButton()
	{
		txtClickNext.click();
	}
	
	public void click_menu()
	{
		click_Menu.click();
	}
	
	public void click_Gmail()
	{
		click_Gmail.click();
	}
	
	public void setClickEmailName()
	{
		click_PositiveAlly.click();
	}
	
	public void setClickVerifyEmail()
	{
		txtClickVerifyEmail.click();
	}
	
	//Login Parent Account==================
	public void click_LoginText()
	{
		click_LoginText.click();
	}
	
	public void setUserEmail(String email)
	{
		txtUserEmail.sendKeys(email);
	}
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void btnLogin()
	{
		btnLogin.click();
	}
}

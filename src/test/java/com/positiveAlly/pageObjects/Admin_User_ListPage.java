package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_User_ListPage 
{
	WebDriver ldriver;
	public Admin_User_ListPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Admin Side User List Module=================
	@FindBy (partialLinkText = "User")
	@CacheLookup
	WebElement txtUserList;
	
	@FindBy (partialLinkText = "User List")
	@CacheLookup
	WebElement txtUser_List;
	
	//Search User list=====================
	/*@FindBy (name = "search_option")
	@CacheLookup
	WebElement selectUserSearch;*/
	
	@FindBy (name = "user_search")
	@CacheLookup
	WebElement txtUserNameSearch;
	
	@FindBy (id = "search_btn")
	@CacheLookup
	WebElement clickUserSearch;
	
	
	@FindBy (className = "icon-unlock")
	@CacheLookup
	WebElement clickActiveButton;
	
	//Logout Admin Portal=============
	@FindBy (partialLinkText = "Welcome Administrator")
	@CacheLookup
	WebElement clickWelcome_Administrator;
	
	@FindBy (partialLinkText = "Logout")
	@CacheLookup
	WebElement clickLogoutButton;
	 
	
	//Action Methods=====================
	public void mouseOverUser()
	{
		Actions builder = new Actions(ldriver);
		WebElement menuElement = txtUserList;
		builder.moveToElement(menuElement).build().perform();
	}
	
	public void clickUserList()
	{
		txtUser_List.click();
	}
	
	public void setUserNameSelect(String Larryq)
	{
		txtUserNameSearch.sendKeys(Larryq);

		selectOptionWithText1(Larryq);
	}
	
	private void selectOptionWithText1(String Larryq) 
	{
		// TODO Auto-generated method stub
	}
	
	public void clickUserSearch()
	{
		clickUserSearch.click();
	}
	
	public void clickActiveButton()
	{
		clickActiveButton.click();
	}
	
	// Admin Logout===============
	public void mouseOverAdministrator()
	{
		Actions builder = new Actions(ldriver);
		WebElement menuElement = clickWelcome_Administrator;
		builder.moveToElement(menuElement).build().perform();
	}
	
	public void clickLogoutButton()
	{
		clickLogoutButton.click();
	}
	
}

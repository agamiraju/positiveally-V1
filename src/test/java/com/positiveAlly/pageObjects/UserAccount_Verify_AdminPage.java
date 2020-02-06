package com.positiveAlly.pageObjects;

import java.util.Base64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserAccount_Verify_AdminPage 
{
	WebDriver ldriver;
	public UserAccount_Verify_AdminPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Login admin account details=====================
	@FindBy(how=How.NAME, using="user_email_id")
	@CacheLookup
	WebElement admin_emailId;
	
	@FindBy(how=How.ID, using="password")
	@CacheLookup
	WebElement admin_password;
	
	@FindBy(how=How.XPATH , using="//*[@class = 'btn btn-warning first-tabs-button']")
	@CacheLookup
	WebElement admin_login_button;
	
	//Clicked on the user list==================================
	@FindBy(how=How.XPATH , using="//*[@src = 'http://localhost/positiveally//assets/images/user_list.png']")
	@CacheLookup
	WebElement click_userList;
	
	// Search Email id of the parent to verify account=========
	@FindBy(how=How.NAME , using="search_option")
	@CacheLookup
	WebElement search_option;
	
	@FindBy(how=How.ID , using="ui-id-26")
	@CacheLookup
	WebElement click_Email;
	
	@FindBy(how=How.ID , using="search_btn")
	@CacheLookup
	WebElement click_search;
	
	@FindBy(how=How.XPATH , using="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/button[1]/a[1]")
	@CacheLookup
	WebElement click_ActivateLock;
	
	//Logout Admin Portal=============
	@FindBy (partialLinkText = "Welcome Administrator")
	@CacheLookup
	WebElement clickWelcome_Administrator;
	
	@FindBy (partialLinkText = "Logout")
	@CacheLookup
	WebElement clickLogoutButton;
	
	
	//Action Methods=====================================
	//Login admin account details=========================
	public void admin_emailId(String email_admin)
	{
		admin_emailId.sendKeys(email_admin);
	}
	
	public void admin_password(String admin_Pass)
	{
		admin_password.sendKeys(admin_Pass);
	}
	
	public void admin_login_button()
	{
		admin_login_button.click();
	}
	
	//Clicked on the user list==================================
	public void click_userList()
	{
		click_userList.click();
	}
	
	/*// Search Email id of the parent to verify account=========
	public void select_search_option()
	{
		Select drop_email = new Select(search_option);
		drop_email.selectByVisibleText("User Email");
	}
	
	public void select_search_Email()
	{
		// create a sample String to encode 
        String email1 = "agami.test002@gmail.com";
        
     // Encode into Base64 format 
        String BasicBase64format = Base64.getEncoder().encodeToString(email1.getBytes()); 
     // create an encoded String to decode 
        String encoded_email = "YWdhbWkudGVzdDAwMkBnbWFpbC5jb20="; 
	}
	
	public void select_emailName(String encoded_email)
	{
		click_Email.sendKeys(encoded_email);
		selectOptionWithText(encoded_email);
	}
	
	private void selectOptionWithText(String email) 
	{
		// TODO Auto-generated method 	
	}
	
	public void click_search_Email() 
	{
		click_Email.click();
	}
		
	public void click_search()
	{
		click_search.click();
	}*/
	
	
	//Clicked on activate button==============
	public void click_ActivateLock()
	{
		click_ActivateLock.click();
	}
	
	// Admin Logout==========================
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

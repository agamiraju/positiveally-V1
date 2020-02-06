package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Re_RegistrationPage 
{
	WebDriver ldriver;
	public Re_RegistrationPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//Click on Re-Registration Module==========
	@FindBy (linkText = "Re-Registration")
	@CacheLookup
	WebElement linkRe_Registration;
	
	//Student select to Re-Registration=======
	@FindBy (id = "chk0")
	@CacheLookup
	WebElement checkBox_Re_Registration;
	
	@FindBy (id = "student_0_programs")
	@CacheLookup
	WebElement select_Program;
	
	@FindBy (xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement re_Register_button;
	
	//Proceed to Payment===========================
	@FindBy (xpath = "//img[@src = 'https://testportal.positiveally.com//assets/images/proceed-to-payment.png']")
	@CacheLookup
	WebElement click_ProceedtoPayment;
	
	//Click on Edit button==========================
	@FindBy (xpath = "//button[@value = 'edit']")
	@CacheLookup
	WebElement click_Edit_Payment;

	//Click on Proceed to Payment
	@FindBy (xpath = "//img[@src = 'https://testportal.positiveally.com//assets/images/proceed-to-payment.png']")
	@CacheLookup
	WebElement previous_proceedToPayment;
	
	//Tuition Summary Details====================
	@FindBy (name = "agree")
	@CacheLookup
	WebElement checkBoxTermsConditions3;
	
	//Checkout Process==========================
	@FindBy (xpath = "//*[@value = 'confirm']")
	@CacheLookup
	WebElement clickCheckoutButton1;
	
	//Payment Page Using PromoCode 333 Payment Method================
	@FindBy (id = "check")
	@CacheLookup
	WebElement clickHavePromoCode2;
	
	@FindBy (id = "promocode")
	@CacheLookup
	WebElement txtHavePromoCode2;
	
	@FindBy (id = "apply_promocode")
	@CacheLookup
	WebElement txtClickAppy2;
	
	@FindBy (id = "paypal_submit")
	@CacheLookup
	WebElement clickSubmitPayment2;
	
	//Payment Credit Card Details=======================
	@FindBy (id = "customer_first_name")
	@CacheLookup
	WebElement txtCardHolderName2;
	
	@FindBy (name = "customer_address1")
	@CacheLookup
	WebElement txtStreetAddress2;

	@FindBy (name = "customer_city")
	@CacheLookup
	WebElement txtCityName2;
	
	@FindBy (id = "customer_zip")
	@CacheLookup
	WebElement txtZipCode2;
	
	@FindBy (id = "phonenumber")
	@CacheLookup
	WebElement txtPhoneNumber2;
	
	@FindBy (name = "customer_credit_card_number")
	@CacheLookup
	WebElement txtCreaditCardNumber2;
	
	@FindBy (name = "cc_expiration_month")
	@CacheLookup
	WebElement txtExpirationMonth2;
	
	@FindBy (name = "cc_expiration_year")
	@CacheLookup
	WebElement txtExpirationYear2;
	
	@FindBy (name = "cc_cvv2_number")
	@CacheLookup
	WebElement txtCardSecurityNumber2;
	
	@FindBy (id = "paypal_submit")
	@CacheLookup
	WebElement clickPaymentSubmit2;
	
	
	//Action Methods Student Registration=============
	
	//Click on Re-Registration Module====================
	public void re_Registration()
	{
		linkRe_Registration.click();
	}
	
	//Student select to Re-Registration================
	public void re_Registration_checkbox()
	{
		checkBox_Re_Registration.click();
	}
	
	public void select_Program()
	{
		Select drop_program = new Select(select_Program);
		drop_program.selectByVisibleText("After School");
	}
	
	public void re_Register()
	{
		re_Register_button.click();
	}
	
	//Proceed to Payment=============================
	public void proceedToPayment()
	{
		click_ProceedtoPayment.click();
	}
	
	//Click on Edit button===========================
	public void click_EditPaymentButton()
	{
		click_Edit_Payment.click();
	}

	//Click on Proceed to Payment
	public void previous_ProceedToPayment()
	{
		previous_proceedToPayment.click();
	}
	
	//Tuition Summary Details====================
	public void boxTermsConditions()
	{
		checkBoxTermsConditions3.click();
	}
	
	//Checkout Process=============================
	public void checkoutButton()
	{
		clickCheckoutButton1.click();
	}
	
	//Payment Page Using PromoCode 333 Payment Method================
	public void clickHavePromoCode2()
	{
		clickHavePromoCode2.click();
	}
	
	public void enterHavePromoCode(String codePromo)
	{
		txtHavePromoCode2.sendKeys(codePromo);
	}
	
	public void clickAppyButton()
	{
		txtClickAppy2.click();
	}
	
	public void submit_Payment()
	{
		clickSubmitPayment2.click();
	}
	
	//Payment Credit Card Details=======================
	public void cardHolder(String cardHolder)
	{
		txtCardHolderName2.sendKeys(cardHolder);
	}
	
	public void streetAddress(String streetAddr)
	{
		txtStreetAddress2.sendKeys(streetAddr);
	}

	public void cityName(String cityname)
	{
		txtCityName2.sendKeys(cityname);
	}
	
	public void zipCode(String zipcode)
	{
		txtZipCode2.sendKeys(zipcode);
	}
	
	public void phoneNumber(String phoneNumber)
	{
		txtPhoneNumber2.sendKeys(phoneNumber);
	}
	
	public void creditCardNum(String creditNum)
	{
		txtCreaditCardNumber2.sendKeys(creditNum);
	}
	
	public void expirationMonth()
	{
		Select drop_ExpirationMonth = new Select(txtExpirationMonth2);
		drop_ExpirationMonth.selectByVisibleText("02");
	}
	
	public void expirationYear()
	{
		Select drop_ExpirationYear = new Select(txtExpirationYear2);
		drop_ExpirationYear.selectByVisibleText("2020");
	}
	
	public void cardSecurityNum(String cardSecurity)
	{
		txtCardSecurityNumber2.sendKeys(cardSecurity);
	}
	
	public void paymentSubmit()
	{
		clickPaymentSubmit2.click();
	}
		
	
}

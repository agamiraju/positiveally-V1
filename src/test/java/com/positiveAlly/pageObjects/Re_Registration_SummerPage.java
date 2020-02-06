package com.positiveAlly.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Re_Registration_SummerPage 
{
	WebDriver ldriver;
	public Re_Registration_SummerPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Click on Re-Registration Module======================
	@FindBy (linkText = "Re-Registration")
	@CacheLookup
	WebElement re_Registration;
	
	//Student select to Re-Registration=====================
	@FindBy (id = "chk2")
	@CacheLookup
	WebElement checkBox_Re_Registration;
	
	@FindBy (id = "student_2_programs")
	@CacheLookup
	WebElement summer_Program;
	
	@FindBy (xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement re_Register_button;
	
	//Click on Student Name==================================
	@FindBy (linkText = "Angad Kumar")
	@CacheLookup
	WebElement click_Student_Name;
	
	//Week 1- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_Enrichment1;
	
	//P.M Camp 1:00-5:45
	@FindBy (className = "labelauty-unchecked")
	@CacheLookup
	WebElement click_Fieldtrip1;
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement2;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip2;
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement3;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip3;
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement4;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip4;
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement5;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip5;
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement6;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip6;
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.=====================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement7;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip7;
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.===================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement8;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip8;
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.===================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement9;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip9;
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.===================
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Enrichement10;
	
	//P.M Camp 1:00-5:45
	@FindBy (xpath = "//a[@class='fa fa-plus-circle plus_color']")
	@CacheLookup
	WebElement click_Fieldetrip10;
	
	//Including Allergies===================================
	@FindBy (id = "other0")
	@CacheLookup
	WebElement txt_including_Allergies;
	
	//Proceed to Payment====================================
	@FindBy (xpath = "//*[@src = 'http://localhost/positiveally//assets/images/proceed-to-payment.png']")
	@CacheLookup
	WebElement click_ProceedToPayment;
	
	//Edit button of the Checkout============================
	@FindBy (xpath = "//button[@value = 'edit']")
	@CacheLookup
	WebElement click_Edit_Payment;
	
	//Student Name to Edit weeks=================================
	@FindBy (xpath = "//a[@class='tabLink']")
	@CacheLookup
	WebElement edit_Student_Summer;
	
	//Proceed to Payment====================================
	@FindBy (xpath = "//*[@src = 'http://localhost/positiveally//assets/images/proceed-to-payment.png']")
	@CacheLookup
	WebElement previous_ProceedToPayment;
	
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
	
	@FindBy (xpath = "//*[@id = 'paypal_submit']")
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
	
	
	//Action Methods Student Registration===================
	//Click on Re-Registration Summer Program=======================
	public void linkRe_Registration()
	{
		re_Registration.click();
	}
	
	//Student select to Re-Registration=====================
	public void checkBox_Re_Registration()
	{
		checkBox_Re_Registration.click();
	}
	
	public void summer_Program()
	{
		Select drop_Summer = new Select(summer_Program);
		drop_Summer.selectByVisibleText("Summer");
	}
	
	public void re_Register_button()
	{
		re_Register_button.click();
	}
	//Click on Student Name==================================
	public void click_Student_Name()
	{
		click_Student_Name.click();
	}
	
	//Week 1- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichment1()
	{
		click_Enrichment1.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldtrip1()
	{
		click_Fieldtrip1.click();
	}
	
	//Week 2- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement2()
	{
		click_Enrichement2.click();
	}
    
	//P.M Camp 1:00-5:45
	public void click_Fieldtrip2()
	{
		click_Fieldetrip2.click();
	}
	
	//Week 3- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement3()
	{
		click_Enrichement3.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip3()
	{
		click_Fieldetrip3.click();
	}
	
	//Week 4- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement4()
	{
		click_Enrichement4.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip4()
	{
		click_Fieldetrip4.click();
	}
	
	//Week 5- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement5()
	{
		click_Enrichement5.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip5()
	{
		click_Fieldetrip5.click();
	}
	
	//Week 6- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement6()
	{
		click_Enrichement6.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip6()
	{
		click_Fieldetrip6.click();
	}
	
	//Week 7- A.M Camps - 8:15-1:00 p.m.=====================
	public void click_Enrichement7()
	{
		click_Enrichement7.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip7()
	{
		click_Fieldetrip7.click();
	}
		
	//Week 8- A.M Camps - 8:15-1:00 p.m.===================
	public void click_Enrichement8()
	{
		click_Enrichement8.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip8()
	{
		click_Fieldetrip8.click();
	}
	
	//Week 9- A.M Camps - 8:15-1:00 p.m.===================
	public void click_Enrichement9()
	{
		click_Enrichement9.click();
	}
		
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip9()
	{
		click_Fieldetrip9.click();
	}
	
	//Week 10- A.M Camps - 8:15-1:00 p.m.===================
	public void click_Enrichement10()
	{
		click_Enrichement10.click();
	}
	
	//P.M Camp 1:00-5:45
	public void click_Fieldetrip10()
	{
		click_Fieldetrip10.click();
	}
	
	//Including Allergies===================================
	public void txt_including_Allergies(String allergies)
	{
		txt_including_Allergies.sendKeys(allergies);
	}
	
	//Proceed to Payment====================================
	public void click_ProceedToPayment()
	{
		click_ProceedToPayment.click();
	}
	
	//Edit button of the Checkout============================
	public void click_Edit_Payment()
	{
		click_Edit_Payment.click();
	}
	
	//Student Name to Edit weeks=================================
	public void edit_Student_Summer()
	{
		edit_Student_Summer.click();
	}
	
	//Proceed to Payment====================================
	public void previous_ProceedToPayment()
	{
		previous_ProceedToPayment.click();
	}
	
	//Tuition Summary Details====================
	public void checkBoxTermsConditions3()
	{
		checkBoxTermsConditions3.click();
	}
	
	//Checkout Process==========================
	public void clickCheckoutButton1()
	{
		clickCheckoutButton1.click();
	}
	
	//Payment Page Using PromoCode 333 Payment Method================
	public void clickHavePromoCode2()
	{
		clickHavePromoCode2.click();
	}
	
	public void txtHavePromoCode2(String promo)
	{
		txtHavePromoCode2.sendKeys(promo);
	}
	
	public void txtClickAppy2()
	{
		txtClickAppy2.click();
	}
	
	public void clickSubmitPayment2()
	{
		clickSubmitPayment2.click();
	}
	
	//Payment Credit Card Details=======================
	public void txtCardHolderName2(String holdername)
	{
		txtCardHolderName2.sendKeys(holdername);
	}
	
	public void txtStreetAddress2(String street)
	{
		txtStreetAddress2.sendKeys(street);
	}

	public void txtCityName2(String city)
	{
		txtCityName2.sendKeys(city);
	}
	
	public void txtZipCode2(String zipcode)
	{
		txtZipCode2.sendKeys(zipcode);
	}
	
	public void txtPhoneNumber2(String phoneNum)
	{
		txtPhoneNumber2.sendKeys(phoneNum);
	}
	
	public void txtCreaditCardNumber2(String cardnumber)
	{
		txtCreaditCardNumber2.sendKeys(cardnumber);
	}
	
	public void txtExpirationMonth2()
	{
		Select drop_ExpirationMonth = new Select(txtExpirationMonth2);
		drop_ExpirationMonth.selectByVisibleText("02");
	}
	
	public void txtExpirationYear2()
	{
		Select drop_ExpirationYear = new Select(txtExpirationYear2);
		drop_ExpirationYear.selectByVisibleText("2020");
	}
	
	public void txtCardSecurityNumber2(String ccvcode)
	{
		txtCardSecurityNumber2.sendKeys(ccvcode);
	}
	
	public void clickPaymentSubmit2()
	{
		clickPaymentSubmit2.click();
	}
	



}

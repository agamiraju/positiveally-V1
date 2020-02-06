package com.positiveAlly.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.positiveAlly.pageObjects.LoginPage;
import com.positiveAlly.utilities.XLUtils;
public class TC_LoginDDT_002 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("Username provided");
		lp.setPassword(pwd);
		logger.info("Password provided");
		lp.clickLogin();
		Thread.sleep(5000);
		lp.clickWelcome();
		logger.info("Click welcome name");
		Thread.sleep(1000);
		lp.clickLogout();
		logger.info("Login page should be shown!");
		
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		
		//String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		String path = "/home/ganesh/eclipse-workspace/PositiveAlly/src/test/java/com/positiveAlly/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
	
}
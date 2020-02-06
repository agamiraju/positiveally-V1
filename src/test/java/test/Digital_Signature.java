package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Digital_Signature 
{
	public static void main(final String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "/home/ganesh/Documents/Selenium_Eclipse/chromedriver");
		 final WebDriver driver = (WebDriver)new ChromeDriver();
		 driver.manage().window().maximize();

		 WebDriverWait wait = new WebDriverWait(driver, 20);

		 driver.get("https://testportal.positiveally.com/");

		 driver.findElement(By.name("user_email_id")).sendKeys("agami.test001@gmail.com");
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("password")).sendKeys("123456");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//button[@class= 'btn btn-warning first-tabs-button\']")).click();
		 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(5000);
         
		 //Digital Signature==================
		 WebElement element = driver.findElement(By.className("signature-pad"));

		    Actions builder = new Actions(driver);
		    Action drawAction = builder.moveToElement(element,20,30) //start points x axis and y axis. 
		              .click()
		              .moveByOffset(40, 60) // 2nd points (x1,y1)
		              .click()
		              .moveByOffset(20, 30)// 3rd points (x2,y2)
		              .doubleClick()
		              .build();
		    drawAction.perform();
		  Thread.sleep(3000);  
		  //driver.findElement(By.id("save_signature")).click();
          driver.quit();
		 }
	 }
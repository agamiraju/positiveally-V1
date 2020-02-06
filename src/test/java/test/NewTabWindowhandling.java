package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTabWindowhandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/ganesh/Documents/Selenium_Eclipse/chromedriver");
		 final WebDriver driver = (WebDriver)new ChromeDriver();
		 driver.manage().window().maximize();
		
		  //open URL
		  driver.get("http://toolsqa.com/automation-practice-switch-windows/");

		  //maximize the window
		  driver.manage().window().maximize();

		  /*//login to test web site
		  driver.findElement(By.id("remail")).sendKeys("test@seleniumpoint.com ");
		  driver.findElement(By.id("rpassword")).sendKeys("test@123");
		  driver.findElement(By.id("rsubmit")).click();

		  Thread.sleep(4000);*/

		  //First Get parent window,means current window handle
		  String parentWindow = driver.getWindowHandle();
		  System.out.println("Parent Window Title " + driver.getTitle());

		  //click on View link of second product to open window: Bag
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();

		  //Now here is the New Tab handling code

		  //Get All Tabs or Window handles and iterate using for each loop
		  for (String handle: driver.getWindowHandles()) {
		   System.out.println(handle);
		   driver.switchTo().window(handle);

		  }
		  Thread.sleep(1000);
		  //Click on Cart Button
		    Actions builder = new Actions(driver);
			WebElement menuElement2 = driver.findElement(By.linkText("TUTORIAL"));
			builder.moveToElement(menuElement2).build().perform();
			
			Thread.sleep(1000);
		  driver.findElement(By.linkText("Software Testing Tutorial")).click();
		  //Go back to Parent window
		  driver.switchTo().window(parentWindow);
		
		
		

	}

}

package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_browser 
{
	public static void main(String args[]) throws InterruptedException
	{
        
	// Selenium version 3 beta releases require system property set up
    System.setProperty("webdriver.chrome.driver", "/home/ganesh/Documents/Selenium_Eclipse/chromedriver");
   	WebDriver driver = new ChromeDriver();
   	driver.manage().window().maximize();
   
   	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	String parentWindowHandle = driver.getWindowHandle();
    
	//System.out.println("Parent window's handle -> " + parentWindowHandle);
	WebElement clickElement = driver.findElement(By.id("button1")); 
	clickElement.click();
	Thread.sleep(2000);
	
	Set<String> allWindowHandles = driver.getWindowHandles();
	String lastWindowHandle = "";
	for(String handle : allWindowHandles)
	{
		lastWindowHandle = handle;
	}
	driver.switchTo().window(lastWindowHandle);
	
	WebElement clickElement1 = driver.findElement(By.className("dt-mobile-menu-icon"));
	clickElement1.click();
	Thread.sleep(2000);
	
	WebElement clickElement3 = driver.findElement(By.linkText("SELENIUM TRAINING"));
	clickElement3.click();
    Thread.sleep(2000);
    driver.close();
   
	driver.switchTo().window(lastWindowHandle);
	Thread.sleep(2000);
	driver.close();
}

}

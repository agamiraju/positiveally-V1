package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Tab_Chrome 
{
	public static void main(final String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/ganesh/Documents/Selenium_Eclipse/chromedriver");
		 final WebDriver driver = (WebDriver)new ChromeDriver();
		 driver.manage().window().maximize();
		 
		    
		//Launch the first URL
		 driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiiuOmd-KrmAhUGzTgGHYk2BUsQPAgH");
		 driver.findElement(By.id("gb_70")).click();
		
	    
		//Use robot class to press Ctrl+t keys     
		 Robot robot = new Robot();                          
		 robot.keyPress(KeyEvent.VK_CONTROL); 
		 robot.keyPress(KeyEvent.VK_T); 
		 robot.keyRelease(KeyEvent.VK_CONTROL); 
		 robot.keyRelease(KeyEvent.VK_T);
	    
		//Switch focus to new tab
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		//Launch URL in the new tab
		 driver.get("http://facebook.com");
		 /*driver.findElement(By.name("email")).sendKeys("Raju0556");
		 driver.findElement(By.name("pass")).sendKeys("7042718794");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@value = 'Log In']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.id("logoutMenu")).click();
		 
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Log Out")).click();*/
		 
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().window(tabs.get(0));
		 driver.findElement(By.name("identifier")).sendKeys("agami.test001@gmail.com");
		 driver.findElement(By.className("CwaK9")).click();
		 
		 Thread.sleep(1000);
		 driver.findElement(By.name("password")).sendKeys("Agami@2016");
		 driver.findElement(By.className("CwaK9")).click();
		 Thread.sleep(1000);
		 
		 /*driver.switchTo().window(tabs.get(1));
		 Thread.sleep(1000);
		 driver.close();*/
		 driver.findElement(By.xpath("//*[@class = 'gb_D gb_oc']'")).click();
		  
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		 Thread.sleep(1000);
		 driver.close();
		 
	}
	

}

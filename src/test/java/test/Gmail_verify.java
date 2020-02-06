package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_verify 
{
	public static void main(final String[] args) throws Exception {
	 System.setProperty("webdriver.chrome.driver", "/home/ganesh/Documents/Selenium_Eclipse/chromedriver");
	 final WebDriver driver = (WebDriver)new ChromeDriver();
	 driver.manage().window().maximize();

	 WebDriverWait wait = new WebDriverWait(driver, 20);

	 driver.get("https://accounts.google.com/signin");

	 driver.findElement(By.id("identifierId")).sendKeys("agami.test003@gmail.com");

	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 

	 WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));

	         wait.until(ExpectedConditions.elementToBeClickable(password));

	         

	         password.sendKeys("Agami@2016");

	         driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

	 //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.findElement(By.className("gb_Xe")).click();
	 Thread.sleep(2000);
	 
	 //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.findElement(By.id("gb23")).click();
	 Thread.sleep(6000);
	 
	 /*//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.findElement(By.partialLinkText("Gmail")).click();
     Thread.sleep(2000);
     
     driver.findElement(By.partialLinkText("Gmail")).click();
     Thread.sleep(2000);*/
	 driver.quit();

	 }
	 }
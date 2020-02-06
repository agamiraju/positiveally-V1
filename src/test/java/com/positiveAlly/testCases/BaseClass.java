package com.positiveAlly.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.positiveAlly.utilities.ReadConfig;

public class BaseClass

{
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplication();
	public String gmailURL = readconfig.getGmailURL1();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		/*
		 * //System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		 * //System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
		 * //System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dr")+ "//chromedriver.exe");// windows directory
		 * //driver =new ChromeDriver(); //driver = new FirefoxDriver();
		 */
		logger = Logger.getLogger("Positiveally");
		PropertyConfigurator.configure("/home/ganesh/eclipse-workspace/PositiveAlly/log4j.properties");

		if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		} 
		else if (br.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("--disable-browser-side-navigation");
			options.addArguments("--start-maximized");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--headless");
			options.setBinary("/usr/bin/google-chrome-stable");
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIePath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);// it is copy to TestCase_001
		// driver.get(gmailURL);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		// driver.close();factory
	}
	// If you want to catch failed test cases you will have to add "captureScreen"
	// method.

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}

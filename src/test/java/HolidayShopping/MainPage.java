package HolidayShopping;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;

import resources.base;

public class MainPage extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 //driver =resizeBrowser();
		 driver.get(prop.getProperty("urlFinalProdVersion"));
	}
	
	@Test(priority=1)
	public void Test1() throws IOException
	{

	
		LandingPage l=new LandingPage(driver);
		
		initiateEyes();
		
		validatewindow(driver, Thread.currentThread().getStackTrace()[1].getMethodName());
		}

	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

}

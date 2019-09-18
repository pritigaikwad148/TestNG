package Newpack;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNGfile {
	public String baseUr1 = "http://demo.guru99.com/test/newtours/";
	String driverPath = "c:\\geckodriver.exe";
	public WebDriver driver;
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("launching firefpox browser");
	  System.setProperty("webdriver.firefox.marionette", driverPath);
	  driver =new FirefoxDriver();
	  driver .get(baseUr1);
	  String expectedTitle ="Welcome: Mercury Tours";
	  String actualTitle =driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	driver.close();
  }
}

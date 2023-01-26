package com.medhas.regression;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.qa.utility.BrowserFactory;
import com.qa.utility.ConfigDataProvider;
import com.qa.utility.ExcelDataProvider;
import com.qa.utility.Screenshotasd;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
    public ConfigDataProvider config;

	@BeforeSuite
	public void datasetSuite() {
		 config = new ConfigDataProvider();
		 excel = new ExcelDataProvider();
	}

	@BeforeClass
	public void setUp() {
		driver=BrowserFactory.launchBrowser(driver, config.getBrowser(),config.getqaURL());
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}

	@AfterMethod
	public void teardownmethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS) {
			Screenshotasd.captureScreenshot(driver);
		}
	}
}

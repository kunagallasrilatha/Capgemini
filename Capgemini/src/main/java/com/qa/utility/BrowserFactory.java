package com.qa.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver launchBrowser(WebDriver driver, String browsername ,String url)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Capgemini\\Bowser\\chromedriver.exe");
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		}else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
		
			driver=new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		}
	
	//WebDriverManager.chromedriver().setup();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get(url);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	return driver;
}
	public static void quitBrowser(WebDriver driver) {
		{
			driver.quit();
		}
	}
}
package com.medhas.regression;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "domainName")
	WebElement dropdown;

	@FindBy(name = "userId")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//span[text()='Sign In']")
	WebElement signinbuton;

	public void sucessfulLogin(String ddname, String usernam, String passwor) throws Exception {
		dropdown.sendKeys(ddname);
		Thread.sleep(1000);
		dropdown.sendKeys(Keys.ARROW_DOWN);

		dropdown.sendKeys(Keys.ENTER);

		username.sendKeys(usernam);
		password.sendKeys(passwor);
		signinbuton.click();
		Thread.sleep(2000);

	}
}

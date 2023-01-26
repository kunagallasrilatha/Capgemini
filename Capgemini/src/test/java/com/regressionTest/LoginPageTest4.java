package com.regressionTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.LoginPage;

public class LoginPageTest4 extends BaseClass {

	
	@Test
	
	public void loginverification() throws Exception
	{
LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	
login.sucessfulLogin(excel.getStringData("loginpage", 1, 0),excel.getStringData("loginpage", 1, 1), excel.getStringData("loginpage", 1, 2));	
	}
}

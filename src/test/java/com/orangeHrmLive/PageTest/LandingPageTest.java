package com.orangeHrmLive.PageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrmLive.qa.Pages.LandingPage;
import com.orangeHrmLive.qa.TestBase.TestBase;

public class LandingPageTest extends TestBase {
	LandingPage lp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
	}

	@Test
	public void enterUserNameAndPassword() {
		lp.enterUserName("Admin", "admin123");
		lp.clickOnLogInButton();
	}

	@AfterMethod
	public void quitDriver() {
		tearDown();
	}
}

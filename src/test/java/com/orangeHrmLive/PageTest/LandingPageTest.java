package com.orangeHrmLive.PageTest;

import org.testng.Assert;
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

	@Test(priority = 1)
	public void verifyLogin() {
		lp.LoginPage("admin", "admin123");
	}

	@Test(priority = 2)
	public void verifyIsLogoDisplayed() {
		boolean isDisplayed = lp.isLogoDisplayed();
		Assert.assertTrue(isDisplayed);
	}

	@AfterMethod
	public void quitDriver() {
		tearDown();
	}
}

package com.orangeHrmLive.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.orangeHrmLive.qa.Pages.DashboardPage;
import com.orangeHrmLive.qa.Pages.LandingPage;
import com.orangeHrmLive.qa.TestBase.TestBase;

public class DashboardPageTest extends TestBase {

	LandingPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
	}

	@Test
	public void verifyLoginPage() {
		dp = lp.LoginPage("Admin", "admin123");
		String welcomeText = dp.verifyLoginPageText();
		Assert.assertTrue(welcomeText.contains(welcomeText));
		dp.clickAdminMenu();

	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
}

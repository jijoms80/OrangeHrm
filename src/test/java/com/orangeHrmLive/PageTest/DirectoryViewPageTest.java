package com.orangeHrmLive.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrmLive.qa.Pages.DashboardPage;
import com.orangeHrmLive.qa.Pages.DirectoryViewPage;
import com.orangeHrmLive.qa.Pages.LandingPage;
import com.orangeHrmLive.qa.TestBase.TestBase;

public class DirectoryViewPageTest extends TestBase {

	LandingPage lp;
	DashboardPage dp;
	DirectoryViewPage dvp;

	@BeforeMethod
	public void initalise() {
		setUp();
		lp = new LandingPage();
		dp = lp.LoginPage("admin", "admin123");
	}

	@Test
	public void searchDirectory() {
		dvp = dp.clickDirectory();
		dvp.searchByLocation();

		String text = dvp.fidElement();
		Assert.assertEquals(text, "Canadian Regional HQ");
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
}

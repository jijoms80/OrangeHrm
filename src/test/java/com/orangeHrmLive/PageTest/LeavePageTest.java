package com.orangeHrmLive.PageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrmLive.qa.Pages.DashboardPage;
import com.orangeHrmLive.qa.Pages.LandingPage;
import com.orangeHrmLive.qa.Pages.LeavePage;
import com.orangeHrmLive.qa.TestBase.TestBase;

public class LeavePageTest extends TestBase {
	LandingPage lp;
	DashboardPage dp;
	LeavePage lvp;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
		dp = lp.LoginPage("admin", "admin123");
	}

	@Test
	public void findEmployee() {
		lvp = dp.clickLeaveMenu();
		lvp.findEmployee();
		lvp.clickAndsendmessage();

	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
}
package com.orangeHrmLive.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrmLive.qa.Pages.AdminPage;
import com.orangeHrmLive.qa.Pages.DashboardPage;
import com.orangeHrmLive.qa.Pages.LandingPage;
import com.orangeHrmLive.qa.TestBase.TestBase;

public class AdminPageTest extends TestBase {

	LandingPage lp;
	DashboardPage dp;
	AdminPage ap;

	@BeforeMethod
	public void intialise() {
		setUp();
		lp = new LandingPage();
		dp = lp.LoginPage("admin", "admin123");

	}

	@Test
	public void searchEmployee() {
		ap = dp.clickAdminMenu();
		ap.inputEmployeeName("Aaliyah Haq");
		ap.clickSearchBtn();
		String emp_name = ap.findEmployeeName();
		Assert.assertEquals(emp_name, "Aaliyah Haq");

	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

}

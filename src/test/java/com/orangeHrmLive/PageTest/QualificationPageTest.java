package com.orangeHrmLive.PageTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHrmLive.qa.Pages.DashboardPage;
import com.orangeHrmLive.qa.Pages.LandingPage;
import com.orangeHrmLive.qa.Pages.QualificationPage;
import com.orangeHrmLive.qa.TestBase.TestBase;

public class QualificationPageTest extends TestBase {
	LandingPage lp;
	DashboardPage dp;
	QualificationPage qp;

	@BeforeMethod
	public void initalise() {
		setUp();
		lp = new LandingPage();
		dp = lp.LoginPage("admin", "admin123");
	}

	@Test
	public void addingSkills() {
		qp = dp.clickForSkills();
		qp.addSkills();
		String name = qp.findName();
		Assert.assertEquals(name, "jijo");

	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

}

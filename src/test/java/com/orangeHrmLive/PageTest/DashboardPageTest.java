package com.orangeHrmLive.PageTest;

import org.testng.annotations.BeforeMethod;

import com.orangeHrmLive.qa.Pages.DashboardPage;
import com.orangeHrmLive.qa.Pages.LandingPage;
import com.orangeHrmLive.qa.TestBase.TestBase;

public class DashboardPageTest extends TestBase {

	LandingPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void intialise() {

		lp = new LandingPage();

	}

}

package com.orangeHrmLive.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrmLive.qa.TestBase.TestBase;

public class LandingPage extends TestBase {

	public LandingPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "txtUsername")	WebElement userName;
	@FindBy(id="txtPassword")	WebElement password;
	@FindBy(id="btnLogin") WebElement loginButton;
}

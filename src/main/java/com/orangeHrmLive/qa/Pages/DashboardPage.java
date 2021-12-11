package com.orangeHrmLive.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrmLive.qa.TestBase.TestBase;

public class DashboardPage extends TestBase {

	public DashboardPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//*[@id='welcome']")
	WebElement welcomeBanner;
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminMenu;

	public String verifyLoginPageText() {
		String welcomeBanerText = welcomeBanner.getText();
		return welcomeBanerText;
	}

	public AdminPage clickAdminMenu() {
		adminMenu.click();
		return new AdminPage();
	}

}

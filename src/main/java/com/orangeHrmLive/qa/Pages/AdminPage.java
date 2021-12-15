package com.orangeHrmLive.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHrmLive.qa.TestBase.TestBase;

public class AdminPage extends TestBase {
	public AdminPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminMenu;
	@FindBy(id = "searchSystemUser_employeeName_empName")
	WebElement employeeName;
	@FindBy(id = "searchBtn")
	WebElement searchButton;
	

	public void clickAdminMenu() {
		adminMenu.click();
	}

	public void searchEmployee(String employee_name) {
		employeeName.sendKeys(employee_name);
		employeeName.sendKeys(Keys.ENTER);
		clickSearchBtn();
	}

	public void clickSearchBtn() {
		searchButton.click();
	}

	public String findEmployeeName() {
		String find_empName=null;
		
		List<WebElement> numberOfRows = wd.findElements(By.xpath("//table[@class='table hover']//tbody//tr"));
		List<WebElement> numberOfColums = wd.findElements(By.xpath("//table[@class='table hover']//tr/th"));
		String beforeXpath = "//table[@class='table hover']//tbody//tr[";
		String afterXapth = "]//td[";
		
		for (int i = 1; i <= numberOfRows.size(); i++) {
			for (int j = 1; j <= numberOfColums.size(); j++) {
				WebElement finalElement = wd.findElement(By.xpath(beforeXpath + i + afterXapth + j + "]"));
				if (finalElement.getText().equals("Aaliyah Haq")) {
					 find_empName = finalElement.getText();
					}
			}
		}
		return find_empName;
		
			
	}

}

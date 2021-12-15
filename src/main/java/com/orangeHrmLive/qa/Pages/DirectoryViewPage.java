package com.orangeHrmLive.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangeHrmLive.qa.TestBase.TestBase;

public class DirectoryViewPage extends TestBase {

	String Location = "Canadian Regional HQ";

	public DirectoryViewPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "searchDirectory_location")
	WebElement location;

	@FindBy(id = "searchBtn")
	WebElement searchBtn;

	public void searchByLocation() {
		Select select = new Select(location);
		location.click();
		select.selectByIndex(1);
		searchBtn.submit();

	}

	public String fidElement() {
		List<WebElement> rows = wd.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println(rowCount);
		String beforeXpath = "//*[@id='resultTable']/tbody/tr[";
		String afterXpath = "]/td[2]/ul/li[4]";
		for (int i = 2; i <= rowCount; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = wd.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if (element.getText().equals(Location)) {
				return Location;
			}
		}

		return Location;
	}

}

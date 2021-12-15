package com.orangeHrmLive.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHrmLive.qa.TestBase.TestBase;

public class QualificationPage extends TestBase {
	String skill = "jijo";

	public QualificationPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "menu_admin_Qualifications")
	WebElement qualificationMenu;
	@FindBy(id = "menu_admin_viewSkills")
	WebElement viewSkills;
	@FindBy(id = "btnAdd")
	WebElement addBtn;
	@FindBy(id = "skill_name")
	WebElement inputSkill;
	@FindBy(id = "skill_description")
	WebElement inputDescription;
	@FindBy(id = "btnSave")
	WebElement saveBtn;

	public void addSkills() {
		Actions action = new Actions(wd);
		action.moveToElement(qualificationMenu).perform();
		viewSkills.click();

		addBtn.click();
		inputSkill.sendKeys(skill);
		inputDescription.sendKeys("know everything");
		saveBtn.submit();
	
	}

	public String findName() {
		String findName = null;
		List<WebElement> numberOfRows = wd.findElements(By.xpath("//table[@class='table hover']//tbody//tr"));
		List<WebElement> numberOfColums = wd.findElements(By.xpath("//table[@class='table hover']//tr/th"));
		String beforeXpath = "//table[@class='table hover']//tbody//tr[";
		String afterXapth = "]//td[";
		for (int i = 1; i <= numberOfRows.size(); i++) {
			for (int j = 1; j <= numberOfColums.size(); j++) {
				WebElement finalElement = wd.findElement(By.xpath(beforeXpath + i + afterXapth + j + "]"));
				if (finalElement.getText().equals(skill)) {
					findName = finalElement.getText();
				}
			}
		}
		return findName;
	}

}

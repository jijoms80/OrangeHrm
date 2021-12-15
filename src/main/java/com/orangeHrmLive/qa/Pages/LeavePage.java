package com.orangeHrmLive.qa.Pages;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHrmLive.qa.TestBase.TestBase;

public class LeavePage extends TestBase {
	public LeavePage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "menu_leave_viewLeaveModule")
	WebElement leaveMenu;

	@FindBy(id = "leaveList_chkSearchFilter_checkboxgroup_allcheck")
	WebElement leaveStatus;
	@FindBy(id = "btnSearch")
	WebElement searchBtn;

	@FindBy(id = "calFromDate")
	WebElement fromDatePicker;
	@FindBy(css = ".ui-datepicker-month")
	WebElement fromMoth;
	@FindBy(css = ".ui-datepicker-year")
	WebElement fromYear;
	@FindBy(css = " tr:nth-child(1) > td:nth-child(3) >a")
	WebElement fromDate;
	@FindBy(id = "calToDate")
	WebElement toDatePicker;
	@FindBy(css = ".ui-datepicker-month")
	WebElement toMonth;
	@FindBy(css = ".ui-datepicker-year")
	WebElement toYear;
	@FindBy(css = " tr:nth-child(5) > td:nth-child(5) > a")
	WebElement toDate;

	@FindBy(xpath = "//*[@id='resultTable']/tbody/tr/td[7]/span/img")
	WebElement commentsMessage;

	@FindBy(id = "commentSave")
	WebElement commetSaveBtn;
	@FindBy(id = "leaveComment")
	WebElement inputMessage;

	public void clickLeaveMenu() {
		leaveMenu.click();
	}

	public void findEmployee() {
		fromDatePickerClick();
		toDatePicker();
		leaveStatus.click();
		//searchBtn.submit();

	}

	public void fromDatePickerClick() {
		fromDatePicker.click();
		fromMoth.click();
		Select selectMonth = new Select(fromMoth);
		selectMonth.selectByIndex(0);
		fromYear.click();
		Select selectYear = new Select(fromYear);
		selectYear.selectByValue("2020");
		fromYear.sendKeys(Keys.ENTER);
		fromDate.click();
	}

	public void toDatePicker() {
		toDatePicker.click();
		toMonth.click();
		Select selectMonth = new Select(toMonth);
		selectMonth.selectByIndex(11);
		toYear.click();
		Select selectYear = new Select(toYear);
		selectYear.selectByValue("2021");
		toYear.sendKeys(Keys.ENTER);
		toDate.click();
	}

	public void clickAndsendmessage() {
		commentsMessage.click();
		inputMessage.sendKeys("Please accept my request");
		commetSaveBtn.click();

	}

}
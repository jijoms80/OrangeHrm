package com.orangeHrmLive.qa.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver wd;
	public static Properties prop;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fs = new FileInputStream(
					"C:\\Users\\Owner\\eclipse-workspace\\14AugBatch\\src\\main\\java\\com\\automationPractise\\qa\\Properties\\config.properties");
			prop.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setup() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			wd = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			wd = new EdgeDriver();
		} else {
			System.out.println("Browser name is not correct");
		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get(prop.getProperty("url"));
	}

	public void tearDown() {
		wd.quit();
	}

}

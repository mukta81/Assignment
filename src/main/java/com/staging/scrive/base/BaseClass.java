package com.staging.scrive.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public ChromeDriver driver;

	/**
	 * This method will open the browser, add the link, maximize, and put and Implicit Wait of 10 seconds.
	 */
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.scrive.com/t/9221714692410699950/7348c782641060a9");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/**
	 * This will close the browser and ends the driver session
	 */
	@AfterMethod
	public void end() {
		driver.quit();
	}
}

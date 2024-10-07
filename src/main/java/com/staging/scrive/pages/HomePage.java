package com.staging.scrive.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.staging.scrive.base.BaseClass;

/**
 * HomePage class: actions that can be performed on the home page of the application.
 */
public class HomePage extends BaseClass {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method enters the user's full name into the Full Name field.
	 * @param fullName The name of the user to be entered.
	 * @return The current instance of HomePage for method chaining.
	 */
	public HomePage enterFullName(String fullName) {
		driver.findElement(By.id("name")).sendKeys(fullName);
		return this;
	}

	/**
	 * This method clicks on the next button.
	 * @return A new instance of ModalPage for method chaining.
	 */
	public ModalPage clickNextButton() {
		driver.findElement(By.xpath("//div[@class='label']")).click();
		return new ModalPage(driver);
	}
}

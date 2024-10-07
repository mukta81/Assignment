package com.staging.scrive.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.staging.scrive.base.BaseClass;

/**
 * ConfirmationPage class: actions that can be performed on the confirmation page of the application.
 */
public class ConfirmationPage extends BaseClass {

	private By confirmLocator = By.xpath("//h1[@class='follow']");

	public ConfirmationPage(ChromeDriver driver) {
		this.driver = driver;
	}

	/**
	 * Checks that the confirmation text displayed on the page matches the expected text.
	 * @param expectedText The text that is expected to be displayed in the confirmation element. 
	 */
	public void validateConfirmation(String expectedText) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(confirmLocator, expectedText));
		String returnedText = driver.findElement(confirmLocator).getText();

		Assert.assertEquals(returnedText, expectedText);

	}
}

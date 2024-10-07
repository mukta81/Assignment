package com.staging.scrive.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.staging.scrive.base.BaseClass;
import com.staging.scrive.utilities.Utilities;

/**
 * ModalPage class: actions that can be performed on the modal page of the application.
 */
public class ModalPage extends BaseClass {

	public ModalPage(ChromeDriver driver) {
		this.driver = driver;
	}

	/**
	 * Captures the screenshot of just the modal.
	 * @return The current instance of HomePage for method chaining.
	 */
	public ModalPage captureScreenshot() throws InterruptedException {
		String directory = "snaps/";

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement eleModal = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='main']/div[4]")));

		Utilities.takeScreenshot(driver, eleModal, directory);
		return this;
	}

	/**
	 * Click on Sign button to sign the document
	 * @return A new instance of ConfirmationPage for method chaining.
	 */
	public ConfirmationPage clickSignButton() {
		driver.findElement(By.xpath("//div[@class='label']")).click();
		return new ConfirmationPage(driver);
	}

}

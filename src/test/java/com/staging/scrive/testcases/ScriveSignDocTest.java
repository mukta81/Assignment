package com.staging.scrive.testcases;

import org.testng.annotations.Test;

import com.staging.scrive.base.BaseClass;
import com.staging.scrive.pages.HomePage;
import static com.staging.scrive.utilities.ReadProperties.*;

/**
 * This class contains test cases related to signing documents using the Scrive application.
 */
public class ScriveSignDocTest extends BaseClass{

	/**
	 * This test verifies that a user can successfully sign a document.
	 */
	@Test
	public void userCanSignDocumentSuccessfully() throws InterruptedException {
		new HomePage(driver)
		.enterFullName(readConfig("scrive.username"))
		.clickNextButton()
		.captureScreenshot()
		.clickSignButton()
		.validateConfirmation(readConfig("scrive.expectedtext"));

	}

}

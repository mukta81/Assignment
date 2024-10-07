package com.staging.scrive.utilities;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {

	/**
	 * This function generates a string of current Date and Time in the format MMddyyyyHHmm
	 */
	public static String getDateTime() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyyHHmm");

		return sdf.format(now);
	}

	/**
	 * This function takes a screenshot and save the file with current Date and Time appended in the format MMddyyyyHHmm.
	 */
	public static void takeScreenshot(WebDriver driver, WebElement element, String outputDir) {
		File screenshot = element.getScreenshotAs(OutputType.FILE);
		try {
			File outputDirectory = new File(outputDir);
			File outputFile = new File(outputDirectory, "screenshot" + getDateTime() + ".png");
			Files.copy(screenshot.toPath(), outputFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Screenshot taken" + outputFile.getAbsolutePath());
		} catch (Exception e) {
			System.out.println("Failed to take screenshot: " + e.getMessage());
		}

	}
}

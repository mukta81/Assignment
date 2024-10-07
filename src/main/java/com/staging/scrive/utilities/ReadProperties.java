package com.staging.scrive.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	private static Properties prop;

	/**
	 * This function reads the properties file Config.properties in src/test/java
	 */
	public static String readConfig(String key) {
		prop = new Properties();
		String returnedValue = null;
		try {
			prop.load(new FileInputStream(new File("src/test/resources/Config.properties")));
			returnedValue = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return returnedValue;
	}
}

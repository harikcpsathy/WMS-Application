package com.WMSapplication.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigureReader {

	public static Properties properties;
	  
	public static String propertyFilePath = System.getProperty("user.dir") +
			"\\src\\test\\java\\com\\WMSapplication\\resources\\configuration.properties";
	
	public ConfigureReader() {
		File file = new File(propertyFilePath);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		properties= new Properties();

		// load the properties file
		try {
			properties.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getBrowserName() {
		String browserName = properties.getProperty("browserName");
		if (browserName != null) {
			return browserName;
		} else {
			throw new RuntimeException("browser name not found in properties file");
		}
	}
	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitWait");
		if (implicitlyWait != null) {
			return Long.parseLong(implicitlyWait);
		} else {
			throw new RuntimeException("implicitlyWait not specified properties file.");
		}
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null) {
			return url;
		} else {
			throw new RuntimeException("url not specified in the Configuration.properties file.");
		}
	}

	
}


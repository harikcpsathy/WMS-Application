package com.WMSapplication.helper;



public class FilereaderManager {
	
	private static FilereaderManager filereaderManager = new FilereaderManager();
	private static ConfigureReader configFileReader ;

	private FilereaderManager() {
		
	}

	public static FilereaderManager getInstance() {
		return filereaderManager;
	}

	public ConfigureReader getConfigReader() {
		return (configFileReader == null) ? new ConfigureReader() : configFileReader;
	}

}

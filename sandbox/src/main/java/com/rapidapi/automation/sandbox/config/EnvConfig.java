package com.rapidapi.automation.sandbox.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EnvConfig {

	private static final String PROJECT_DIR = System.getProperty("user.dir");
	public static String browserType;
	public static int webDriverImplicitWaitInSeconds;
	
	public static void initialEnvConfig(){
		
		Properties prop = new Properties();
		FileInputStream input;
		
		try {
			input = new FileInputStream(PROJECT_DIR + File.separator + "resources" + File.separator + "EnvConfig.properties");
			prop.load(input);
			browserType = prop.getProperty("browserType");
			webDriverImplicitWaitInSeconds = Integer.parseInt(prop.getProperty("webDriverImplicitWaitInSeconds"));
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Resource File Not Found");
			e.printStackTrace();
		} catch (IOException e){
			System.out.println("Resource File Could Not Be Loaded");			
			e.printStackTrace();
		}		
	}
	
	public static boolean isRunningFromIDE() {
		return new File("pom.xml").exists();
	}
}

package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.class07.CommonMethods;

public class Task {
	
	//TC 1: OrangeHRM Login
    //Navigate to “https://opensource-demo.orangehrmlive.com/”
    //Login to the application
    //Verify user is successfully logged in
	//Note: must use properties file

    Properties app;
	
	@Test
	public void readFile() {
		
		String filePath="https://opensource-demo.orangehrmlive.com/";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			app=new Properties();
			app.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(app.getProperty("browser"));
		System.out.println(app.getProperty("url"));
		
		CommonMethods.setUpDriver(app.getProperty("browser"), app.getProperty("url"));
		CommonMethods.driver.quit();
	}
}

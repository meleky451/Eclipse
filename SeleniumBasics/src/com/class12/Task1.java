package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.class07.CommonMethods;

public class Task1 extends CommonMethods {
	
	
	//TC 1: OrangeHRM Login
    //Navigate to “https://opensource-demo.orangehrmlive.com/”
    //Login to the application
    //Verify user is successfully logged in
	//Note: must use properties file
	
Properties pro;
	
	@Test
	public void readFile() {
		
		String filePath="src/configs/credentials.properties";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			pro=new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(app.getProperty("browser"));
		//System.out.println(app.getProperty("url"));
		
		CommonMethods.setUpDriver(pro.getProperty("browser"), pro.getProperty("url"));
		//CommonMethods.driver.quit();
	
	
	
		sendText(driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")), "Admin");
		sendText(driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")), "admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
	

	
	
	
}}
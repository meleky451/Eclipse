package com.class11;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.class07.CommonMethods;

public class GoogleDemo extends CommonMethods {
	
public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://google.com");
		
		TakesScreenshot camera=(TakesScreenshot)driver;
		File selfie=camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(selfie, new File("/Users/eminyavuz/eclipse-workspace/TestBasic/melek/yigit.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Selfie not taken");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

	

package com.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		

	}

}

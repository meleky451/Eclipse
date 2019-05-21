package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://amazon.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println("Varify title " +title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronica, Apparel, Computers, Books, DVDs & more"));

		 
		    
	}

}

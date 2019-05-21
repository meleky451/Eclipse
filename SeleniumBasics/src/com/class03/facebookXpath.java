package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("melekyavuz_20@hotmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Melek2329070");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

}

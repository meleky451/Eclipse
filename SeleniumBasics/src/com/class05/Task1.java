package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static String userName = "standard_user";
	public static String password = "secret_sauce";

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userNameTxt = driver.findElement(By.xpath("//input[@id='user-name']"));
		userNameTxt.sendKeys("standard_user");
		
		//Thread.sleep(1000);
		//userNameTxt.clear();
		//userNameTxt.sendKeys(userName);
		WebElement pwdTxt = driver.findElement(By.xpath("//*[@placeholder = 'Password']"));
		
		//Thread.sleep(1000);
		//pwdTxt.clear();
		pwdTxt.sendKeys(password);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		boolean isDisplayed = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("WebOrder logo is displayed");
		} else {
			System.out.println("WebOrder logo is NOT displayed");
		}

	}

}

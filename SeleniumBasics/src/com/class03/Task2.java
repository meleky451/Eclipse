package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Melek");
		driver.findElement(By.name("lastName")).sendKeys("Yavuz");
		driver.findElement(By.name("phone")).sendKeys("+123456789");
		driver.findElement(By.id("userName")).sendKeys("meleky451@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("17 Ballinger way");
		driver.findElement(By.name("address2")).sendKeys("Amazing house");
		driver.findElement(By.name("city")).sendKeys("MountLaurel");
		driver.findElement(By.name("state")).sendKeys("New Jersey");
		driver.findElement(By.name("postalCode")).sendKeys("08054");
		driver.findElement(By.name("country")).click();
        driver.findElement(By.name("email")).sendKeys("meleky451");
		driver.findElement(By.name("password")).sendKeys("abcde1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("abcde1234");
		driver.findElement(By.name("register")).click();
		
		

	}

}

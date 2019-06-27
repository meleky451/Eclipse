package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.class07.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
		
		setUpDriver("chrome","https://www.saucedemo.com" );
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.cssSelector("input#password"))).perform();
		Thread.sleep(2000);
		driver.close();

	}

}

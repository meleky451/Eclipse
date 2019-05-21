package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		String valueToSelect = "Years of Experience";
		List<WebElement> yearsRadio = driver.findElements(By.name("exp"));

		System.out.println(yearsRadio.size());
		for (WebElement years : yearsRadio) {
			years.click();
			Thread.sleep(700);
			System.out.println(years.isSelected());
		}

		Thread.sleep(6000);
		driver.quit();
	}
}

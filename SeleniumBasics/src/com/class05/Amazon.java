package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=links.iterator();
		int count=0;
		while(it.hasNext()) {
			WebElement link=it.next();
			String LinkText=link.getText();
			if(!LinkText.isEmpty()) {
				System.out.println(LinkText);
				
				count++;
			}
		}
		System.out.println("number of links is" +count);
		driver.quit();
		

	}

}

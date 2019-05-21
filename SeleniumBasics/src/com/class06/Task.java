package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		
		//TC 1: Amazon Department List Verification
		//Open chrome browser
		//Go to “http://amazon.com/”
		//Verify how many department options available.
		//Print each department
		//Select Computers
		//Quit browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com");
		
		WebElement department = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(department);
		List<WebElement> allOptions=select.getOptions();
		System.out.println("all Department="+allOptions.size());
		
		Iterator<WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String departments=it.next().getText();
			System.out.println(departments);
		}
		
		select.selectByVisibleText("computer");
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}

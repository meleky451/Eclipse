package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
	        WebDriver driver = new ChromeDriver();
	
	        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
	        driver.findElement(By.id("customer.firstName")).sendKeys("melek");
	         Thread.sleep(2000);
	        driver.findElement(By.name("customer.lastName")).sendKeys("Yavuz");
	         Thread.sleep(2000);
	        driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
	         Thread.sleep(2000);
	        driver.findElement(By.id("customer.address.city")).sendKeys("mountLaurel town");
	         Thread.sleep(2000);
	        driver.findElement(By.id("customer.address.state")).sendKeys("NJ"); 
	        Thread.sleep(2000);
	        driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-0000");
	         Thread.sleep(2000);
	        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
	         Thread.sleep(2000);
	        driver.findElement(By.id("customer.username")).sendKeys("melek1");
	         Thread.sleep(2000);
	        driver.findElement(By.id("customer.password")).sendKeys("mustafa10");
	         Thread.sleep(2000);
	        driver.findElement(By.id("repeatedPassword")).sendKeys("mustafa10");
	         Thread.sleep(2000);
	        driver.findElement(By.className("button")).click();
	 
	}

}

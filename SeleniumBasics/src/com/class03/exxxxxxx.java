package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exxxxxxx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("html/body/div/div[4]/form/div[2]/div/div/div/div/input[@class='gLFyf gsfi']")).sendKeys("Naber Lan Kamil");
		try {
		    Thread.sleep(1200);
		} catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		driver.findElement(By.xpath("html/body/div/div[4]/form/div[2]/div/div[3]/center/input[@class='gNO89b']")).click();
		Thread.sleep(1500);    

		driver.findElement(By.xpath("html/body/div[8]/div[3]/div[10]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/a/h3[@class='LC20lb']")).click();
		Thread.sleep(1400);    
		driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/input[@type='email']")).sendKeys("synatxtech@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input[@type='password']")).sendKeys("Instagram(1234)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1133);
		driver.findElement(By.id("reg-link")).click();
		driver.findElement(By.name("firstname")).sendKeys("melek");//iv[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/input[@type='email']")).sendKeys("synatxtech@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("abla");//iv[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/input[@type='email']")).sendKeys("synatxtech@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("seni cok seviyom");//iv[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/input[@type='email']")).sendKeys("synatxtech@gmail.com");
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[8]/div[3]/div[10]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/a/h3[@class='LC20lb']")).click();
		Thread.sleep(1400);    
		driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td/input[@type='email']")).sendKeys("synatxtech@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input[@type='password']")).sendKeys("Instagram(1234)");
		Thread.sleep(1000);


	}

}

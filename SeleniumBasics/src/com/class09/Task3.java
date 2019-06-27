package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.class07.CommonMethods;

public class Task3 extends CommonMethods {
	
	 public static void main(String[] args) {
	        setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	        
	        driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
	        driver.findElement(By.xpath("//button[text()='Enable']")).click();
	        WebDriverWait wait=new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
	        
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	        driver.findElement(By.xpath("//button[text()='Disable']")).click();
	        
	        WebElement elm= driver.findElement(By.xpath("//p[@id='message']"));
	        if(elm.isDisplayed()) {
	            System.out.println(elm.getText());
	        }else {
	            System.out.println("no text");
	        }}}



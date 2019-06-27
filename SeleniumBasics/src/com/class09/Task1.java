package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.class07.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		
		//TC 1: Verify element is present
		//Open chrome browser
		//Go to “https://the-internet.herokuapp.com/”
		//Click on “Click on the “Dynamic Loading” link
		//Click on “Example 1...” and click on “Start”
		//Verify element with text “Hello World!” is displayed
		//Close the browser
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		WebElement elm = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

		if (elm.isDisplayed()) {
		    String text=elm.getText();
		    System.out.println(text);
		}else {
		    System.out.println("Element is not displayed");
		}
		driver.quit();

	}

}

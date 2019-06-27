package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.class07.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		
//      Navigate to https://www.toolsqa.com
//      Hover over the Tutorial menu
//      Click on Software Testing Tutorial
//      Close the browser
		
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hoverOver = driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
		Actions action= new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
	}

}

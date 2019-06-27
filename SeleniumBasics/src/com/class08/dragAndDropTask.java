package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.class07.CommonMethods;

public class dragAndDropTask extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		setUpDriver("chrome", "https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();


	}

}

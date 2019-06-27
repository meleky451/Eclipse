package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.class07.CommonMethods;

public class DragAndDropTask2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// Task Two
		//Ahead to http://uitestpractice.com/Students/Index
		//Click on the Actions
		//Handle the drag and drop
		//Close the browser
		
		
		setUpDriver("chrome","http://demo.guru99.com/test/simple_context_menu.html" );
		WebElement rightClick= driver.findElement(By.cssSelector("input#user-name"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
		Thread.sleep(2000);
		driver.close();

	}

}

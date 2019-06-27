package Hazirlik;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.class07.CommonMethods;

public class EkCalisma2 extends CommonMethods {
	static String uyari="You double clicked me.. Thank You..";


	public static void main(String[] args) {
		
		setUpDriver("chrome", "http://demo.guru99.com/test/simple_context_menu.html");
	    WebElement rightclick= driver.findElement(By.xpath("//span[text()='right click me']"));
	    Actions melek=new Actions(driver);
	    melek.contextClick(rightclick).perform();
	    
	    WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions musti=new Actions(driver);
	    musti.doubleClick(doubleclick).perform();
	    
	    
	    Alert arif=driver.switchTo().alert();
	if(uyari==arif.getText()) {
	    System.out.println("dogru");
	}else {
	    System.out.println("yanlis");
	}
	    arif.accept();
	    
	    
	 
	}

}

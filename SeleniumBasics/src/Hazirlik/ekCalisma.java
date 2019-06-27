package Hazirlik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.class07.CommonMethods;

public class ekCalisma  extends CommonMethods{
	
	public static void main(String[]args) {
		
		 setUpDriver("chrome", "http://demo.guru99.com/test/drag_drop.html");
		    
		    WebElement fiyat1 =driver.findElement(By.xpath("//li[@class='block13 ui-draggable'][1]"));
		    WebElement fiyat2 =driver.findElement(By.xpath("//li[@class='block13 ui-draggable'][2]"));
		    
		    WebElement hedef1=driver.findElement(By.cssSelector("ol#amt7"));
		    WebElement hedef2=driver.findElement(By.cssSelector("ol#amt8"));
		    
		    
		    Actions action=new Actions(driver);
		    action.dragAndDrop(fiyat1, hedef1).perform();
		    action.dragAndDrop(fiyat2, hedef2).perform();
		    
		    
		    WebElement kisi=driver.findElement(By.xpath("//li[@data-id='5']"));
		    WebElement kisi2=driver.findElement(By.xpath("//li[@data-id='6']"));
		    
		    WebElement yer1=driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
		    WebElement yer2=driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		    
		    Actions musti=new Actions(driver);
		    musti.clickAndHold(kisi);
		    musti.moveToElement(yer1);
		    musti.click().build().perform();
		    
		    Actions melek=new Actions(driver);
		    melek.clickAndHold(kisi2);
		    melek.moveToElement(yer2);
		    melek.click().build().perform();
		}
		
	}



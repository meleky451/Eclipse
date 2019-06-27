package Hazirlik;

import org.openqa.selenium.By;

import com.class07.CommonMethods;

public class Ebay extends CommonMethods {
	public static void main(String[] args) {
		
	
	String url="https://www.ebay.com";
	setUpDriver("chrome", url);
	 driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
     sendText(driver.findElement(By.xpath("//*[@id=\"firstname\"]")), "Melek");
     sendText(driver.findElement(By.xpath("//*[@id=\"lastname\"]")), "Yavuz");
     sendText(driver.findElement(By.xpath("//*[@id=\"email\"]")), "melekyavuz@gmail.com");
     sendText(driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")), "Melek232907023");
     driver.findElement(By.xpath("//*[@id=\"showPASSWORD\"]/ul/li/span[1]/input")).click();
     driver.findElement(By.xpath("//*[@id=\"ppaFormSbtBtn\"]")).click();
     
    driver.findElement(By.xpath("//*[@id=\"gh-shop-a\"]")).click();
     
}
}
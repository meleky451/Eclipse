package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class07.CommonMethods;

public class Task2 extends CommonMethods {
	
	public static void main(String[]args) throws InterruptedException {
		
		
		//Open chrome browser
		//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		//Login to the application
		//Verify customer “Susan McLaren” is present in the table
		//Click on customer details
		//Update customers last name
		//Verify updated customers name is displayed in table
		//Close browser
		
		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
        CommonMethods.setUpDriver("chrome", url);
        driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
        String expectedValue = "Susan McLaren";

        for (int i = 1; i <= rows.size(); i++) {
            String rowText = "";
            try {
                rowText = driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[" + i + "]"))
                        .getText();
            } catch (Exception e) {
                System.out.println("buraya geldi 1");
            }

            if (rowText.contains(expectedValue)) {
                try {
                    driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[" + i + "]/td[13]")).click();
                    break;
                } catch (Exception e) {
                    System.out.println("buraya geldi 2");
                }
//                break;
            }
        }
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_txtName\']")).clear();
        driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_fmwOrder_txtName\']")).sendKeys("Susan Sarandon");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
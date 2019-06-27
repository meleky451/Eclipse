package Hazirlik;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class07.CommonMethods;

public class TestCase3 extends CommonMethods   {
	public static void main(String[] args) {
		
	
	//TC 1: Table headers and rows verification1.Open chrome browser
	//2.Go to “https://jqueryui.com/”
	//3.Click on “Datepicker”
	//4.Select August 10 of 2019
	//5.Verify date “08/10/2019” has been entered succesfully
	//6.Close browser
	
		 setUpDriver("chrome", "https://jqueryui.com");
	      driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
	        String Day= "10";
	        String Date = "08/10/2019";
	        switchToFrame(0);
	        driver.findElement(By.cssSelector("#datepicker")).click();
	        while (true) {
	            if (driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().equals("August")) {
	                // get all cells
	                List<WebElement> cells = driver
	                        .findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	                for (WebElement cell : cells) {
	                    // get text of each cell
	                    String cellText = cell.getText();
	                    if (cellText.equals(Day)) {
	                        cell.click();
	                    }
	                }
	                break;
	            } else {
	                driver.findElement(By.xpath("//span[text()='Next']")).click();
	            }

	        }
	        String actualDate=driver.findElement(By.cssSelector("#datepicker")).getAttribute("value");
	        if(actualDate.equals(Date)) {
	            System.out.println(Date );
	        }else {
	            System.out.println(Date + "  " + actualDate );
	                    
	        }
	        driver.switchTo().defaultContent();

	       driver.quit();
	    }
	}
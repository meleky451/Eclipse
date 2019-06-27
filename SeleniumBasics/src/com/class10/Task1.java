package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class07.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TC 1: Table headers and rows verification

         //Open chrome browser
        //Go to “https://the-internet.herokuapp.com/”
          //Click on “Click on the “Sortable Data Tables” link
         //Verify tables consist of 4 rows and 6 columns
        //Print name of all column headers
        //Print data of all rows
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		
		List <WebElement> rows=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println(+rows.size());
		
		for(WebElement row:rows) {
			System.out.println(row.getText());
			
			
		}
		List <WebElement> cols=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		System.out.println(cols.size());
		

		Iterator<WebElement> it=cols.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next().getText());
		}

		Thread.sleep(3000);
		driver.quit();
		
		

	}

}

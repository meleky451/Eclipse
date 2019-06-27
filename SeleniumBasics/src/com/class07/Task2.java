package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class Task2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	       driver.findElement(By.xpath("//a[starts-with(text(),'Multiple')]")).click();
	       String parentID=driver.getWindowHandle();
	       driver.findElement(By.xpath("//a[starts-with(text(),'Elemental')]")).click();
	       Thread.sleep(1000);
	        Set<String>ids=driver.getWindowHandles();
	        Iterator<String> it=ids.iterator();
	        String childID="";
	        while(it.hasNext()) {
	            String ID=it.next();
	            if(!parentID.equals(ID)) {
	                childID=ID;
	                }
	            }
	        Thread.sleep(2000);
	        String Title=driver.switchTo().window(childID).getTitle();
	        String expectedTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
	        if(Title.equalsIgnoreCase(expectedTitle)) {
	        
	            System.out.println(expectedTitle+" is  expected title");
	        }else {
	            System.out.println("It is Not expected title");
	        }
	        Thread.sleep(1000);
	        driver.close();
	        
	        driver.switchTo().window(parentID);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[starts-with(text(),'Click')]")).click();
	        Thread.sleep(1000);
	        ids=driver.getWindowHandles();
	        it=ids.iterator();
	        while(it.hasNext()) {
	            String ID=it.next();
	            if(!parentID.equals(ID)) {
	                childID=ID;
	            }
	        }
	        Thread.sleep(2000);
	        Title=driver.switchTo().window(childID).getTitle();
	        expectedTitle="New Window";
	        if(Title.equalsIgnoreCase(expectedTitle)) {
	            System.out.println("'New Window' is the correct title");
	        }else {
	            System.out.println("it is Not the expected  title ");
	        }
	        driver.close();
	        
	        
	        
	        driver.switchTo().window(parentID);
	        Thread.sleep(2000);
	        expectedTitle="The Internet";
	        Title=driver.switchTo().window(parentID).getTitle();
	        Thread.sleep(3000);
	        if(Title.equalsIgnoreCase(expectedTitle)) {
	            System.out.println("'The Internet' is the correct title");
	        }else {
	            System.out.println("it is Not the expected  title ");
	        }
	        Thread.sleep(2000);
	        driver.quit();
	      
	    }

	}



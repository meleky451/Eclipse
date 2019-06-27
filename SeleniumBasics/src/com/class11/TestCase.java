package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.class07.CommonMethods;

public class TestCase extends CommonMethods {
	
	static String expected="File uploaded!";

	public static void main(String[] args) {
		//TC 1: Upload file and Take Screenshot

         //Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
         //Upload file
          //Verify file got successfully uploaded and take screenshot
		
        String url= "setUpDriver(\"chrome\", url);";
        setUpDriver("chrome", url);
		
		String filePath="/Users/eminyavuz/Dowloads/car.jpg";
		driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);
		driver.findElement(By.xpath("//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div/table/tbody/tr[4]/td/button")).click();
        String textActual=getAlertText();
        
        if (textActual.equals(expected)) {
        	System.out.println("File is uploaded");
        }else {
        	System.out.println("File is NOT uploaded");
        }
        
        acceptAlert();
        
        TakesScreenshot ts=(TakesScreenshot)driver;
        File scr=ts.getScreenshotAs(OutputType.FILE);
        
        try {
			FileUtils.copyFile(scr, new File("screenshots/WebTool/Upload.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to take screesnhot");
		}
        
        driver.quit();
	

        
        
  
        
       
	}

}

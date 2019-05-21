package Hazirlik;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Halime6DersTask {

	public static void main(String[] args) {
		       //TC 2: Select and Deselect values
				//Open chrome browser
				//Go to “http://uitestpractice.com/”
				//Click on “Select” tab
				//Verify how many options available in the first drop down and then select “United states of America”
				//Verify how many options available in the second drop down and then select all.
				//Deselect China from the second drop down
				//Quit browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");
		
		
        driver.findElement(By.partialLinkText("Select")).click();
        Select obj;
        List<WebElement>list;
        
        WebElement country=driver.findElement(By.cssSelector("#countriesSingle"));
        obj=new Select(country);
        list=obj.getOptions();
        System.out.println(list.size());
        
        WebElement countries=driver.findElement(By.cssSelector("#countriesMultiple"));
        obj=new Select(countries);
        list=obj.getOptions();
        System.out.println(list.size());
        
        for(int i=0; i<list.size();i++) {
            obj.selectByIndex(i);
            
        }
        obj.deselectByVisibleText("China");
        driver.quit();
    }
	}



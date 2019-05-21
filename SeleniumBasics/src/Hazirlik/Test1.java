package Hazirlik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		
		    driver.get("https://www.toolsqa.com/automation-practice-form/");
		    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Melek");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Yavuz");
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("input#sex-1")).click();
		    driver.findElement(By.xpath("//input[contains(@id,'exp-3')]")).click();
		    driver.findElement(By.cssSelector("input#datepicker")).sendKeys("5/18/2019");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[starts-with(@value,'Au')]")).click();
		    driver.findElement(By.cssSelector("input[id='tool-2']")).click();
		    driver.findElement(By.cssSelector("select#continents")).click();
		    Select Continents=new Select(driver.findElement(By.cssSelector("select#continents")));
		    Continents.selectByVisibleText("Africa");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[31]/p")).click();
		    driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[3]")).click();
		    driver.findElement(By.xpath("html/body/div/div[5]/div[2]/div/div/div/div/div/div/div[2]/div/form/fieldset/div[34]/div/button[@id='submit']")).click();


		
		

	}

}

package Hazirlik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tekrar {
	
	static String username="Tester";
	static String psswrd="test";

	public static void main(String[] args) throws InterruptedException {
		int count=0;
		
		System.setProperty("webdriver.chrome.driver", "/Users/eminyavuz/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        WebElement userName= driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        userName.sendKeys("Melek");
        Thread.sleep(3000);
        userName.clear();
        userName.sendKeys(username);
        WebElement password=driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));
        password.sendKeys(psswrd);
        WebElement login= driver.findElement(By.cssSelector("input[value='Login']"));
        login.click();
        boolean melek= driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
        if(melek) {
            System.out.println("logo var de");
        }else {
            System.out.println("logo yok de");
        }
        WebElement musti=driver.findElement(By.cssSelector("div.login_info"));
    
        if(musti.getText().contains(username)) {
            System.out.println("var abi");
        }else {
            System.out.println("yok abla");
        }

	}

}

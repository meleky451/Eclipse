package com.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverDriver {

	
		public static WebDriver driver;

		public static void setUpDriver(String browser, String url) {
			if (browser.equalsIgnoreCase("chrome")) {
				// For mac
				System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
				// for windows
				// System.setProperty("webdriver.chrome.driver",
				// "src/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver");
				driver = new FirefoxDriver();
			} else {
				System.out.println("browser given is wrong");
			}
			//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().fullscreen();
			driver.get(url);
			
		}
	





	}



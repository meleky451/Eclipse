package class5;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.CommonMethods;

public class demoTest extends CommonMethods{
	
	@Parameters({"browser"})
	@Test
	public void testCrossBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		setUpDriver(browser, "https://www.saucedemo.com/");
		sendText(driver.findElement(By.cssSelector("input#user-name")),"standard_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			setUpDriver(browser, "https://www.saucedemo.com/");
			sendText(driver.findElement(By.cssSelector("input#user-name")),"standard_user");
			sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
			driver.findElement(By.cssSelector("input.btn_action")).click();	
		}

	}}
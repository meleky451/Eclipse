package class2;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utill.CommonMethods;

public class Task1 extends CommonMethods {
	
	//TC 1: OrangeHRM Title Validation
	//TC 2: OrangeHRM Successful Login 
	//https://opensource-demo.orangehrmlive.com/
	//Please make sure to use the following:
	//annotations:
	//@BeforeMethod
	//@AfterMethod
	//@Test

	//What would you do if you do not want to execute any specific test case?
	//What would you do if you want to execute any specific test case first?
	
	
	@BeforeMethod
	
	public void first() {
		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		
	}
	@Test(priority=1)
	public void Title(){
		String Title=driver.getTitle();
		String title="OrangeHRM";
		if(Title.equalsIgnoreCase(title)) {
			System.out.println("right title");
		}else {
			System.out.println("wrong title");
		}
	}
	@Test(priority=2)
	
	public void Login() {
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
	}
	 @AfterMethod
	    public void close() {
	        driver.close();
	    }

}

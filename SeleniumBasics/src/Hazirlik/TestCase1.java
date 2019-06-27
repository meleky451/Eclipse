package Hazirlik;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class07.CommonMethods;

public class TestCase1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TC 1: Users Application Form Fill1.
		//Open chrome browser2.Go to “http://uitestpractice.com/”3.
		//Click on “Forms” link4.
		//Fill out the entire form5.
		//Close the browserMUST USE Functions:
		
		String url="http://uitestpractice.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a")).click();
		String valueToSelect = "Years of Experience";
		List<WebElement> yearsRadio = driver.findElements(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[2]/input"));
		System.out.println(yearsRadio.size());
		for (WebElement years : yearsRadio) {
			years.click();
			Thread.sleep(700);
			System.out.println(years.isSelected());
		}

		Thread.sleep(6000);
		driver.quit();
	}

}

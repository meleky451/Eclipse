package com.class09;

import com.class07.CommonMethods;

public class DriverTest extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("chrome", "http://google.com");
		driver.quit();
		
	}

}

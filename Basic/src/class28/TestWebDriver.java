package class28;

public class TestWebDriver {

	public static void main(String[] args) {
		
		
		WebDriver test=new ChromeDriver();
		test.openBrowser();
		test.closeBrowser();
		test.findElement();
		test.maximizeWindow();
		
		
		
		WebDriver test1=new FirefoxDriver();
		test1.openBrowser();
		test1.closeBrowser();
		test1.findElement();
		test1.maximizeWindow();
	}

}

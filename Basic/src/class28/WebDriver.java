package class28;

public interface WebDriver {
	
	/*Create a WebDriver Interface that will have the following unimplemented behaviour:
	 *  openBrowser(), closeBrowser(), maximizeWindow(), findElement().
	 *   Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
	 */
	
	public void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}	

class ChromeDriver implements WebDriver{

	@Override
	public void closeBrowser() {
		System.out.println("Chrome close browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Chrome find element");
	}

	

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome maximize window");
		
	}

	@Override
	public void openBrowser() {
		System.out.println("Chrome Open Browser");
		
	}	
	}
class FirefoxDriver implements WebDriver{

		@Override
		public void closeBrowser() {
			System.out.println("Firefox close browser");
		}

		@Override
		public void openBrowser() {
			System.out.println("Firefox openBrowser");
			
		}

		@Override
		public void maximizeWindow() {
			System.out.println("Firefox maximizeWindow");
			
			
		}

		@Override
		public void findElement() {
			System.out.println("FireFox findElement");
			
			
		}
			
		

		
}



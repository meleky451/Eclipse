package class4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.CommonMethods;

public class ParameterExampleTwo extends CommonMethods {
	
	@Parameters({"browser","url"})
	@Test
	public void testGoogle(String browser, String url) {
		setUpDriver(browser, url);
	}


}

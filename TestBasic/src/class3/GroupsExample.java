package class3;

import org.testng.annotations.Test;

public class GroupsExample {
	@Test(groups ="Smoke")
	public void one() {
		System.out.println("testOne");
	}

	@Test(groups ="Regression")
	public void Two() {
		System.out.println("testTwo");
	}

	@Test(groups = {"Smoke","Regression"})
	public void Three() {
		System.out.println("testThree");
	}

	@Test(groups ="Regression")
	public void Four() {
		System.out.println("testFour");
	}

}

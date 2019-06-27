package com.class08;

public class BreakContinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		for (int g=0; g<=4; g++) {
			System.out.println("Hello");//1, 4, 5, 
			break;
		}
		
		

	}
}

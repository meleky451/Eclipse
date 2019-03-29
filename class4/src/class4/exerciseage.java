package class4;

import java.util.Scanner;

public class exerciseage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("kac yasinda");

		int age = input.nextInt();

		if (age > 18) {
			System.out.println("older");
		} else {
			System.out.println("young");

		}

	}
}

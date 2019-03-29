package Class5;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		/*
		 * Ask user to enter price and boolean value for sale
		 * Based on the sake we will check price:
		 * if price<20-->apply discount 20% and give final price
		 * If price is >20 less 100--->apply discount 30%  and give final price
		 * If price is >100 less 1500--->apply discount 50%  and give final price
		 */
		
		Scanner scan;
		boolean sale;
		int discount;
		int price;
		double finalPrice;
		
		scan =new Scanner (System.in);
		System.out.println("Please enter if there is a sale");
		sale=scan.nextBoolean();
		System.out.println("Please enter price of the item");
		price=scan.nextInt();
		
		if(sale) {
			
		System.out.println("Let's check all discount");
		
		if (price<20) {
			discount=20;
			finalPrice=price-(price*0.2);
			
			}else if (price>=20 && price<100) {
				discount=30;
				finalPrice=price-(price*0.3);
				
			}else if (price>=100 && price<500) {
				discount=50;
				finalPrice=price-(price*0.5);
		}else {
				discount=75;
						finalPrice=price-(price*0.75);
		}
		System.out.println("Final price is " +finalPrice);				
			}else {
				System.out.println("Not Interested");
			}
		
		
		}
		
		
	}



package Class14;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*1/ Write a program to swap 2 numbers without a temporary variable? 
		 * Swap  2 strings without a temporary variable?
		 * 
		 * 2/Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 * 
		 * 3/ Find out how many alpha characters present in a string?
		 * 
		 * 4/How to find out the part of the string from a string? What is substring?
		 * Find number of words in string?
		 * 
		 * 5/ Write a java program to reverse String? Reverse a string word by word?
		 * 
		 * 6/Write a Java Program to find whether a String is palindrome or not?
		 * 
		 * 7/Write a java program to check whether a given number is prime or not?
		 * 
		 * 8/Write a Java Program to print first 10 numbers of Fibonacci series.
		 * 
		 */
		
		
		//1/ Write a program to swap 2 numbers without a temporary variable?  Swap  2 strings without a temporary variable?
		
		int a=10;
		int b=20;
		a=a+b;
		
		
		b=a-b;
		System.out.println("b=" +b);
		a=a-b;
		System.out.println("a=" +a);
		
		
		String str1="Hello";//5
		String str2="World";//5
		
		str1=str1+str2; //HelloWorld
		str2=str1.substring(0, str1.length()-str2.length()); //Hello
		str1=str1.substring(str2.length());
		
		System.out.println(str1+str2);
		
		
		
		
		
		
		
		
		
		
		
        
		
		// 2- Write a java program to find the second largest number in the array maximum and minimum number in the array?

           int arr[] = { 1000, 46, 1, 86, 292, 2 };
        
        int min = arr[0];//0
        int secondLargest = 0;//0
        int largest = 0;//0
        
        for(int k: arr) {
            if(k>largest) {
                largest =k;
            }
            if(k < min) {
                min = k;
            }
        }
        for(int k : arr) {
            
            if(a> secondLargest && a <largest) {
                
                secondLargest = a;
            }
        }
        System.out.println("min = " + min);
        System.out.println("Second Largest =" + secondLargest);

        System.out.println("Largest = " + largest);
       
        
        
        //3- Find out how many alpha characters present in a string?
        
          String str="Find out how many alpha characters present in a string?";
        
        String array=str.replaceAll("[^A-Za-z]","");
        System.out.println(array.length());
        		
        //5- Write a java program to reverse String? Reverse a string word by word?
        
        
        String sentence="The master is speaking ";
		String reverse="";
		
		   for (int i=sentence.length()-1;i>=0;i--) {
			reverse=reverse+sentence.charAt(i);
		}
		String[] words=reverse.split(" ");
		    for(int i=words.length-1; i>=0;i--) {
			System.out.print(words[i]+" ");
		    }
		    
		    
        //6-6/Write a Java Program to find whether a String is palindrome or not?(dad, mom,madam)
        
       
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter any word to check if it a palidrome!");
        String word=scan.nextLine();
        
        String name="";
        
        for(int i=word.length()-1; i>=0; i--) {
        	name+=word.charAt(i);
        }
        if (word.equalsIgnoreCase(name)) {
        	System.out.println("The word is palidrome");
        }else {
        	System.out.println("The word is not a palidrome");
        }
        
        //7/Write a java program to check whether a given number is prime or not?
        
        
        int number;
        Scanner input= new Scanner(System.in);
        System.out.println("Please ente a number to chck it is");
        number=input.nextInt();
        boolean prime= true;
         for(int p = 2; p<number; p++) {
        if(number % p !=0) {
        	
        	
        }else {
        	prime=false;
        }
        	
        }
        
      System.out.println(prime);
      
      //8=8/Write a Java Program to print first 10 numbers of Fibonacci series.
        
        int m=1;
        int n=0;
        int d=0;
        
        for(int i=0; i<10; i++) {
            d=m+n;
            m=n;
            n=d;
            System.out.print(n+" ");
        }
        
	

	}}



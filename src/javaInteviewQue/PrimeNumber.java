package javaInteviewQue;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrimeNumber (int num){

		
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
	return true;
		
	}
	
	public static void getPrimeNumber(int num) {
		for(int i=2;i<=num;i++) {
		if(isPrimeNumber(i))
			System.out.print(i+"  ");
		
		}
	}

	public static void main(String[] args) {
		
      System.out.println("2 is prime no:"+ isPrimeNumber(2));
      System.out.println("12 is prime no:"+ isPrimeNumber(12));
      System.out.println("20 is prime no:"+ isPrimeNumber(20));
      System.out.println("45 is prime no:"+ isPrimeNumber(45));
      System.out.println("19 is prime no:"+ isPrimeNumber(19));
		System.out.println();
		
		// taking input from user
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		System.out.println(n+ " is prime:"+ isPrimeNumber(n));*/
		
		getPrimeNumber(100);
		System.out.println(":->up to 100");
		System.out.println();
		getPrimeNumber(10);
		System.out.println(":->up to 10");
		System.out.println();
		getPrimeNumber(30);
		System.out.println(":->up to 30");
		System.out.println();
		getPrimeNumber(50);
		System.out.println(":->up to 50");
	}

}

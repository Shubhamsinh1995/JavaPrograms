package javaInteviewQue;

public class FactorialNumber {
	
	// Using For loop
	public static int factorial(int num) {
		System.out.print("factorial of "+num+" is:");
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			//System.out.print(fact+"*");
		}
		return fact;
	}
	
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return (num*fact(num-1)); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****using for loop*****");
		System.out.println(factorial(5));
		System.out.println(factorial(4));
		System.out.println(factorial(6));
		System.out.println();
		
		System.out.println("**** using Recursive function*****");
		System.out.println("factorial of 3 is:"+fact(3));
		System.out.println("factorial of 4 is:"+fact(4));
		System.out.println("factorial of 5 is:"+fact(5));
	}

}

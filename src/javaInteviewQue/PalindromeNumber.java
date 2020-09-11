package javaInteviewQue;

public class PalindromeNumber {
	
	public static void isPalindromeNumber(int num) {
		System.out.print("Given number "+num+" is");
		int r=0;
		int sum=0;
		int temp;
		
		temp=num;
		
		while(num>0) {
			r=num%10;  //get the remainder
			sum=(sum*10)+r;
			num=num/10;
		}		
		 if(temp==sum)
			 System.out.print("  palindrome");
		 else
			 System.out.print(" not palindrome ");
	
	}
		
		
	public static void main(String[] args) {
		
		isPalindromeNumber(151);
		System.out.println();
		isPalindromeNumber(2324);
		System.out.println();
		isPalindromeNumber(78987);
        System.out.println();
        isPalindromeNumber(12321);
	}

}

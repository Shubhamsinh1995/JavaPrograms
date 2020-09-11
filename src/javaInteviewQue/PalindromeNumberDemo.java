package javaInteviewQue;

public class PalindromeNumberDemo {
	
	public static void isPalindrome(int num) {
		
		int r;
		int sum=0;
		int t;
		t=num;
		
		while(num>0) {
			r=num % 10;   // this gives remainder  i.e 1, 5, 1
			sum=(sum * 10) + r; // 1, 15, 151
			num=num /10;        // 15, 1, 0
		}
		//System.out.println("reverse of num is "+sum);
	
		
		if(t==sum) {
			System.out.println("  palindrome number");
		}
		else {
			System.out.println("  not palindrome number");
		}
	}

	public static void main(String[] args) {
		isPalindrome(151);

	}

}

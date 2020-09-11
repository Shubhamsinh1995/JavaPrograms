package javaInteviewQue;

public class ReverseIntegerDemo {

	public static void main(String[] args) {
	
		int num=76543;
		long rev=0;
		
		while(num !=0) {
			long n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
         System.out.println("Reversed number is "+rev);
         
         System.out.println("-------------------------------");
         
         // By using StrinBuffer and reverse() method
         long num2=12345;
         System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
	}

}

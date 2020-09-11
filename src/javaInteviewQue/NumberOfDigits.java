package javaInteviewQue;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		long num=2345748;
		int count=0;
		
		while(num != 0) {
			num= num/10;
			count++;
		}
     System.out.println("No of Digits present in  num is : "+count);
	}

}

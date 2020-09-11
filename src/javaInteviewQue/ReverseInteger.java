package javaInteviewQue;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**method 1**");
		long num=12345;
		long rev=0;// 5, 54, 543, 5432,54321
		
		while(num!=0) {
			long n= num%10;
			rev=rev*10 + n;  //5,4,3,2,1  
			num=num/10;     // 1234,123,12,1
		}
		System.out.println("Reverse No: "+rev);  // 54321
		System.out.println();
		
		System.out.println("**method 2**");
		long num2=6789;
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse()); //54321
	}

}

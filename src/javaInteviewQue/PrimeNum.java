package javaInteviewQue;

public class PrimeNum {

	public static void main(String[] args) {
		
		int num=9;
		int flag=0;
		for(int i=2;i<num/2;i++) // here i=2, because lowest prime num is 2
		{
		if(num%i==0) {
			flag=1;
		}
	}
		if(flag==0) {
			System.out.println(num+" is prime number");
		}
		else{
			System.out.println(num+" is not prime number");
		}

	}

}

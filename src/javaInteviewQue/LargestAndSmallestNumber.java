package javaInteviewQue;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {3,8,54,2,78,59};
		
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]>largest)
				largest=num[i];
			else if(num[i]<smallest)
				smallest=num[i];
		}
		System.out.println("given array is:"+Arrays.toString(num));
		System.out.println(smallest+" is the smallest number");
		System.out.println(largest+" is the largest number ");

	}

}

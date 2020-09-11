package javaInteviewQue;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		// square of 2 is 2*2=4, square of 4 is 4*4=16
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=0;
		result=num*num;
		System.out.println("Square of "+num+": "+result);
        System.out.println("------------------------------");
       
        // To check given number is perfect square or not
        
        System.out.println("Enter number of your choice");
        double num1=sc.nextDouble();
        double res=0;
        for(int i=1;i<num1;i++) {
        	if(i*i==num1) {
        		 res=num1;
        		System.out.println("Perfect Square of "+ res+": "+i);
        	}	
       }
        if(res!=num1) {
    		System.out.println(num1+" not perfect square");	
        }
        
	}

}

package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
      
		// Unchecked Exception :-> Cannot handled by compiler
//		int i=9/0;
//		System.out.println(i);
		
		// Checked Exception :-> Handled by compiler
//		Thread.sleep(2000);
		
	//	1. try-catch block
	    int i=6;
	    int j=0;
		try {
			int k=i/j;
		} catch (ArithmeticException e) {
           System.out.println("divide by zero exception");
            e.printStackTrace();
			e.getMessage();
		}
		catch (Exception e) {
		
		}
        System.out.println("END");
	}

	
	}
	



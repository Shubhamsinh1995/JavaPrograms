package javaInteviewQue;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the String");
      String original=sc.nextLine();
      String reverse="";
      
      for(int i=original.length()-1;i>=0;i--) {
    	  reverse=reverse+original.charAt(i);
      }
      System.out.println("Reverse of a String is: "+reverse);
      System.out.println("**************************************");
      
      // Palindrome logic
      if(original.equals(reverse)) {
    	  System.out.println("String is palindrome");
      }
      else {
    	  System.out.println("String is not palindrome");
      }
	}

}

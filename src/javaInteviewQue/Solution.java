package javaInteviewQue;

import java.util.Scanner;

public class Solution {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 !=0)
        System.out.println("weird");
        else if(N%2 ==0 && N<=5)
         System.out.println("not weird");
         else if(N%2 ==0 && N>5 && N<=20)
         System.out.println(" weird");
         else if(N%2 ==0 && N>20)
         System.out.println("not weird");
        scanner.close();
}
}
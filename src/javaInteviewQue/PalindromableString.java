package javaInteviewQue;

import java.nio.charset.Charset;
import java.util.Scanner;

public class PalindromableString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s;
		String w="";
		String rw="";
		int l;
		char ch;
		System.out.println("Enter the sentense");
		s=sc.nextLine();
		s=s+" ";
		l=s.length();
		System.out.println("palindrome words are:");
        for(int i=0;i<l;i++) {
        	ch=s.charAt(i);
        	if(ch !=' ') {
        		w=w+ch;
        		rw=ch+rw;
        	}
        	else {
        		if(w.equalsIgnoreCase(rw)) {
        			System.out.println(w);
        		}
        		w="";
        		rw="";
        	}
        }
	}

}

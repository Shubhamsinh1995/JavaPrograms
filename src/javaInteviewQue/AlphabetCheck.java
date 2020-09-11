package javaInteviewQue;

public class AlphabetCheck {

	public static void main(String[] args) {
		
		// Program to check given character is alphabet or not
		
		char c='@';
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println(c +" is an alphabet");
		}
		else
			System.out.println(c +" is not an alphabet");

	}

}

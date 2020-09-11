package javaInteviewQue;

public class ReverseString {
	
	public static String recursiveString(String s) {
		if(s==null || s.length()<1) {
			return s;
		}
		return recursiveString(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
		String s="Baiyas";
		System.out.println("Before reversing string: "+s);
		System.out.println();
		
		System.out.println("After reversing string: "+recursiveString(s));

	}

}

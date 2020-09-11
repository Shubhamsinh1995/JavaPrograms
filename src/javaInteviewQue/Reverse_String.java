package javaInteviewQue;

public class Reverse_String {

	public static void main(String[] args) {
		String str="SHUBHAM";
       System.out.println("before reversing the string: "+str);
       System.out.println();
       
       System.out.println("After reversing the string: "+recursiveString(str));
	}
	public static String recursiveString(String s) {
		if(s==null || s.length()<=1) {
		return s;
		}
		return recursiveString(s.substring(1))+s.charAt(0);
		
	}

}

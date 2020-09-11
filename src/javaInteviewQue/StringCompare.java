package javaInteviewQue;

public class StringCompare {

	public static void main(String[] args) {
		
		String s1="Shubham";
		String s2="Shubham";
		boolean isCompare=false;
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				 isCompare=true;
				 break;
				}
		}
			if(isCompare==true) {
				System.out.println("both Strings are not equal");
			}
			else {
				System.out.println("both Strings are qual");
			}
		
	}

}

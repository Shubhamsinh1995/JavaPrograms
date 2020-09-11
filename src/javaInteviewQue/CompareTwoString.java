package javaInteviewQue;

public class CompareTwoString {

	public static void main(String[] args) {
		
		String str1="shubham";
		String str2="shubham";
		boolean iscompare=false;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				iscompare=false;
				break;
			}
			iscompare=true;
		} 
		System.out.println("both the strings are equal: "+iscompare);
	}

}

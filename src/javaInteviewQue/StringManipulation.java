package javaInteviewQue;

public class StringManipulation {

	public static void main(String[] args) {
		String str="The rains have started slowly slowly";
		String str1="The rains have started slowly slowly";

		System.out.println(str.length());  // length=29
		
		System.out.println(str.charAt(7));  // n
		
		System.out.println(str.indexOf('s'));// first occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s')+1));  // second occurrence of s
		//System.out.println(str.indexOf('s', str.indexOf('s')+1));
		System.out.println(str.lastIndexOf('s'));
		
		System.out.println(str.indexOf("rains")); // it will print starting index of the string
		
		System.out.println(str.indexOf("Hello")); // -1  --> it will not give any exception, it will return -1
		
		// String comparison
		System.out.println(str.equals(str1));
		
		// SubString
		System.out.println(str.substring(5));
		System.out.println(str.substring(0, 9));  // it will take up to 9 character, bcoz it will remove 0 to 8
		
		// trim:
		String s="  Hello World  ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", "")); //
		
		String date="02-04-1995";
		System.out.println(date.replace("-", "/")); // 02/04/1995
		System.out.println();
		
		// split;
		String test=" i am good in selenium";
		 String strval[]=test.split(" "); // split method returns string array
		 for(int i=0;i<strval.length;i++) {
			 System.out.println(strval[i]);
		 }
		 
		 System.out.println();
		 
		 // concatenate
		 String s2="care";
		 System.out.println(s2.concat("s"));
		 
		 String x="Shubham";
		 String y="Baiyas";
		 int a=100;
		 int b=200;
		 
		 System.out.println(x+y);
		 System.out.println(a+b);
		 System.out.println(x+y+a+b);
		 System.out.println(x+y+(a+b));
		 System.out.println(a+b+x+y);
		
	}

}




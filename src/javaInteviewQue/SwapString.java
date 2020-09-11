package javaInteviewQue;

public class SwapString {

	public static void main(String[] args) {
		
     //WAP to swap string without using temp/third varible
		String a="shubham";
		String b="Baiyas";
		System.out.println("Before Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("--------------------------------");
		
		//step 1:  append  a and b
		  a=a+b;   // shubhamBaiyas
		
		//step 2: store initial string a in b
		// b=a.substring(0, a.length()-b.length());
		  b=a.substring(0, a.length()-b.length());
		
		//step 3: store initial b in a
		// a=a.substring(b.length());
		  a=a.substring(b.length());
		 System.out.println("After swapping");
		 System.out.println("a:"+a);
		 System.out.println("b:"+b);
		
		
		
	}

}

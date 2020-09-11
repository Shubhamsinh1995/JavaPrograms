package javaInteviewQue;

public class SwapString2 {

	public static void main(String[] args) {
		
		// Swapping Two Strings without using third variable
		String a="shubham";
		String b="Baiyas";
		System.out.println("before swapping ");
		System.out.println("a="+ a+"    b="+b);
		
		System.out.println("-----------------------------------");
		
		System.out.println("After swapping");
		
		a=a+b;    // shubhamBaiyas
		b=a.substring(0, a.length()-b.length());  //shubham
		a=a.substring(b.length());    //Baiyas
 
		System.out.println("a="+ a+"    b="+b);
	}

}

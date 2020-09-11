package javaInteviewQue;

public class Power {

	public static void main(String[] args) {
		
		
		int base=2;
		int exponent=3;
		int result=1;
		
		while(exponent != 0) {
			result=result*base;
			exponent--;
		}
		System.out.println(result);

		//System.out.println(Math.pow(base, exponent));
	}

}

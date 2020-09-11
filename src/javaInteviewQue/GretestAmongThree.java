package javaInteviewQue;

public class GretestAmongThree {

	public static void main(String[] args) {
		
		int x=400;
		int y=500;
		int z=700;
		
		if(x>y && x>z) {
			System.out.println("x is the gretest");
		}
		else if(y>z) {
			System.out.println("y is the gretest");
		}
		else
			System.out.println("z is the gretest");
	
		System.out.println("-----------------------------------");

	if(x>=y) {
		if(x>=z) {
			System.out.println("x is the gretest");
		}
		else {
			System.out.println("z is the gretest");
		}
	}
	else {
		if(y>=z) {
			System.out.println("y is the gretest");
		}
		else {
			System.out.println("z is the gretest");
		}
	}
}
}
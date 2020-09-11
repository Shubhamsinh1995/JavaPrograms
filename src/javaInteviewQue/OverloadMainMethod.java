package javaInteviewQue;

public class OverloadMainMethod {

	// Can we overload main method --> Yes, we can overload the main method
	public static void main(String[] args) {
		System.out.println("maim method 1");
        main("Shubham"); // main is static method so we dont need object to  call main()
        main(10);
        main(2,5);
	}

	public static void main(String args) {
		System.out.println("maim method 2");

	}
	public static void main(int a) {
		System.out.println("maim method 3");

	}
	public static void main(int a, int b) {
		System.out.println("maim method 4");

	}
}

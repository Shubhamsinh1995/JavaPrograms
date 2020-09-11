package oops_Concept;

public class StaticAndNon_Static {
	
	String name="ashoka"; // non-static Global variables
	static int age=25;    // static global variable

	public static void main(String[] args) {
		
		// How to call static methods and variables
		//1. By direct calling
		sum();
		System.out.println(age);
		
		//2. By using classname
		StaticAndNon_Static.sum();

		System.out.println(StaticAndNon_Static.age);
	}
	
	//  ***** We can call static method and var by using object of class but this is not right way
	
	public void sendMail() {
		System.out.println(" This is send mail method");
	}
	
	public static void sum() {
		System.out.println("This is sum method");
	}

}

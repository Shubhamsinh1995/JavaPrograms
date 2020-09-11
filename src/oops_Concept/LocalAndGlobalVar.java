package oops_Concept;

public class LocalAndGlobalVar {
	
	// global var--class var
	String name="Shubham";
	int age=25;

	public static void main(String[] args)
	{
		int i=10;   // This is a local variable of main() method
		System.out.println(i);
		
		LocalAndGlobalVar obj=new LocalAndGlobalVar();
		// as soon as object of a class created, copy of Global var and non static method will be given to Object
		
	 System.out.println(obj.name); // to access the global var of class, We need to create object of that class
	 System.out.println(obj.age);
	}
	
	public void sum() {
		
		int i=15;  // This is local variable of sum() method 
		int j=20;
		int age=25;  // local var of sum() method 
	}

}

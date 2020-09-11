package methodsInJava;

public class JavaMethods {

	// return type of main method is void because main method does not return any value 
	public static void main(String[] args) {
		JavaMethods obj=new JavaMethods();
		// After this line one object will be created, obj is a reference variable , referencing to object
		// After creating the object, the copy of all non-static methods will be given to the Object
		
		
        obj.test();
        
        int add=obj.sum();
        System.out.println(add);
        System.out.println();
        
        String str=obj.string();
        System.out.println(str);
        System.out.println();
        
        obj.sayHello("shubham");
        
        int div=obj.division(25, 5);
        System.out.println(div);
	}
	
	// ***** non-static methods******
	
	// Method with no input and no output
	// return type of this method is Void
	public void test() {
		System.out.println("selenium test");
	}
	
	
	// Method with no input abs some output
	// return type of this method is INT
	public int sum() {   
		int a=20;
		int b=10;
		int c=a+b;
		return c;
		}
	
	//  this is also Method with no input and some output
	// return type of this method is String
	public String string() {
		System.out.println(" string method ");
		String s="selenium";
		return s;
		}
	
	// Method with some input and no output
	 public void sayHello(String name) {
		 System.out.println("Hello " + name);
	 }
	 
	 
	//Method with some input and some output
	// return type of this method is INT
	public int division(int x, int y) {
	 int result=x/y;
	 return result;
	}

}

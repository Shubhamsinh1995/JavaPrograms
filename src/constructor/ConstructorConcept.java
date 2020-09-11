// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");

package constructor;

public class ConstructorConcept {
	
	
	// this is called constructor overloading
 public ConstructorConcept() {
	 System.out.println("Default.. Constructor");
 }
   
 public ConstructorConcept(int a) {
	 System.out.println("1 parameter constructor");
	 System.out.println(a);
 }
 
 public ConstructorConcept(int a, int b) {
	 System.out.println("2 parameter constructor");
	 System.out.println(a+" "+b);
 }
 
 
	public static void main(String[] args) {
		
		ConstructorConcept cs=new ConstructorConcept();
		ConstructorConcept cs1=new ConstructorConcept(10);
		ConstructorConcept cs2=new ConstructorConcept(5,8);
		
		Constructornitialization ci=new Constructornitialization("shubham", 25, "QA");
		System.out.println(ci.name+" "+ci.age+" "+ci.dept);
		//System.out.println(ci.age);
		//System.out.println(ci.dept);
	}

}

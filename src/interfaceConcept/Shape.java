package interfaceConcept;

public abstract class Shape {
	Shape(){
		System.out.println("Shape..constructor");
	}
	static int paint;
	String color;
    abstract void drawing();
    public void fill() {
    	System.out.println("shape...fill method");
    	
    }
    
    //we cannot create the object of abstract class
    // in abstract class there are abstract and non-abstract methods
    // also there are static and non-static vars are allowed in abstract class
    // no 100% abstraction i.e. 0-100% abstraction called partial abstraction
    // cannot overide the final method of abstract class
    
    //when we call the constructor by creating object of child class then first  base class constructor is called and then child class constructor is called
}

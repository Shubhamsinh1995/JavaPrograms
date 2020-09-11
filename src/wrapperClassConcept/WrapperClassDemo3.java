package wrapperClassConcept;

public class WrapperClassDemo3 {

	// Boxing and Unboxing  Concept
	public static void main(String[] args) {
		
		// AutoBoxing
		int a=10;
		Integer b=a;
		System.out.println("AutoBoxing "+b);
		System.out.println("-------------");
		
		// Boxing
		int x=50;
		Integer y=Integer.valueOf(x);
        System.out.println("Boxing "+x);
		System.out.println("-------------");

        // Unboxing
        Integer k=100;
        int i=k.intValue();
        System.out.println("Unboxing "+i);
		System.out.println("-------------");

		
		// Auto Unboxing
		Integer marks=80;
		int newmarks=marks;
		System.out.println("Auto Unboxing "+newmarks);
	}

}

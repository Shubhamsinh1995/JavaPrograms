package staticKeywordConcept;

public class MyDemo  {

	public static void main(String[] args) {
		
       // A obj=new A();
		//for static method  and instance variable  no need to create the object , values are directly fetched using class name
         System.out.println(A.i);
        A.show();
	}

	 
 }
    class A{
	 static int i=5;
	 public  static void show() {
		 System.out.println("this is show method");
		 //System.out.println(i);
	 }
}

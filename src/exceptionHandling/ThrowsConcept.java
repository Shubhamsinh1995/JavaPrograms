package exceptionHandling;

public class ThrowsConcept {

	public static void main(String[] args) throws Exception{
    
		ThrowsConcept th=new ThrowsConcept();
		th.sum();
		System.out.println("ABC");
	}
     public void sum() {
    	 try {
    	 div();
    	 }catch(Exception e) {
    		 
    	 }
     }
     public void div() {
    	 int i=9/0;  // exception line
     }
}
